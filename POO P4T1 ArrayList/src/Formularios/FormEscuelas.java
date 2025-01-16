/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Clases.Educacion;
import Clases.Escuela;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AA729
 */
public class FormEscuelas extends javax.swing.JFrame {
    //ATRIBUTO
    private Escuela oEsc;
    private Educacion oEdu;
    private int indice=-1;
    
    /**
     * Creates new form FormEscuelas
     */
    public FormEscuelas() {
        initComponents();
        oEdu = new Educacion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAleatorio = new javax.swing.JTable();
        jButtonAleatorio = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMostrar = new javax.swing.JTable();
        jButtonGuardar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableModificar = new javax.swing.JTable();
        jButtonModificar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonTotales = new javax.swing.JButton();
        jLabelTPublicas = new javax.swing.JLabel();
        jLabelTPrivadas = new javax.swing.JLabel();
        jButtonReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableAleatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "NUMERO", "NOMBRE", "NUM ALUMNOS", "TIPO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableAleatorio);

        jButtonAleatorio.setBackground(new java.awt.Color(0, 0, 255));
        jButtonAleatorio.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButtonAleatorio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAleatorio.setText("ALEATORIO");
        jButtonAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAleatorioActionPerformed(evt);
            }
        });

        jTableMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "NUMERO", "NOMBRE", "NUM ALUMNOS", "TIPO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMostrarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableMostrar);

        jButtonGuardar.setBackground(new java.awt.Color(0, 0, 255));
        jButtonGuardar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jTableModificar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "NUMERO", "NOMBRE", "NUM ALUMNOS", "TIPO"
            }
        ));
        jScrollPane3.setViewportView(jTableModificar);

        jButtonModificar.setBackground(new java.awt.Color(0, 0, 255));
        jButtonModificar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButtonModificar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificar.setText("MODIFICAR");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(0, 0, 255));
        jButtonEliminar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("TOTAL ESC. PUBLICAS:");

        jLabel2.setText("TOTAL ESC. PRIVADAS:");

        jButtonTotales.setBackground(new java.awt.Color(0, 0, 255));
        jButtonTotales.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButtonTotales.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTotales.setText("TOTALES");
        jButtonTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTotalesActionPerformed(evt);
            }
        });

        jLabelTPublicas.setBackground(new java.awt.Color(0, 204, 204));
        jLabelTPublicas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTPublicas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTPublicas.setOpaque(true);

        jLabelTPrivadas.setBackground(new java.awt.Color(0, 204, 204));
        jLabelTPrivadas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTPrivadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTPrivadas.setOpaque(true);

        jButtonReiniciar.setBackground(new java.awt.Color(0, 0, 255));
        jButtonReiniciar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButtonReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReiniciar.setText("REINICIAR");
        jButtonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonTotales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(163, 163, 163)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelTPublicas, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addComponent(jLabelTPrivadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jButtonAleatorio)
                        .addGap(43, 43, 43)
                        .addComponent(jButtonGuardar)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAleatorio)
                    .addComponent(jButtonGuardar))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTPublicas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonModificar)
                        .addComponent(jButtonEliminar)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonTotales)
                        .addComponent(jButtonReiniciar))
                    .addComponent(jLabelTPrivadas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarJTable(){
        this.jTableModificar.setValueAt("", 0, 0);
        this.jTableModificar.setValueAt("", 0, 1);
        this.jTableModificar.setValueAt("", 0, 2);
        this.jTableModificar.setValueAt("", 0, 3);
    }
    
    private void jButtonAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAleatorioActionPerformed
        oEsc = new Escuela();
        oEsc.aleatorioEscuela(jTableAleatorio);
        
    }//GEN-LAST:event_jButtonAleatorioActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        int numero = Integer.parseInt(jTableAleatorio.getValueAt(0, 0).toString());
        String nombre = jTableAleatorio.getValueAt(0, 1).toString();
        int numAlumno = Integer.parseInt(jTableAleatorio.getValueAt(0, 2).toString());
        char tipoEsc = jTableAleatorio.getValueAt(0, 3).toString().charAt(0);
        
        oEsc = new Escuela(numero, nombre, numAlumno, tipoEsc);
        
        oEdu.guardarEscuela(oEsc);
        oEdu.mostrarArrayList(jTableMostrar);
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTableMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMostrarMouseClicked
        if(evt.getClickCount()>0){
            jTableModificar.setValueAt(jTableMostrar.getValueAt(jTableMostrar.getSelectedRow(), 0), 0, 0);
            jTableModificar.setValueAt(jTableMostrar.getValueAt(jTableMostrar.getSelectedRow(), 1), 0, 1);
            jTableModificar.setValueAt(jTableMostrar.getValueAt(jTableMostrar.getSelectedRow(), 2), 0, 2);
            jTableModificar.setValueAt(jTableMostrar.getValueAt(jTableMostrar.getSelectedRow(), 3), 0, 3);
            indice = jTableMostrar.getSelectedRow();
        }
    }//GEN-LAST:event_jTableMostrarMouseClicked

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        if(indice>-1){
            int numero = Integer.parseInt(jTableModificar.getValueAt(0, 0).toString());
            String nombre = jTableModificar.getValueAt(0, 1).toString();
            int numAlumno = Integer.parseInt(jTableModificar.getValueAt(0, 2).toString());
            char tipoEsc = jTableModificar.getValueAt(0, 3).toString().charAt(0);
        
            //Crear el objeto a reemplazaren la posicion indice del ArrayList
            oEsc = new Escuela(numero, nombre, numAlumno, tipoEsc);
        
            //Mandar llamar al método modificarEscuela
            oEdu.modificarEscuela(oEsc, indice);
            
            //Mandar llamar al método mostrarArayList para ver la modificación
            oEdu.mostrarArrayList(jTableMostrar);
            
            //LImpiar la JTableModificar
            this.limpiarJTable();
        }
        else
            JOptionPane.showMessageDialog(rootPane, "No hay datos en una");
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        if(indice>-1){
            if(JOptionPane.showConfirmDialog(rootPane, "¿Estás seguro que quieres eliminar la escuela?")==0){ //0=si, 1=no, 2=cancelar
                oEdu.eliminarEscuela(indice);
                oEdu.mostrarArrayList(jTableMostrar);
                
                //LImpiar la JTableModificar
                this.limpiarJTable();
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Necesitas seleccionar la escuela a eliminar");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTotalesActionPerformed
        oEdu.totalEscuelas(jLabelTPublicas, jLabelTPrivadas);
    }//GEN-LAST:event_jButtonTotalesActionPerformed

    private void jButtonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReiniciarActionPerformed
        //Volver a crear el objeto oEdu
        oEdu = new Educacion();
        
        //Limpiar la tabla jTableAleatorio
        DefaultTableModel modeloA = (DefaultTableModel) jTableAleatorio.getModel();
        modeloA.setRowCount(0);
        modeloA.setRowCount(1);
        
        //Limpiar la tabla jTableMostrar
        DefaultTableModel modeloM = (DefaultTableModel) jTableMostrar.getModel();
        modeloM.setRowCount(0);
        
        //Limpiar la tabla jTableModificar
        limpiarJTable();
        
        //Limpiar las jLabels
        this.jLabelTPublicas.setText("");
        this.jLabelTPrivadas.setText("");
    }//GEN-LAST:event_jButtonReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(FormEscuelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEscuelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEscuelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEscuelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEscuelas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAleatorio;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JButton jButtonTotales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTPrivadas;
    private javax.swing.JLabel jLabelTPublicas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableAleatorio;
    private javax.swing.JTable jTableModificar;
    private javax.swing.JTable jTableMostrar;
    // End of variables declaration//GEN-END:variables
}
