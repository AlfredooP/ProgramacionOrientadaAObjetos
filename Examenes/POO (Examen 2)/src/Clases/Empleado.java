/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA726
 */
public abstract class Empleado {
    
    //Atributos
    private String nombre;
    private String puesto;
    private double sueldo;
    
    //Constructores
    //Por defecto
    public Empleado() {
        this.nombre = "";
        this.puesto = "";
        this.sueldo = 0.0;
    }
    
    //Con todos los atributos
    public Empleado(String nombre, String puesto, double sueldo) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }
    
    //Métodos get
    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    //Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    //Método abstracto
    public abstract double calcularSueldo(int numVentas);
    
    
    
}
