/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Clases.EmpresaExtranjera;
import Clases.EmpresaNacional;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Puentes Vargas Alfredo - 22130803
 */
public class AltaEmpresa extends javax.swing.JFrame {

        //DECLARACIÓN DE OBJETOS Y VARIABLES
        EmpresaExtranjera oEE = new EmpresaExtranjera();
        EmpresaNacional oEN = new EmpresaNacional();
        int contFila = 0;
    
    /**
     * Creates new form AltaEmpresa
     */
    public AltaEmpresa() {
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
        jLabel2 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextEmpleados = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextPresupuesto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSpinnerDia = new javax.swing.JSpinner();
        jSpinnerAño = new javax.swing.JSpinner();
        jButtonAlta = new javax.swing.JButton();
        jButtonPrestamo = new javax.swing.JButton();
        jButtonProveedores = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioNacional = new javax.swing.JRadioButton();
        jRadioExtranjera = new javax.swing.JRadioButton();
        jLabelRFCPais = new javax.swing.JLabel();
        jTextRFCPais = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextDireccion = new javax.swing.JTextField();
        jButtonSalir = new javax.swing.JButton();
        jSpinnerMes = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpresas = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DAR DE ALTA UNA EMPRESA");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE DE LA EMPRESA:");

        jTextNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTextNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextNombre.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NÚMERO DE EMPLEADOS:");

        jTextEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        jTextEmpleados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextEmpleados.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRESUPUESTO DE LA EMPRESA:");

        jTextPresupuesto.setBackground(new java.awt.Color(255, 255, 255));
        jTextPresupuesto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextPresupuesto.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FECHA DE INICIO:");

        jSpinnerDia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSpinnerDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jSpinnerDia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSpinnerDia.setOpaque(true);

        jSpinnerAño.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSpinnerAño.setModel(new javax.swing.SpinnerNumberModel(2023, 1923, 2023, 1));
        jSpinnerAño.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSpinnerAño.setOpaque(true);

        jButtonAlta.setBackground(new java.awt.Color(0, 0, 255));
        jButtonAlta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAlta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlta.setText("DAR DE ALTA");
        jButtonAlta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButtonAlta.setOpaque(true);
        jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaActionPerformed(evt);
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

        jButtonProveedores.setBackground(new java.awt.Color(32, 108, 193));
        jButtonProveedores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonProveedores.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProveedores.setText("PROVEEDORES");
        jButtonProveedores.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButtonProveedores.setOpaque(true);
        jButtonProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProveedoresActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TIPO DE EMPRESA:");

