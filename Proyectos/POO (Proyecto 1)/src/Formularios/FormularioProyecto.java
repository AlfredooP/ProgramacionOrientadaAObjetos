/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Clases.Proyecto;


/**
 *
 * @author AA729
 */
public class FormularioProyecto extends javax.swing.JFrame {
    
//SE CREA UN OBJETO PROYECTO PARA PASAR LOS DATOS DE LOS ARRAYLIST
    private Proyecto oProyecto = new Proyecto();
    
    /**
     * Creates new form Proyecto
     */
    public FormularioProyecto() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePeliculas = new javax.swing.JTable();
        jButtonMostrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListMayores = new javax.swing.JList<>();
        jButtonMayores = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonReciente = new javax.swing.JButton();
        jLabelReciente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableActor = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTablePeliculas.setBackground(new java.awt.Color(204, 204, 255));
        jTablePeliculas.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jTablePeliculas.setForeground(new java.awt.Color(59, 59, 255));
        jTablePeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TITULO ", "GÉNERO", "CREADOR", "AÑO", "DURACIÓN", "VISTO", "ACTOR PRINCIPAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePeliculas.setGridColor(new java.awt.Color(51, 0, 153));
        jTablePeliculas.setRowHeight(25);
        jTablePeliculas.setSelectionBackground(new java.awt.Color(51, 0, 153));
        jTablePeliculas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTablePeliculas.setShowGrid(true);
        jTablePeliculas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTablePeliculas);
        if (jTablePeliculas.getColumnModel().getColumnCount() > 0) {
            jTablePeliculas.getColumnModel().getColumn(0).setResizable(false);
            jTablePeliculas.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTablePeliculas.getColumnModel().getColumn(1).setResizable(false);
            jTablePeliculas.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTablePeliculas.getColumnModel().getColumn(2).setResizable(false);
            jTablePeliculas.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTablePeliculas.getColumnModel().getColumn(3).setResizable(false);
            jTablePeliculas.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTablePeliculas.getColumnModel().getColumn(4).setResizable(false);
            jTablePeliculas.getColumnModel().getColumn(4).setPreferredWidth(40);
            jTablePeliculas.getColumnModel().getColumn(5).setResizable(false);
            jTablePeliculas.getColumnModel().getColumn(5).setPreferredWidth(30);
            jTablePeliculas.getColumnModel().getColumn(6).setResizable(false);
        }

        jButtonMostrar.setBackground(new java.awt.Color(51, 0, 153));
        jButtonMostrar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButtonMostrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMostrar.setText("MOSTRAR");
        jButtonMostrar.setMaximumSize(new java.awt.Dimension(120, 24));
        jButtonMostrar.setMinimumSize(new java.awt.Dimension(120, 24));
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        jListMayores.setBackground(new java.awt.Color(204, 204, 255));
        jListMayores.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jListMayores.setForeground(new java.awt.Color(59, 59, 255));
        jListMayores.setSelectionBackground(new java.awt.Color(51, 0, 153));
        jListMayores.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jListMayores);

        jButtonMayores.setBackground(new java.awt.Color(51, 0, 153));
        jButtonMayores.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButtonMayores.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMayores.setText("MAYORES");
        jButtonMayores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMayoresActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setText("PELÍCULAS");

        jButtonReciente.setBackground(new java.awt.Color(51, 0, 153));
        jButtonReciente.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButtonReciente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReciente.setText("PELICULA MAS RECIENTE");
        jButtonReciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecienteActionPerformed(evt);
            }
        });

        jLabelReciente.setBackground(new java.awt.Color(204, 204, 255));
        jLabelReciente.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabelReciente.setForeground(new java.awt.Color(59, 59, 255));
        jLabelReciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReciente.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setText("PELÍCULAS CON AÑO MAYOR O IGUAL A 2001");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("LA PELÍCULA MAS RECIENTE ES:");

        jTableActor.setBackground(new java.awt.Color(204, 204, 255));
        jTableActor.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jTableActor.setForeground(new java.awt.Color(59, 59, 255));
        jTableActor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "SEXO", "No. PELÍCULAS", "FECHA DE NACIMIENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableActor.setGridColor(new java.awt.Color(51, 0, 153));
        jTableActor.setRowHeight(25);
        jTableActor.setSelectionBackground(new java.awt.Color(51, 0, 153));
        jTableActor.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTableActor.setShowGrid(true);
        jTableActor.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTableActor);
        if (jTableActor.getColumnModel().getColumnCount() > 0) {
            jTableActor.getColumnModel().getColumn(0).setResizable(false);
            jTableActor.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTableActor.getColumnModel().getColumn(1).setResizable(false);
            jTableActor.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTableActor.getColumnModel().getColumn(2).setResizable(false);
            jTableActor.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTableActor.getColumnModel().getColumn(3).setResizable(false);
            jTableActor.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TABLA DE ACTORES");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        jLabel5.setText("Puentes Vargas Alfredo - 22130803");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButtonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButtonMayores, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButtonReciente, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3)
                                        .addComponent(jLabelReciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel5))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButtonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMayores)
                    .addComponent(jButtonReciente))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelReciente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
    
    //BOTÓN MOSTRAR
        //SE UTILIZAN LOS MÉTODOS CREADOS PARA MOSTRAR LOS DATOS EN LAS TABLAS
        this.oProyecto.enviarArraylist(); 
        this.oProyecto.mostrar(oProyecto.getArrPelicula(), jTablePeliculas, oProyecto.getArrActor(), jTableActor);
        this.oProyecto.borrarArraylist(); 
      
    }//GEN-LAST:event_jButtonMostrarActionPerformed

    private void jButtonMayoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMayoresActionPerformed
        
    //BOTÓN MAYORES
        //SE UTILIZAN LOS MÉTODOS CREADOS PARA MOSTRAR LAS PELÍCULAS MAYORES A 2001
        this.oProyecto.enviarArraylist(); 
        this.oProyecto.mayores(oProyecto.getArrPelicula(), jListMayores);
        this.oProyecto.borrarArraylist();
        
    }//GEN-LAST:event_jButtonMayoresActionPerformed

    private void jButtonRecienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecienteActionPerformed
        
    //BOTÓN RECIENTE
        //SE UTILIZAN LOS MÉTODOS CREADOS PARA MOSTRAR LA PELICULA MAS RECIENTE
        this.oProyecto.enviarArraylist(); 
        this.oProyecto.reciente(oProyecto.getArrPelicula(), jLabelReciente);
        this.oProyecto.borrarArraylist();
        
    }//GEN-LAST:event_jButtonRecienteActionPerformed

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
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioProyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMayores;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JButton jButtonReciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelReciente;
    private javax.swing.JList<String> jListMayores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableActor;
    private javax.swing.JTable jTablePeliculas;
    // End of variables declaration//GEN-END:variables
}
