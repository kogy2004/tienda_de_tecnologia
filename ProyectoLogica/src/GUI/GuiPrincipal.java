
package GUI;


import Logica.Tienda;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.text.*;
import javax.swing.table.DefaultTableModel;

public class GuiPrincipal extends javax.swing.JFrame {
   private Tienda tienda = new Tienda();
   
    public GuiPrincipal() {
        initComponents();
          
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        
        // Menú de Registros
        menuRegistros = new javax.swing.JMenu();
        menuRegistros.setText("Registros");
        
        // Submenú de Productos
        menuProductos = new javax.swing.JMenu();
        menuProductos.setText("Productos");
        
        registrarTelevisor = new javax.swing.JMenuItem();
        registrarTelevisor.setText("Registrar Televisor");
        menuProductos.add(registrarTelevisor);
        
        registrarProyector = new javax.swing.JMenuItem();
        registrarProyector.setText("Registrar Proyector");
        menuProductos.add(registrarProyector);
        
        menuRegistros.add(menuProductos);
        
        // Opción de Clientes
        registrarCliente = new javax.swing.JMenuItem();
        registrarCliente.setText("Registrar Cliente");
        menuRegistros.add(registrarCliente);
        
        // Menú de Ventas
        menuVentas = new javax.swing.JMenu();
        menuVentas.setText("Ventas");
        
        registrarCompra = new javax.swing.JMenuItem();
        registrarCompra.setText("Realizar Compra");
        menuVentas.add(registrarCompra);
        
        // Menú de Informes
        menuInformes = new javax.swing.JMenu();
        menuInformes.setText("Informes");
        
        menuItemInformes = new javax.swing.JMenuItem();
        menuItemInformes.setText("Ver Estadísticas");
        menuInformes.add(menuItemInformes);
        
        menuItemGraficos = new javax.swing.JMenuItem();
        menuItemGraficos.setText("Ver Gráficos");
        menuInformes.add(menuItemGraficos);
        
        // Agregar menús a la barra
        jMenuBar1.add(menuRegistros);
        jMenuBar1.add(menuVentas);
        jMenuBar1.add(menuInformes);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("BIENVENIDOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(jLabel1)
                .addContainerGap(395, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addContainerGap(501, Short.MAX_VALUE))
        );

        // Agregar ActionListeners
        registrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarClienteActionPerformed(evt);
            }
        });

        registrarTelevisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarTelevisorActionPerformed(evt);
            }
        });

        registrarProyector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarProyectorActionPerformed(evt);
            }
        });

        registrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarCompraActionPerformed(evt);
            }
        });

        menuItemInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInformesActionPerformed(evt);
            }
        });

        menuItemGraficos.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarGraficosActionPerformed(evt);
            }
         });

        setJMenuBar(jMenuBar1);

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

    private void registrarTelevisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarTelevisorActionPerformed
       new RegistrarTelevisor(tienda).setVisible(true);
    }//GEN-LAST:event_registrarTelevisorActionPerformed
        
    private void registrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarClienteActionPerformed
        new RegistrarClientes(tienda).setVisible(true);
    }//GEN-LAST:event_registrarClienteActionPerformed

    private void registrarProyectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarProyectorActionPerformed
       new RegistrarProyector(tienda).setVisible(true);
    }//GEN-LAST:event_registrarProyectorActionPerformed

    private void registrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarCompraActionPerformed
        new RegistrarCompras(tienda).setVisible(true);
    }//GEN-LAST:event_registrarCompraActionPerformed

    private void menuItemInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInformesActionPerformed
        new DatosRecolectados(tienda).setVisible(true);
    }//GEN-LAST:event_menuItemInformesActionPerformed

    private void mostrarGraficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarGraficosActionPerformed
        new GraficosEstadisticos(tienda).setVisible(true);
    }//GEN-LAST:event_mostrarGraficosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuRegistros;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenu menuVentas;
    private javax.swing.JMenu menuInformes;
    private javax.swing.JMenuItem menuItemInformes;
    private javax.swing.JMenuItem menuItemGraficos;
    private javax.swing.JMenuItem registrarCliente;
    private javax.swing.JMenuItem registrarCompra;
    private javax.swing.JMenuItem registrarProyector;
    private javax.swing.JMenuItem registrarTelevisor;
    // End of variables declaration//GEN-END:variables
}