        jRadioNacional.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioNacional.setForeground(new java.awt.Color(255, 255, 255));
        jRadioNacional.setText("Nacional");
        jRadioNacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioNacionalActionPerformed(evt);
            }
        });

        jRadioExtranjera.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioExtranjera.setForeground(new java.awt.Color(255, 255, 255));
        jRadioExtranjera.setText("Extranjera");
        jRadioExtranjera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioExtranjeraActionPerformed(evt);
            }
        });

        jLabelRFCPais.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelRFCPais.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRFCPais.setText("*SELECCIONE TIPO*");

        jTextRFCPais.setBackground(new java.awt.Color(255, 255, 255));
        jTextRFCPais.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextRFCPais.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DIRECCIÓN DE LA EMPRESA:");

        jTextDireccion.setBackground(new java.awt.Color(255, 255, 255));
        jTextDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextDireccion.setForeground(new java.awt.Color(0, 0, 0));

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

        jSpinnerMes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSpinnerMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jSpinnerMes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSpinnerMes.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DIA:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MES:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("AÑO:");

        jTableEmpresas.setBackground(new java.awt.Color(255, 255, 255));
        jTableEmpresas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTableEmpresas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTableEmpresas.setForeground(new java.awt.Color(0, 0, 0));
        jTableEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "EMPLEADOS", "PRESUPUESTO", "FECHA DE INICIO", "TIPO", "RFC / PAÍS", "DIRECCIÓN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEmpresas.setGridColor(new java.awt.Color(0, 0, 0));
        jTableEmpresas.setRowHeight(30);
        jTableEmpresas.setSelectionBackground(new java.awt.Color(153, 0, 153));
        jTableEmpresas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTableEmpresas.setShowGrid(true);
        jTableEmpresas.getTableHeader().setResizingAllowed(false);
        jTableEmpresas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableEmpresas);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("REGISTRO DE EMPRESAS:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextNombre)
                            .addComponent(jTextEmpleados)
                            .addComponent(jTextPresupuesto))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioNacional)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioExtranjera))
                                    .addComponent(jLabel6))
                                .addGap(24, 24, 24))
                            .addComponent(jLabelRFCPais)
                            .addComponent(jTextRFCPais, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonProveedores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpinnerDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4))
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerAño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 61, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabelRFCPais))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextRFCPais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioNacional)
                                .addComponent(jRadioExtranjera)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaActionPerformed
        
        //BOTÓN ALTA
        
        //Leer los datos ingresados
        String nombre = this.jTextNombre.getText();
        int numEmpleados = Integer.parseInt(this.jTextEmpleados.getText());
        double presupuesto = Double.parseDouble(this.jTextPresupuesto.getText());
        int diaI = Integer.parseInt(this.jSpinnerDia.getValue().toString());
        int mesI = Integer.parseInt(this.jSpinnerMes.getValue().toString());
        int añoI = Integer.parseInt(this.jSpinnerAño.getValue().toString());
        
        String rfcPais = this.jTextRFCPais.getText();
        String direccion = this.jTextDireccion.getText();
        
        //Guardarlos en el objeto Empresa correspondiente e imprimirlos en la tabla Empresas
        if(this.jRadioNacional.isSelected()){
            oEN = new EmpresaNacional(nombre, numEmpleados, presupuesto, diaI, mesI, añoI, rfcPais, direccion);
            oEN.alta(oEN, this.jTableEmpresas, contFila);
            contFila = contFila + 1;
            JOptionPane.showMessageDialog(null,"La empresa " + nombre + " se ha dado de alta exitosamente");
        }
        else{
            if(this.jRadioExtranjera.isSelected()){
                oEE = new EmpresaExtranjera(nombre, numEmpleados, presupuesto, diaI, mesI, añoI, rfcPais, direccion);
                oEE.alta(oEE, this.jTableEmpresas, contFila);
                contFila = contFila + 1;
                JOptionPane.showMessageDialog(null,"La empresa " + nombre + " se ha dado de alta exitosamente");
            }
            else
                JOptionPane.showMessageDialog(null,"Seleccione un tipo de empresa para continuar");
        }
        
    }//GEN-LAST:event_jButtonAltaActionPerformed

    private void jButtonProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProveedoresActionPerformed
        
        //BOTÓN PROVEEDORES
        Proveedores oPro = new Proveedores();
        oPro.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButtonProveedoresActionPerformed

    private void jButtonPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrestamoActionPerformed
        
        //BOTÓN PRÉSTAMO
        Prestamos oP = new Prestamos();
        oP.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButtonPrestamoActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        
        //BOTÓN SALIR
        this.dispose();
        
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jRadioNacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioNacionalActionPerformed
        
        this.jRadioExtranjera.setSelected(false);
        this.jLabelRFCPais.setText("RFC DE LA EMPRESA:");
        
    }//GEN-LAST:event_jRadioNacionalActionPerformed

    private void jRadioExtranjeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioExtranjeraActionPerformed
        
        this.jRadioNacional.setSelected(false);
        this.jLabelRFCPais.setText("PAÍS DE UBICACIÓN:");
        
    }//GEN-LAST:event_jRadioExtranjeraActionPerformed

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
            java.util.logging.Logger.getLogger(AltaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonPrestamo;
    private javax.swing.JButton jButtonProveedores;
    private javax.swing.JButton jButtonSalir;
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
    private javax.swing.JLabel jLabelRFCPais;
    private javax.swing.JRadioButton jRadioExtranjera;
    private javax.swing.JRadioButton jRadioNacional;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerAño;
    private javax.swing.JSpinner jSpinnerDia;
    private javax.swing.JSpinner jSpinnerMes;
    private javax.swing.JTable jTableEmpresas;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextEmpleados;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPresupuesto;
    private javax.swing.JTextField jTextRFCPais;
    // End of variables declaration//GEN-END:variables
}