package GUI;

import Logica.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class GraficosEstadisticos extends javax.swing.JFrame {
    
    private Tienda tienda;
    private JPanel panelGrafico;
    
    public GraficosEstadisticos(Tienda tienda) {
        initComponents();
        this.tienda = tienda;
        this.setTitle("Gráficos Estadísticos");
        configurarVentana();
    }
    
    private void configurarVentana() {
        // Panel principal con BorderLayout
        getContentPane().setLayout(new BorderLayout());
        
        // Panel superior para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(new Color(240, 240, 240));
        
        // Crear botones
        JButton btnProductosPorMarca = new JButton("Productos por Marca");
        JButton btnProductosPorResolucion = new JButton("Productos por Resolución");
        JButton btnTiposProductos = new JButton("Televisores vs Proyectores");
        
        // Estilo de botones
        configurarBoton(btnProductosPorMarca);
        configurarBoton(btnProductosPorResolucion);
        configurarBoton(btnTiposProductos);
        
        // Agregar listeners
        btnProductosPorMarca.addActionListener(e -> mostrarGraficoMarcas());
        btnProductosPorResolucion.addActionListener(e -> mostrarGraficoResolucion());
        btnTiposProductos.addActionListener(e -> mostrarGraficoTipos());
        
        // Agregar botones al panel
        panelBotones.add(btnProductosPorMarca);
        panelBotones.add(btnProductosPorResolucion);
        panelBotones.add(btnTiposProductos);
        
        // Panel para el gráfico
        panelGrafico = new JPanel();
        panelGrafico.setLayout(new BorderLayout());
        panelGrafico.setBackground(Color.WHITE);
        
        // Agregar paneles a la ventana
        add(panelBotones, BorderLayout.NORTH);
        add(panelGrafico, BorderLayout.CENTER);
        
        // Configurar ventana
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    private void configurarBoton(JButton boton) {
        boton.setBackground(new Color(70, 130, 180));
        boton.setForeground(Color.WHITE);
        boton.setFocusPainted(false);
        boton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        boton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
    }
    
    private void mostrarGraficoMarcas() {
        // Contar productos por marca
        Map<String, Integer> productosPorMarca = new HashMap<>();
        for (Producto p : tienda.getProductos()) {
            String marca = p.getMarca();
            productosPorMarca.put(marca, productosPorMarca.getOrDefault(marca, 0) + 1);
        }
        
        // Crear dataset para el gráfico de torta
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Map.Entry<String, Integer> entry : productosPorMarca.entrySet()) {
            dataset.setValue(entry.getKey(), entry.getValue());
        }
        
        // Crear gráfico
        JFreeChart chart = ChartFactory.createPieChart(
            "Distribución de Productos por Marca",
            dataset,
            true,
            true,
            false
        );
        
        actualizarGrafico(chart);
    }
    
    private void mostrarGraficoResolucion() {
        // Contar productos por resolución
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Map<String, Integer> productosPorResolucion = new HashMap<>();
        
        for (Producto p : tienda.getProductos()) {
            String resolucion = p.getResolucion();
            productosPorResolucion.put(resolucion, 
                productosPorResolucion.getOrDefault(resolucion, 0) + 1);
        }
        
        // Agregar datos al dataset
        for (Map.Entry<String, Integer> entry : productosPorResolucion.entrySet()) {
            dataset.addValue(entry.getValue(), "Productos", entry.getKey());
        }
        
        // Crear gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart(
            "Productos por Resolución",
            "Resolución",
            "Cantidad",
            dataset,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        );
        
        actualizarGrafico(chart);
    }
    
    private void mostrarGraficoTipos() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        int televisores = tienda.cantidadTelevisores();
        int proyectores = tienda.cantidadProyectores();
        
        dataset.addValue(televisores, "Cantidad", "Televisores");
        dataset.addValue(proyectores, "Cantidad", "Proyectores");
        
        JFreeChart chart = ChartFactory.createBarChart(
            "Distribución de Tipos de Productos",
            "Tipo de Producto",
            "Cantidad",
            dataset,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        );
        
        actualizarGrafico(chart);
    }
    
    private void actualizarGrafico(JFreeChart chart) {
        panelGrafico.removeAll();
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(700, 500));
        panelGrafico.add(chartPanel);
        panelGrafico.revalidate();
        panelGrafico.repaint();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }
}
