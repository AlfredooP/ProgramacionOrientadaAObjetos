/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA731
 */
public class Empleado {

    //Atributos
    private int numEmpleado;
    private String nombEmpleado;
    private double sueldoEmpleado;
    private String puestoEmpleado;
    
    //Constructores
    public Empleado(){
        this.numEmpleado = 0;
        this.nombEmpleado = "";
        this.sueldoEmpleado = 0.0;
        this.puestoEmpleado = "";
    }
    
    public Empleado(int numEmpleado, String nombEmpleado, double sueldoEmpleado, String puestoEmpleado){
        this.numEmpleado = numEmpleado;
        this.nombEmpleado = nombEmpleado;
        this.sueldoEmpleado = sueldoEmpleado;
        this.puestoEmpleado = puestoEmpleado;
    }
    
    //Métodos get y set
    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getNombEmpleado() {
        return nombEmpleado;
    }

    public void setNombEmpleado(String nombEmpleado) {
        this.nombEmpleado = nombEmpleado;
    }

    public double getSueldoEmpleado() {
        return sueldoEmpleado;
    }

    public void setSueldoEmpleado(double sueldoEmpleado) {
        this.sueldoEmpleado = sueldoEmpleado;
    }

    public String getPuestoEmpleado() {
        return puestoEmpleado;
    }

    public void setPuestoEmpleado(String puestoEmpleado) {
        this.puestoEmpleado = puestoEmpleado;
    }
    
    
}
