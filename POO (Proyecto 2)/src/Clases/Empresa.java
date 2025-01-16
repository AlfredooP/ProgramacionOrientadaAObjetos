/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Puentes Vargas Alfredo - 22130803
 */
public abstract class Empresa {
    
    //ATRIBUTOS
    private String nombre;
    private int numEmpleados;
    private double presupuesto;
    private int diaI, mesI, añoI;
    
    //MÉTODOS CONSTRUCTORES
    //Por defecto
    public Empresa() {
        this.nombre = "";
        this.numEmpleados = 0;
        this.presupuesto = 0.0;
        this.diaI = 0;
        this.mesI = 0;
        this.añoI = 0;
    }
    
    //Con todos los parámetros
    public Empresa(String nombre, int numEmpleados, double presupuesto, int diaI, int mesI, int añoI) {
        this.nombre = nombre;
        this.numEmpleados = numEmpleados;
        this.presupuesto = presupuesto;
        this.diaI = diaI;
        this.mesI = mesI;
        this.añoI = añoI;
    }

    //MÉTODOS GET Y SET
    //Métodos get
    public String getNombre() {
        return nombre;
    }
    public int getNumEmpleados() {
        return numEmpleados;
    }
    public double getPresupuesto() {
        return presupuesto;
    }
    public int getDiaI() {
        return diaI;
    }
    public int getMesI() {
        return mesI;
    }
    public int getAñoI() {
        return añoI;
    }
    
    //Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    public void setDiaI(int diaI) {
        this.diaI = diaI;
    }
    public void setMesI(int mesI) {
        this.mesI = mesI;
    }
    public void setAñoI(int añoI) {
        this.añoI = añoI;
    }
    
    //MÉTODOS ABSTRACTOS
    public abstract double prestamo(double presupuesto, double cantPrestar, int meses);
    
}
