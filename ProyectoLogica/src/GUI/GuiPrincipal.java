
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
        jMenu2 = new javax.swing.JMenu();
        registrarTelevisor = new javax.swing.JMenuItem();
        registrarCliente = new javax.swing.JMenuItem();
        registrarProyector = new javax.swing.JMenuItem();

        registrarCompra = new javax.swing.JMenuItem();

        jMenuItem2 = new javax.swing.JMenuItem();


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

        jMenu2.setText("Menu");

        registrarTelevisor.setText(" Registrar Televisor");
        registrarTelevisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarTelevisorActionPerformed(evt);
            }
        });
        jMenu2.add(registrarTelevisor);

        registrarCliente.setText("Registrar Cliente");
        registrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarClienteActionPerformed(evt);
            }
        });
        jMenu2.add(registrarCliente);

        registrarProyector.setText(" Registrar Proyector");
        registrarProyector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarProyectorActionPerformed(evt);
            }
        });
        jMenu2.add(registrarProyector);

        registrarCompra.setText(" Registrar Compra");
        registrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarCompraActionPerformed(evt);
            }
        });
        jMenu2.add(registrarCompra);

        jMenuItem2.setText("Datos Recolectados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);


        jMenuBar1.add(jMenu2);

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
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new DatosRecolectados().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem registrarCliente;
    private javax.swing.JMenuItem registrarCompra;
    private javax.swing.JMenuItem registrarProyector;
    private javax.swing.JMenuItem registrarTelevisor;
    // End of variables declaration//GEN-END:variables
}
