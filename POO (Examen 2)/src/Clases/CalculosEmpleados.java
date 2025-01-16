/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author AA726
 */
public class CalculosEmpleados extends Empleado implements Constantes{

    //Atributos
    private String nombreDepartamento;
    private int numeroEmpleados;
    
    //Constructores
    //Por Defecto
    public CalculosEmpleados() {
        super();
        this.nombreDepartamento = "";
        this.numeroEmpleados = 0;
    }
    
    //Con todos los atributos
    public CalculosEmpleados(String nombre, String puesto, double sueldo, String nombreDepartamento, int numeroEmpleados) {
        super(nombre, puesto, sueldo);
        this.nombreDepartamento = nombreDepartamento;
        this.numeroEmpleados = numeroEmpleados;
    }
    
    //Métodos get
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }
    
    //Métodos set
    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }
    
    
    
    @Override
    public double calcularSueldo(int numVentas) {
    if(DIA == 18){
        double sueldo = this.regresarSueldo();
        if(numVentas >= 1 && numVentas <= 3)
            sueldo = this.regresarSueldo() + (this.regresarSueldo() * 0.1);
        if(numVentas >= 4 && numVentas <= 10)
            sueldo = this.regresarSueldo() + (this.regresarSueldo() * 0.15);
        if(numVentas > 10)
            sueldo = this.regresarSueldo() + (this.regresarSueldo() * 0.2);
        return sueldo;
    }
    else{
        JOptionPane.showMessageDialog(null, "No es el dia 18 del mes");
        return 0.0;
    }
    }

    @Override
    public double regresarSueldo() {
        return sueldo;
    }
    
}
