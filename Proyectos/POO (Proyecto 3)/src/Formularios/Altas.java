/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Empleado;
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author alfre
 */
public class Altas extends javax.swing.JFrame {

    //Inicializar el objeto Empleado
    Empleado oEmp = new Empleado();
    
    /**
     * Creates new form Altas
     */
    public Altas() {
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
        jLabel3 = new javax.swing.JLabel();
        jTextRFC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextEdad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextPuesto = new javax.swing.JTextField();
        jTextSueldo = new javax.swing.JTextField();
        jButtonAleatorio = new javax.swing.JButton();
        jButtonAlta = new javax.swing.JButton();
        jButtonMenu = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        jLabel2.setText("______________________________________________________________");

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALTAS");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setText("RFC:");

        jTextRFC.setBackground(new java.awt.Color(204, 204, 204));
        jTextRFC.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setText("NOMBRE:");

        jTextNombre.setBackground(new java.awt.Color(204, 204, 204));
        jTextNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setText("SUELDO:");

        jTextDireccion.setBackground(new java.awt.Color(204, 204, 204));
        jTextDireccion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setText("TELÉFONO:");

        jTextTelefono.setBackground(new java.awt.Color(204, 204, 204));
        jTextTelefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setText("EDAD:");

        jTextEdad.setBackground(new java.awt.Color(204, 204, 204));
        jTextEdad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setText("PUESTO:");

        jTextPuesto.setBackground(new java.awt.Color(204, 204, 204));
        jTextPuesto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jTextSueldo.setBackground(new java.awt.Color(204, 204, 204));
        jTextSueldo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jButtonAleatorio.setBackground(new java.awt.Color(0, 29, 191));
        jButtonAleatorio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButtonAleatorio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAleatorio.setText("GENERAR ALEATORIO");
        jButtonAleatorio.setBorder(null);
        jButtonAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAleatorioActionPerformed(evt);
            }
        });

        jButtonAlta.setBackground(new java.awt.Color(0, 29, 191));
        jButtonAlta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButtonAlta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlta.setText("DAR DE ALTA");
        jButtonAlta.setBorder(null);
        jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaActionPerformed(evt);
            }
        });

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

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel10.setText("DIRECCIÓN:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4)
                                        .addComponent(jTextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                        .addComponent(jTextDireccion)))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextPuesto))))
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTextSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaActionPerformed
        
        //Botón Alta
        //Leer los datos
        String rfc = this.jTextRFC.getText();
        String nombre = this.jTextNombre.getText();
        String direccion = this.jTextDireccion.getText();
        String telefono = this.jTextTelefono.getText();
        int edad = Integer.parseInt(this.jTextEdad.getText());
        String puesto = this.jTextPuesto.getText();
        double sueldo = Double.parseDouble(this.jTextSueldo.getText());
        
        //Añadir los datos al objeto Empleado
        oEmp = new Empleado(rfc, nombre, direccion, telefono, edad, puesto, sueldo);
        
        //Añadir el objeto al ArrayList
        oEmp.alta(oEmp);
        
        //Agregar los datos al Archivo
        oEmp.escribirArchivo(true);
        
        //Mostrar mensaje de diálogo
        JOptionPane.showMessageDialog(null, "Se ha dado de alta al empleado exitosamente");
        
    }//GEN-LAST:event_jButtonAltaActionPerformed

    private void jButtonAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAleatorioActionPerformed
        
        //Botón Aleatorio
        //Declarar variables y arreglos para generar los datos aleatorios
        Random rd = new Random();
        String [] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String [] nombres = {"Juan", "Pedro", "Ignacio", "Eduardo", "Rodrigo", "María", "Samantha", "Alejandra", "Laura", "Ana"};
        String [] apellidos = {"Ramírez", "Hernández", "Jiménez", "Pérez", "Rodríguez", "González", "Sánchez"};
        String [] calles = {"Av. Constitución", "Blvd. Miguel Alemán", "Calle 5 de Mayo", "Av. Reforma", "Diagonal Niños Héroes", "Periférico Raúl López"};
        String [] puestos = {"Director(a)", "Gerente gral.", "Jefe de área", "Secretario (a)", "Empleado (a)", "Contador (a)"};
        
        //Generar datos aleatorios y escribirlos en los campos correspondientes
        this.jTextRFC.setText(letras[rd.nextInt(26)]+letras[rd.nextInt(26)]+letras[rd.nextInt(26)]+letras[rd.nextInt(26)]+(rd.nextInt(8999)+1000));
        this.jTextNombre.setText(nombres[rd.nextInt(10)] + " " + apellidos[rd.nextInt(7)]);
        this.jTextDireccion.setText(calles[rd.nextInt(6)] + " #" + rd.nextInt(1000));
        this.jTextTelefono.setText("(871)" + (rd.nextInt(8999999)+1000000));
        this.jTextEdad.setText((rd.nextInt(48)+18) + "");
        this.jTextPuesto.setText(puestos[rd.nextInt(6)]);
        this.jTextSueldo.setText((rd.nextInt(100)+20) + "00");
        
    }//GEN-LAST:event_jButtonAleatorioActionPerformed

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
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Altas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAleatorio;
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextEdad;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPuesto;
    private javax.swing.JTextField jTextRFC;
    private javax.swing.JTextField jTextSueldo;
    private javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables
}
