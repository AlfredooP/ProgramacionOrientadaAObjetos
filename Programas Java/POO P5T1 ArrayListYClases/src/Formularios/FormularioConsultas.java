/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Clases.Empleado;
import Clases.Empresa;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AA729
 */
public class FormularioConsultas extends javax.swing.JFrame {
    FormularioAltas oFormAlta;
    
    /**
     * Creates new form FormularioConsultas
     */
    public FormularioConsultas(FormularioAltas oFormAltas) {
        initComponents();
        oFormAlta = oFormAltas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jRadioEmpresa1 = new javax.swing.JRadioButton();
        jRadioEmpresa2 = new javax.swing.JRadioButton();
        jRadioEmpresa3 = new javax.swing.JRadioButton();
        jButtonConsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelNomEmpresa = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGerenteGeneral = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUbicacion = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableEmpleados = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton1Y2 = new javax.swing.JButton();
        jButton1Y3 = new javax.swing.JButton();
        jButton2Y3 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jRadioEmpresa1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jRadioEmpresa1.setText("EMPRESA 1");
        jRadioEmpresa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioEmpresa1ActionPerformed(evt);
            }
        });

        jRadioEmpresa2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jRadioEmpresa2.setText("EMPRESA 2");
        jRadioEmpresa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioEmpresa2ActionPerformed(evt);
            }
        });

        jRadioEmpresa3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jRadioEmpresa3.setText("EMPRESA 3");
        jRadioEmpresa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioEmpresa3ActionPerformed(evt);
            }
        });

        jButtonConsultar.setBackground(new java.awt.Color(0, 0, 255));
        jButtonConsultar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultar.setText("CONSULTAR");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("NOMBRE DE LA EMPRESA:");

        jLabelNomEmpresa.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelNomEmpresa.setForeground(new java.awt.Color(0, 0, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("GERENTE GENERAL:");

        jTableGerenteGeneral.setBackground(new java.awt.Color(51, 102, 255));
        jTableGerenteGeneral.setForeground(new java.awt.Color(255, 255, 255));
        jTableGerenteGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "SUELDO", "DIA", "MES", "AÑO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableGerenteGeneral.setGridColor(new java.awt.Color(255, 255, 255));
        jTableGerenteGeneral.setRowHeight(21);
        jTableGerenteGeneral.setShowHorizontalLines(true);
        jTableGerenteGeneral.setShowVerticalLines(true);
        jScrollPane1.setViewportView(jTableGerenteGeneral);
        if (jTableGerenteGeneral.getColumnModel().getColumnCount() > 0) {
            jTableGerenteGeneral.getColumnModel().getColumn(0).setMinWidth(160);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("UBICACION:");

        jTableUbicacion.setBackground(new java.awt.Color(51, 102, 255));
        jTableUbicacion.setForeground(new java.awt.Color(255, 255, 255));
        jTableUbicacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "CALLE", "NÚMERO", "COLONIA", "CP", "CIUDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUbicacion.setGridColor(new java.awt.Color(255, 255, 255));
        jTableUbicacion.setRowHeight(21);
        jTableUbicacion.setShowHorizontalLines(true);
        jTableUbicacion.setShowVerticalLines(true);
        jScrollPane2.setViewportView(jTableUbicacion);
        if (jTableUbicacion.getColumnModel().getColumnCount() > 0) {
            jTableUbicacion.getColumnModel().getColumn(0).setMinWidth(160);
        }

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("EMPLEADOS:");

        jTableEmpleados.setBackground(new java.awt.Color(51, 102, 255));
        jTableEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        jTableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "PUESTO", "DIA", "MES", "AÑO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEmpleados.setGridColor(new java.awt.Color(255, 255, 255));
        jTableEmpleados.setShowHorizontalLines(true);
        jTableEmpleados.setShowVerticalLines(true);
        jScrollPane4.setViewportView(jTableEmpleados);
        if (jTableEmpleados.getColumnModel().getColumnCount() > 0) {
            jTableEmpleados.getColumnModel().getColumn(0).setMinWidth(160);
        }

        jLabel6.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("CONSULTAR UNA EMPRESA");

        jButton1Y2.setBackground(new java.awt.Color(0, 0, 51));
        jButton1Y2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1Y2.setForeground(new java.awt.Color(255, 255, 255));
        jButton1Y2.setText("EMP 1 & EMP 2");
        jButton1Y2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1Y2ActionPerformed(evt);
            }
        });

        jButton1Y3.setBackground(new java.awt.Color(0, 0, 51));
        jButton1Y3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1Y3.setForeground(new java.awt.Color(255, 255, 255));
        jButton1Y3.setText("EMP 1 & EMP 3");
        jButton1Y3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1Y3ActionPerformed(evt);
            }
        });

        jButton2Y3.setBackground(new java.awt.Color(0, 0, 51));
        jButton2Y3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2Y3.setForeground(new java.awt.Color(255, 255, 255));
        jButton2Y3.setText("EMP 2 & EMP 3");
        jButton2Y3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2Y3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabelNomEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton2Y3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addComponent(jButton1Y3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioEmpresa1)
                                        .addGap(36, 36, 36)
                                        .addComponent(jRadioEmpresa2)
                                        .addGap(34, 34, 34)
                                        .addComponent(jRadioEmpresa3)
                                        .addGap(85, 85, 85)
                                        .addComponent(jButton1Y2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))))))
                .addGap(0, 55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioEmpresa1)
                    .addComponent(jRadioEmpresa2)
                    .addComponent(jRadioEmpresa3)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButton1Y2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabelNomEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1Y3)
                            .addComponent(jButton2Y3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioEmpresa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEmpresa1ActionPerformed
        this.jRadioEmpresa2.setSelected(false);
        this.jRadioEmpresa3.setSelected(false);
    }//GEN-LAST:event_jRadioEmpresa1ActionPerformed

    private void jRadioEmpresa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEmpresa2ActionPerformed
        this.jRadioEmpresa1.setSelected(false);
        this.jRadioEmpresa3.setSelected(false);
    }//GEN-LAST:event_jRadioEmpresa2ActionPerformed

    private void jRadioEmpresa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEmpresa3ActionPerformed
        this.jRadioEmpresa1.setSelected(false);
        this.jRadioEmpresa2.setSelected(false);
    }//GEN-LAST:event_jRadioEmpresa3ActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        if(this.jRadioEmpresa1.isSelected()){
            
            //Mostrar el nombre de la empresa en una etiqueta
            jLabelNomEmpresa.setText(oFormAlta.oEmp1.getNombre());
            
            //Mostrar el Gerente General
            jTableGerenteGeneral.setValueAt(oFormAlta.oEmp1.getGerente().getNombre(), 0, 0);
            jTableGerenteGeneral.setValueAt(oFormAlta.oEmp1.getGerente().getSueldo(), 0, 1);
            jTableGerenteGeneral.setValueAt(oFormAlta.oEmp1.getGerente().getFechaNac().getDia(), 0, 2);
            jTableGerenteGeneral.setValueAt(oFormAlta.oEmp1.getGerente().getFechaNac().getMes(), 0, 3);
            jTableGerenteGeneral.setValueAt(oFormAlta.oEmp1.getGerente().getFechaNac().getAño(), 0, 4);
            
            //Mostrar la ubicación
            jTableUbicacion.setValueAt(oFormAlta.oEmp1.getUbicacion().getCalle(), 0, 0);
            jTableUbicacion.setValueAt(oFormAlta.oEmp1.getUbicacion().getNumero(), 0, 1);
            jTableUbicacion.setValueAt(oFormAlta.oEmp1.getUbicacion().getColonia(), 0, 2);
            jTableUbicacion.setValueAt(oFormAlta.oEmp1.getUbicacion().getCd(), 0, 3);
            jTableUbicacion.setValueAt(oFormAlta.oEmp1.getUbicacion().getCp(), 0, 4);
            
            //Mostrar el ArrayList arrL1
            DefaultTableModel modelo = (DefaultTableModel)this.jTableEmpleados.getModel();
            modelo.setRowCount(0);
            modelo.setRowCount(oFormAlta.arrL1.size());
            
            for(int i=0; i<oFormAlta.arrL1.size(); i++){
                jTableEmpleados.setValueAt(oFormAlta.arrL1.get(i).getNombre(), i, 0);
                jTableEmpleados.setValueAt(oFormAlta.arrL1.get(i).getPuesto(), i, 1);
                jTableEmpleados.setValueAt(oFormAlta.arrL1.get(i).getFechaNac().getDia(), i, 2);
                jTableEmpleados.setValueAt(oFormAlta.arrL1.get(i).getFechaNac().getMes(), i, 3);
                jTableEmpleados.setValueAt(oFormAlta.arrL1.get(i).getFechaNac().getAño(), i, 4);
            } 
        }
        else if(this.jRadioEmpresa2.isSelected()){
             //Mostrar el nombre de la empresa en una etiqueta
            jLabelNomEmpresa.setText(oFormAlta.oEmp2.getNombre());
            
            //Mostrar el Gerente General
            jTableGerenteGeneral.setValueAt(oFormAlta.oEmp2.getGerente().getNombre(), 0, 0);
            jTableGerenteGeneral.setValueAt(oFormAlta.oEmp2.getGerente().getSueldo(), 0, 1);
            jTableGerenteGeneral.setValueAt(oFormAlta.oEmp2.getGerente().getFechaNac().getDia(), 0, 2);
            jTableGerenteGeneral.setValueAt(oFormAlta.oEmp2.getGerente().getFechaNac().getMes(), 0, 3);
            jTableGerenteGeneral.setValueAt(oFormAlta.oEmp2.getGerente().getFechaNac().getAño(), 0, 4);
            
            //Mostrar la ubicación
            jTableUbicacion.setValueAt(oFormAlta.oEmp2.getUbicacion().getCalle(), 0, 0);
            jTableUbicacion.setValueAt(oFormAlta.oEmp2.getUbicacion().getNumero(), 0, 1);
            jTableUbicacion.setValueAt(oFormAlta.oEmp2.getUbicacion().getColonia(), 0, 2);
            jTableUbicacion.setValueAt(oFormAlta.oEmp2.getUbicacion().getCd(), 0, 3);
            jTableUbicacion.setValueAt(oFormAlta.oEmp2.getUbicacion().getCp(), 0, 4);
            
            //Mostrar el ArrayList arrL2
            DefaultTableModel modelo = (DefaultTableModel)this.jTableEmpleados.getModel();
            modelo.setRowCount(0);
            modelo.setRowCount(oFormAlta.arrL2.size());
            
            for(int i=0; i<oFormAlta.arrL2.size(); i++){
                jTableEmpleados.setValueAt(oFormAlta.arrL2.get(i).getNombre(), i, 0);
                jTableEmpleados.setValueAt(oFormAlta.arrL2.get(i).getPuesto(), i, 1);
                jTableEmpleados.setValueAt(oFormAlta.arrL2.get(i).getFechaNac().getDia(), i, 2);
                jTableEmpleados.setValueAt(oFormAlta.arrL2.get(i).getFechaNac().getMes(), i, 3);
                jTableEmpleados.setValueAt(oFormAlta.arrL2.get(i).getFechaNac().getAño(), i, 4);
            }
        }
          else if(this.jRadioEmpresa3.isSelected()){
            //Mostrar el nombre de la empresa en una etiqueta
            jLabelNomEmpresa.setText(oFormAlta.oEmp3.getNombre());
            
            //Mostrar el Gerente General
            jTableGerenteGeneral.setValueAt(oFormAlta.oEmp3.getGerente().getNombre(), 0, 0);
            jTableGerenteGeneral.setValueAt(oFormAlta.oEmp3.getGerente().getSueldo(), 0, 1);
            jTableGerenteGeneral.setValueAt(oFormAlta.oEmp3.getGerente().getFechaNac().getDia(), 0, 2);
            jTableGerenteGeneral.setValueAt(oFormAlta.oEmp3.getGerente().getFechaNac().getMes(), 0, 3);
            jTableGerenteGeneral.setValueAt(oFormAlta.oEmp3.getGerente().getFechaNac().getAño(), 0, 4);
            
            //Mostrar la ubicación
            jTableUbicacion.setValueAt(oFormAlta.oEmp3.getUbicacion().getCalle(), 0, 0);
            jTableUbicacion.setValueAt(oFormAlta.oEmp3.getUbicacion().getNumero(), 0, 1);
            jTableUbicacion.setValueAt(oFormAlta.oEmp3.getUbicacion().getColonia(), 0, 2);
            jTableUbicacion.setValueAt(oFormAlta.oEmp3.getUbicacion().getCd(), 0, 3);
            jTableUbicacion.setValueAt(oFormAlta.oEmp3.getUbicacion().getCp(), 0, 4);
            
            //Mostrar el ArrayList arrL3
            DefaultTableModel modelo = (DefaultTableModel)this.jTableEmpleados.getModel();
            modelo.setRowCount(0);
            modelo.setRowCount(oFormAlta.arrL3.size());
            
            for(int i=0; i<oFormAlta.arrL3.size(); i++){
                jTableEmpleados.setValueAt(oFormAlta.arrL3.get(i).getNombre(), i, 0);
                jTableEmpleados.setValueAt(oFormAlta.arrL3.get(i).getPuesto(), i, 1);
                jTableEmpleados.setValueAt(oFormAlta.arrL3.get(i).getFechaNac().getDia(), i, 2);
                jTableEmpleados.setValueAt(oFormAlta.arrL3.get(i).getFechaNac().getMes(), i, 3);
                jTableEmpleados.setValueAt(oFormAlta.arrL3.get(i).getFechaNac().getAño(), i, 4);
            }
        }
          else
              JOptionPane.showMessageDialog(null, "Es necesario seleccionar el número de empresa antes de consultarla");
            
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButton1Y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1Y2ActionPerformed
        Empresa oEmpAux = new Empresa();
        ArrayList <Empleado> arrAux = new ArrayList();
                
        //Pasar del oEmp1 al oEmpAux
        oEmpAux.copiarEmpresa(oFormAlta.oEmp1);
        arrAux = oFormAlta.arrL1;
        
        //Pasar del oEmp2 al oEmp1
        oFormAlta.oEmp1.copiarEmpresa(oFormAlta.oEmp2);
        oFormAlta.arrL1 = oFormAlta.arrL2;
        
        //Pasar del oEmpAux a oEmp2
        oFormAlta.oEmp2.copiarEmpresa(oEmpAux);
        oFormAlta.arrL2 = arrAux;
        
        JOptionPane.showMessageDialog(null, "Los datos entre la Empresa 1 y la Empresa 2 han sido cambiados exitosamente");
    }//GEN-LAST:event_jButton1Y2ActionPerformed

    private void jButton1Y3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1Y3ActionPerformed
        Empresa oEmpAux = new Empresa();
        ArrayList <Empleado> arrAux = new ArrayList();
                
        //Pasar del oEmp1 al oEmpAux
        oEmpAux.copiarEmpresa(oFormAlta.oEmp1);
        arrAux = oFormAlta.arrL1;
        
        //Pasar del oEmp3 al oEmp1
        oFormAlta.oEmp1.copiarEmpresa(oFormAlta.oEmp3);
        oFormAlta.arrL1 = oFormAlta.arrL3;
        
        //Pasar del oEmpAux a oEmp3
        oFormAlta.oEmp3.copiarEmpresa(oEmpAux);
        oFormAlta.arrL3 = arrAux;
        
        JOptionPane.showMessageDialog(null, "Los datos entre la Empresa 1 y la Empresa 3 han sido cambiados exitosamente");
    }//GEN-LAST:event_jButton1Y3ActionPerformed

    private void jButton2Y3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2Y3ActionPerformed
        Empresa oEmpAux = new Empresa();
        ArrayList <Empleado> arrAux = new ArrayList();
                
        //Pasar del oEmp2 al oEmpAux
        oEmpAux.copiarEmpresa(oFormAlta.oEmp2);
        arrAux = oFormAlta.arrL2;
        
        //Pasar del oEmp3 al oEmp2
        oFormAlta.oEmp2.copiarEmpresa(oFormAlta.oEmp3);
        oFormAlta.arrL2 = oFormAlta.arrL3;
        
        //Pasar del oEmpAux a oEmp3
        oFormAlta.oEmp3.copiarEmpresa(oEmpAux);
        oFormAlta.arrL3 = arrAux;
        
        JOptionPane.showMessageDialog(null, "Los datos entre la Empresa 2 y la Empresa 3 han sido cambiados exitosamente");
    }//GEN-LAST:event_jButton2Y3ActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioConsultas(new FormularioAltas()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1Y2;
    private javax.swing.JButton jButton1Y3;
    private javax.swing.JButton jButton2Y3;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelNomEmpresa;
    private javax.swing.JRadioButton jRadioEmpresa1;
    private javax.swing.JRadioButton jRadioEmpresa2;
    private javax.swing.JRadioButton jRadioEmpresa3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableEmpleados;
    private javax.swing.JTable jTableGerenteGeneral;
    private javax.swing.JTable jTableUbicacion;
    // End of variables declaration//GEN-END:variables
}
