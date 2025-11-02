package GUI;

import Logica.Tienda;

public class DatosRecolectados extends javax.swing.JFrame {
    
    private Tienda tienda;
    
    public DatosRecolectados(Tienda tienda) {
        initComponents();
        this.tienda = tienda;
        mostrarDatos();
    }
    
    private void mostrarDatos() {
        int totalProductos = tienda.cantidadTotalProductos();
        int televisores = tienda.cantidadTelevisores();
        int proyectores = tienda.cantidadProyectores();
        double porcentajeTelevisores = tienda.porcentajeTelevisores();
        double precioPromedioSamsung = tienda.promedioPorMarca("Samsung");  // Cambiado a "Samsung"
        int totalUnidades = tienda.totalUnidadesDisponibles();
        
        StringBuilder resultado = new StringBuilder();
        resultado.append("═══════════════════════════════════════════════\n");
        resultado.append("          INFORME DE LA TIENDA\n");
        resultado.append("═══════════════════════════════════════════════\n\n");
        
        // Sección 1: Resumen de Productos
        resultado.append("INVENTARIO DE PRODUCTOS\n");
        resultado.append("──────────────────────────────────\n");
        resultado.append(String.format("Total de productos registrados: %d\n", totalProductos));
        resultado.append(String.format("• Televisores en catálogo:    %d\n", televisores));
        resultado.append(String.format("• Proyectores en catálogo:    %d\n", proyectores));
        resultado.append(String.format("• Total unidades disponibles:  %d\n\n", totalUnidades));
        
        // Sección 2: Estadísticas
        resultado.append("ANÁLISIS ESTADÍSTICO\n");
        resultado.append("──────────────────────────────────\n");
        if (totalProductos > 0) {
            resultado.append(String.format("Distribución de Productos:\n"));
            resultado.append(String.format("• Televisores:  %.1f%%\n", porcentajeTelevisores));
            resultado.append(String.format("• Proyectores:  %.1f%%\n", 100 - porcentajeTelevisores));
        } else {
            resultado.append("Distribución de Productos:\n");
            resultado.append("No hay productos registrados en el sistema\n");
        }
        resultado.append("\n");
        
        resultado.append("Precio promedio productos Samsung:\n");
        boolean hayProductosSamsung = false;
        double sumaPreciosSamsung = 0;
        int contadorSamsung = 0;

        for (Logica.Producto p : tienda.getProductos()) {
            if (p.getMarca() != null && p.getMarca().trim().equalsIgnoreCase("Samsung")) {
                hayProductosSamsung = true;
                sumaPreciosSamsung += p.getPrecio();
                contadorSamsung++;
            }
        }

        if (hayProductosSamsung) {
            double promedioCalculado = sumaPreciosSamsung / contadorSamsung;
            resultado.append(String.format("$ %,.2f (Productos Samsung: %d)\n", promedioCalculado, contadorSamsung));
        } else {
            resultado.append("No hay productos Samsung registrados\n");
        }
        resultado.append("\n");
        
        // Sección 3: Productos Destacados
        resultado.append("PRODUCTOS DE MAYOR VALOR\n");
        resultado.append("──────────────────────────────────\n");
        java.util.ArrayList<Logica.Producto> productosMayorPrecio = tienda.productosConMayorPrecio();
        if (!productosMayorPrecio.isEmpty()) {
            for (Logica.Producto p : productosMayorPrecio) {
                resultado.append(String.format("Código: %s\n", p.getCodigo()));
                resultado.append(String.format("Marca:  %s\n", p.getMarca()));
                resultado.append(String.format("Precio: $%,.2f\n", p.getPrecio()));
                resultado.append("──────────────────────────────────\n");
            }
        } else {
            resultado.append("No hay productos registrados para mostrar\n");
            resultado.append("──────────────────────────────────\n");
        }
        
        // Alerta de stock bajo si existe
        java.util.ArrayList<Logica.Producto> bajoStock = tienda.getProductosBajoStock();
        if (!bajoStock.isEmpty()) {
            resultado.append("\nALERTA DE STOCK BAJO\n");
            resultado.append("──────────────────────────────────\n");
            for (Logica.Producto p : bajoStock) {
                resultado.append(String.format("• %s (Código: %s)\n", p.getReferencia(), p.getCodigo()));
                resultado.append(String.format("  Marca: %s\n", p.getMarca()));
                resultado.append(String.format("  Stock actual: %d unidades\n\n", p.getCantidadDisponible()));
            }
        }
        
        txtResultados.setText(resultado.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        setTitle("Informe de la Tienda");
        setResizable(false);
        
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(new java.awt.Color(240, 240, 240));
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();
        btnCerrar = new javax.swing.JButton();
        
        // Configuración del área de texto
        txtResultados.setEditable(false);
        txtResultados.setColumns(20);
        txtResultados.setRows(5);
        txtResultados.setFont(new java.awt.Font("Consolas", 0, 14));
        txtResultados.setBackground(new java.awt.Color(252, 252, 252));
        txtResultados.setForeground(new java.awt.Color(51, 51, 51));
        txtResultados.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jScrollPane1.setViewportView(txtResultados);
        
        // Estilo del botón cerrar
        btnCerrar.setText("Cerrar Informe");
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 0, 14));
        btnCerrar.setBackground(new java.awt.Color(70, 130, 180));
        btnCerrar.setForeground(java.awt.Color.WHITE);
        btnCerrar.setFocusPainted(false);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCerrar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtResultados;
    // End of variables declaration//GEN-END:variables
}
