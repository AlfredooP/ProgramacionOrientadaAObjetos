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
public class EmpresaExtranjera extends Empresa{
    
    //ATRIBUTOS
    private String pais;
    private String direccion;
    
    //MÉTODOS CONSTRUCTORES
    //Por defecto
    public EmpresaExtranjera() {
        super();
        this.pais = "";
        this.direccion = "";
    }

    //Con todos los atributos
    public EmpresaExtranjera(String nombre, int numEmpleados, double presupuesto, int diaI, int mesI, int añoI, String pais, String direccion) {
        super(nombre, numEmpleados, presupuesto, diaI, mesI, añoI);
        this.pais = pais;
        this.direccion = direccion;
    }
    
    //MÉTODOS GET Y SET
    //Métodos get
    public String getPais() {
        return pais;
    }
    public String getDireccion() {
        return direccion;
    }
    
    //Métodos set
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //MÉTODOS SOBREESCRITOS
    @Override
    public double prestamo(double presupuesto, double cantPrestar, int meses) {
        double max = presupuesto * 0.25;
        double cantPagar = 0.0;
        if(cantPrestar <= max){
            cantPagar = (cantPrestar / meses) + (cantPrestar * 0.067);
            JOptionPane.showMessageDialog(null, "El préstamo se ha realizado con éxito, recuerde pagar el dia 28 de cada mes");
        }
        else
            JOptionPane.showMessageDialog(null, "No es posible prestar esa cantidad, la cantidad máxima a prestar es $" + max);
        return cantPagar;
    }
    
    //MÉTODOS
    public void alta(EmpresaExtranjera oEE, JTable tabla, int fila){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();        
        tabla.setValueAt(oEE.getNombre(), fila, 0);
        tabla.setValueAt(oEE.getNumEmpleados(), fila, 1);
        tabla.setValueAt("$"+oEE.getPresupuesto(), fila, 2);
        tabla.setValueAt(oEE.getDiaI()+" / "+oEE.getMesI()+" / "+oEE.getAñoI(), fila, 3);
        tabla.setValueAt("Extranjera", fila, 4);
        tabla.setValueAt(oEE.getPais(), fila, 5);
        tabla.setValueAt(oEE.getDireccion(), fila, 6);
        Object[]objeto = new Object[7];
        modelo.addRow(objeto);
    }
    
}
