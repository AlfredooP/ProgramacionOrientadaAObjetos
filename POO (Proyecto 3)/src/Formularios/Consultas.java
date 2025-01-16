/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Empleado;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alfre
 */
public class Consultas extends javax.swing.JFrame {

    //Inicializar el objeto Empleado
    Empleado oEmp = new Empleado();
    
    /**
     * Creates new form Consultas
     */
    public Consultas() {
        initComponents();
        //Cambiar color de fondo
        getContentPane().setBackground(Color.WHITE);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpleados = new javax.swing.JTable();
        jRadioTodos = new javax.swing.JRadioButton();
        jRadioSueldo = new javax.swing.JRadioButton();
        jLabelEtiqueta = new javax.swing.JLabel();
        jButtonMenu = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabelEtiqueta1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("___________________________________________________________________________________________________");

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTAS");

        jTableEmpleados.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jTableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RFC", "NOMBRE", "DIRECCIÓN", "TELÉFONO", "EDAD", "PUESTO", "SUELDO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEmpleados.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableEmpleados);
        if (jTableEmpleados.getColumnModel().getColumnCount() > 0) {
            jTableEmpleados.getColumnModel().getColumn(0).setResizable(false);
            jTableEmpleados.getColumnModel().getColumn(0).setPreferredWidth(55);
            jTableEmpleados.getColumnModel().getColumn(1).setResizable(false);
            jTableEmpleados.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTableEmpleados.getColumnModel().getColumn(2).setResizable(false);
            jTableEmpleados.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTableEmpleados.getColumnModel().getColumn(3).setResizable(false);
            jTableEmpleados.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTableEmpleados.getColumnModel().getColumn(4).setResizable(false);
            jTableEmpleados.getColumnModel().getColumn(4).setPreferredWidth(30);
            jTableEmpleados.getColumnModel().getColumn(5).setResizable(false);
            jTableEmpleados.getColumnModel().getColumn(6).setResizable(false);
            jTableEmpleados.getColumnModel().getColumn(6).setPreferredWidth(45);
        }

        jRadioTodos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jRadioTodos.setText("TODOS LOS EMPLEADOS");
        jRadioTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioTodosActionPerformed(evt);
            }
        });

        jRadioSueldo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jRadioSueldo.setText("EMPLEADOS CON SUELDO ESPECÍFICO");
        jRadioSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioSueldoActionPerformed(evt);
            }
        });

        jLabelEtiqueta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabelEtiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEtiqueta.setText("(SELECCIONE UNA OPCIÓN)");

        jButtonMenu.setBackground(new java.awt.Color(0, 29, 191));
        jButtonMenu.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButtonMenu.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMenu.setText("MENÚ");
        jButtonMenu.setBorder(null);
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });

        jButtonSalir.setBackground(new java.awt.Color(208, 0, 0));
        jButtonSalir.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("SALIR");
        jButtonSalir.setBorder(null);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabelEtiqueta1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabelEtiqueta1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelEtiqueta1.setText("MOSTRAR:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioTodos)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioSueldo))
                            .addComponent(jScrollPane1)
                            .addComponent(jLabelEtiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEtiqueta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(60, 60, 60)
                .addComponent(jLabelEtiqueta1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioTodos)
                    .addComponent(jRadioSueldo))
                .addGap(18, 18, 18)
                .addComponent(jLabelEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        //Evento Abrir Ventana
        //Actualizar los datos
        oEmp.leerArchivo();
        
    }//GEN-LAST:event_formWindowOpened

    private void jRadioTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioTodosActionPerformed
        
        //Evento "Todos los Empleados"
        //Deseleccionar el otro jRadioButton
        this.jRadioSueldo.setSelected(false);
        
        //Actualizar etiqueta y mostrar los datos en la tabla
        this.jLabelEtiqueta.setText("EMPLEADOS REGISTRADOS");
        oEmp.imprimirDatos(jTableEmpleados);

    }//GEN-LAST:event_jRadioTodosActionPerformed

    private void jRadioSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioSueldoActionPerformed
        
        //Evento "Empleados con sueldo específico"
        //Deseleccionar el otro jRadioButton
        this.jRadioTodos.setSelected(false);
        
        //Pedir el sueldo a mostrar
        double sueldoMostrar = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el sueldo de los empleados a mostrar:"));
        
        //Actualizar etiqueta
        this.jLabelEtiqueta.setText("EMPLEADOS CON UN SUELDO DE $" + sueldoMostrar);
        
        //Borrar los antiguos datos de la tabla
        DefaultTableModel modelo = (DefaultTableModel)this.jTableEmpleados.getModel();
        modelo.setRowCount(0);
        
        //Crear un nuevo ArrayLIst para los empleados encontrados
        ArrayList <Empleado> arrEncontrados = new ArrayList();
        
        //Buscar el sueldo entre los empleados
        for(int i=0; i<oEmp.getArrEmp().size(); i++){
            int pos = oEmp.buscarSueldo(sueldoMostrar, i);
            
            //Si el sueldo corresponde agregarlo al nuevo ArrayList
            if(pos != -1){
                arrEncontrados.add(oEmp.getArrEmp().get(pos));
            }
        }
        
        //Mostrar los empleados encontrados en la tabla
        for(int i=0; i<arrEncontrados.size(); i++){
            modelo.setRowCount(modelo.getRowCount()+1);
            this.jTableEmpleados.setValueAt(arrEncontrados.get(i).getRfc(), i, 0);
            this.jTableEmpleados.setValueAt(arrEncontrados.get(i).getNombre(), i, 1);
            this.jTableEmpleados.setValueAt(arrEncontrados.get(i).getDireccion(), i, 2);
            this.jTableEmpleados.setValueAt(arrEncontrados.get(i).getTelefono(), i, 3);
            this.jTableEmpleados.setValueAt(arrEncontrados.get(i).getEdad(), i, 4);
            this.jTableEmpleados.setValueAt(arrEncontrados.get(i).getPuesto(), i, 5);
            this.jTableEmpleados.setValueAt(arrEncontrados.get(i).getSueldo(), i, 6);
        }
        
        
    }//GEN-LAST:event_jRadioSueldoActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        
        //Botón Menú
        Menu oMenu = new Menu();
        oMenu.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        
        //Botón Salir
        this.dispose();
        
    }//GEN-LAST:event_jButtonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEtiqueta;
    private javax.swing.JLabel jLabelEtiqueta1;
    private javax.swing.JRadioButton jRadioSueldo;
    private javax.swing.JRadioButton jRadioTodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmpleados;
    // End of variables declaration//GEN-END:variables
}
