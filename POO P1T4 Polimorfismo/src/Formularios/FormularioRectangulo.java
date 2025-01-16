/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Clases.Distancia;
import Clases.Rectangulo;
import Clases.Trapecio;
import javax.swing.JOptionPane;

/**
 *
 * @author AA729
 */
public class FormularioRectangulo extends javax.swing.JFrame {
    
    private Rectangulo oRec;
    private Trapecio oTrap;
    
    
    /**
     * Creates new form FormularioFiguras
     */
    public FormularioRectangulo() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinnerX1 = new javax.swing.JSpinner();
        jSpinnerY1 = new javax.swing.JSpinner();
        jSpinnerX2 = new javax.swing.JSpinner();
        jSpinnerY2 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jSpinnerX3 = new javax.swing.JSpinner();
        jSpinnerY3 = new javax.swing.JSpinner();
        jSpinnerX4 = new javax.swing.JSpinner();
        jSpinnerY4 = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButtonCrearRect = new javax.swing.JButton();
        jButtonAreaRect = new javax.swing.JButton();
        jLabelAreaRect = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("RECTÁNGULO");

        jLabel2.setText("BASE");

        jLabel3.setText("X1:");

        jLabel4.setText("Y1:");

        jLabel5.setText("X2:");

        jLabel6.setText("Y2:");

        jSpinnerX1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        jSpinnerX1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerX1StateChanged(evt);
            }
        });

        jSpinnerY1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        jSpinnerY1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerY1StateChanged(evt);
            }
        });

        jSpinnerX2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jSpinnerY2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jLabel7.setText("ALTURA");

        jSpinnerX3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jSpinnerY3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jSpinnerX4.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jSpinnerY4.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jLabel8.setText("X3:");

        jLabel9.setText("Y3:");

        jLabel10.setText("X4:");

        jLabel11.setText("Y4:");

        jButtonCrearRect.setText("CREAR");
        jButtonCrearRect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearRectActionPerformed(evt);
            }
        });

        jButtonAreaRect.setText("ÁREA");
        jButtonAreaRect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAreaRectActionPerformed(evt);
            }
        });

        jLabelAreaRect.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAreaRect.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerY4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerX4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerY3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerX3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCrearRect)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAreaRect)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAreaRect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAreaRect, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jSpinnerX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jSpinnerY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jSpinnerX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jSpinnerY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jSpinnerX3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jSpinnerY3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jSpinnerX4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jSpinnerY4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCrearRect)
                            .addComponent(jButtonAreaRect))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrearRectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearRectActionPerformed
        
        Distancia oDist;
        double x1, y1, x2, y2, x3, y3, x4, y4;
        double base, altura;
        
        x1 = Double.parseDouble(jSpinnerX1.getValue().toString());
        y1 = Double.parseDouble(jSpinnerY1.getValue().toString());
        
        x2 = Double.parseDouble(jSpinnerX2.getValue().toString());
        y2 = Double.parseDouble(jSpinnerY2.getValue().toString());
        
        x3 = Double.parseDouble(jSpinnerX3.getValue().toString());
        y3 = Double.parseDouble(jSpinnerY3.getValue().toString());
        
        x4 = Double.parseDouble(jSpinnerX4.getValue().toString());
        y4 = Double.parseDouble(jSpinnerY4.getValue().toString());
        
        //Crear los objetos distancia para la base
        oDist = new Distancia(x1, y1, x2, y2);
        base = oDist.distanciaEntreDosPuntos();
        
        oDist = new Distancia(x3, y3, x4, y4);
        altura = oDist.distanciaEntreDosPuntos();
        
        //Crear el objeto Rectangulo
        oRec = new Rectangulo(base, altura);
        JOptionPane.showMessageDialog(null, "La figura Rectángulo ha sido creada exitosamente");
                
    }//GEN-LAST:event_jButtonCrearRectActionPerformed

    private void jButtonAreaRectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAreaRectActionPerformed
        
        this.jLabelAreaRect.setText(oRec.calcularArea()+"");
        
    }//GEN-LAST:event_jButtonAreaRectActionPerformed

    private void jSpinnerX1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerX1StateChanged
        
        this.jSpinnerX3.setValue(this.jSpinnerX1.getValue());
        
    }//GEN-LAST:event_jSpinnerX1StateChanged

    private void jSpinnerY1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerY1StateChanged
        
        this.jSpinnerY3.setValue(this.jSpinnerY1.getValue());
        
    }//GEN-LAST:event_jSpinnerY1StateChanged

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(FormularioRectangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioRectangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioRectangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioRectangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioRectangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAreaRect;
    private javax.swing.JButton jButtonCrearRect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAreaRect;
    private javax.swing.JSpinner jSpinnerX1;
    private javax.swing.JSpinner jSpinnerX2;
    private javax.swing.JSpinner jSpinnerX3;
    private javax.swing.JSpinner jSpinnerX4;
    private javax.swing.JSpinner jSpinnerY1;
    private javax.swing.JSpinner jSpinnerY2;
    private javax.swing.JSpinner jSpinnerY3;
    private javax.swing.JSpinner jSpinnerY4;
    // End of variables declaration//GEN-END:variables
}