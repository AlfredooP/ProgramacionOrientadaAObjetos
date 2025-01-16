/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Puentes Vargas Alfredo - 22130803
 */
public class EmpresaNacional extends Empresa{
    
    //ATRIBUTOS
    private String RFC;
    private String direccion;
    
    //MÉTODOS CONSTRUCTORES
    //Por defecto
    public EmpresaNacional() {
        super();
        this.RFC = "";
        this.direccion = "";
    }

    //Con todos los atributos
    public EmpresaNacional(String nombre, int numEmpleados, double presupuesto, int diaI, int mesI, int añoI, String RFC, String direccion) {
        super(nombre, numEmpleados, presupuesto, diaI, mesI, añoI);
        this.RFC = RFC;
        this.direccion = direccion;
    }
    
    
    //MÉTODOS GET Y SET
    //Métodos get
    public String getRFC() {
        return RFC;
    }
    public String getDireccion() {
        return direccion;
    }
    
    //Métodos set
    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //MÉTODOS SOBREESCRITOS
    @Override
    public double prestamo(double presupuesto, double cantPrestar, int meses) {
        double max = presupuesto * 0.3;
        double cantPagar = 0.0;
        if(cantPrestar <= max){
            cantPagar = (cantPrestar / meses) + (cantPrestar * 0.05);
            JOptionPane.showMessageDialog(null, "El préstamo se ha realizado con éxito, recuerde pagar el dia 28 de cada mes");
        }
        else
            JOptionPane.showMessageDialog(null, "No es posible prestar esa cantidad, la cantidad máxima a prestar es $" + max);
        return cantPagar;
    }
    
    //MÉTODOS
    public void alta(EmpresaNacional oEN, JTable tabla, int fila){   
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();        
        tabla.setValueAt(oEN.getNombre(), fila, 0);
        tabla.setValueAt(oEN.getNumEmpleados(), fila, 1);
        tabla.setValueAt("$"+oEN.getPresupuesto(), fila, 2);
        tabla.setValueAt(oEN.getDiaI()+" / "+oEN.getMesI()+" / "+oEN.getAñoI(), fila, 3);
        tabla.setValueAt("Nacional", fila, 4);
        tabla.setValueAt(oEN.getRFC(), fila, 5);
        tabla.setValueAt(oEN.getDireccion(), fila, 6);
        Object[]objeto = new Object[7];
        modelo.addRow(objeto);
    }
    
}
