/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Clases.Fecha;
import static Clases.Fecha.DIA;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Puentes Vargas Alfredo - 22130803
 */
public class Proveedores extends javax.swing.JFrame implements Fecha{

    //DECLARACIÓN DE OBJETOS Y VARIABLES
    DecimalFormat df = new DecimalFormat("#.##");
    
    //MÉTODOS
    public double pagoProveedor(int articulos, int cantPagar){
        double pago = 0.0;
        if(DIA == 27 ){    
            if(articulos > 10){
                pago = cantPagar - (cantPagar * 0.1);
                JOptionPane.showMessageDialog(null, "Se ha realizado un 10% de descuento a su cantidad a pagar");
            }
            else
                pago = cantPagar;
        }
        else
            JOptionPane.showMessageDialog(null, "Sólo se puede realizar el pago los dias 27 de cada mes");
        return pago;
    }
    
    /**
     * Creates new form Proveedores
     */
    public Proveedores() {
        initComponents();
        
        //CAMBIAR EL COLOR DE FONDO DEL FORMULARIO
        getContentPane().setBackground(Color.BLACK);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSpinnerArticulos = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jTextPagar = new javax.swing.JTextField();
        jButtonPagar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jButtonAlta = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonPrestamo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PAGAR A LOS PROVEEDORES");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NÚMERO DE ARTÍCULOS:");

        jSpinnerArticulos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSpinnerArticulos.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        jSpinnerArticulos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSpinnerArticulos.setOpaque(true);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CANTIDAD A PAGAR:");

        jTextPagar.setBackground(new java.awt.Color(255, 255, 255));
        jTextPagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextPagar.setForeground(new java.awt.Color(0, 0, 0));

        jButtonPagar.setBackground(new java.awt.Color(0, 0, 255));
        jButtonPagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonPagar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPagar.setText("PAGAR A LOS PROVEEDORES");
        jButtonPagar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButtonPagar.setOpaque(true);
        jButtonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("TOTAL A PAGAR:");

        jLabelTotal.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTotal.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotal.setText("$0.00");
        jLabelTotal.setOpaque(true);

        jButtonAlta.setBackground(new java.awt.Color(32, 108, 193));
        jButtonAlta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonAlta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlta.setText("DAR DE ALTA");
        jButtonAlta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButtonAlta.setOpaque(true);
        jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaActionPerformed(evt);
            }
        });

        jButtonSalir.setBackground(new java.awt.Color(119, 0, 0));
        jButtonSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("SALIR");
        jButtonSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButtonSalir.setOpaque(true);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonPrestamo.setBackground(new java.awt.Color(32, 108, 193));
        jButtonPrestamo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPrestamo.setText("SOLICITAR PRÉSTAMO");
        jButtonPrestamo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButtonPrestamo.setOpaque(true);
        jButtonPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextPagar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(61, 61, 61)
                                .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPagar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jSpinnerArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButtonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabelTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagarActionPerformed

        //BOTÓN PAGAR
        //Leer los datos ingresados
        int articulos = Integer.parseInt(this.jSpinnerArticulos.getValue().toString());
        int pagar = Integer.parseInt(this.jTextPagar.getText());
        
        //Utilizar el método correspondiente e imprimir los resultados
        this.jLabelTotal.setText("$" + df.format(this.pagoProveedor(articulos, pagar)));

    }//GEN-LAST:event_jButtonPagarActionPerformed

    private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaActionPerformed

        //BOTÓN ALTA
        AltaEmpresa oAE = new AltaEmpresa();
        oAE.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButtonAltaActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed

        //BOTÓN SALIR
        this.dispose();

    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrestamoActionPerformed

        //BOTÓN PRÉSTAMO
        Prestamos oP = new Prestamos();
        oP.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButtonPrestamoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonPagar;
    private javax.swing.JButton jButtonPrestamo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JSpinner jSpinnerArticulos;
    private javax.swing.JTextField jTextPagar;
    // End of variables declaration//GEN-END:variables
}