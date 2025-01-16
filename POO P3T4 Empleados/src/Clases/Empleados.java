/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */
public abstract class Empleados {
    
    //Atributos
    private int id;
    private String nombre;
    private int numHoras;
    private double sueldoHora;
    private final double sueldoFijo = 10000;
    
    //Constructores
    public Empleados() {
        this.id = 0;
        this.nombre = "";
        this.numHoras = 0;
        this.sueldoHora = 0.0;
    }

    public Empleados(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Empleados(int id, String nombre, int numHoras, double sueldoHora) {
        this.id = id;
        this.nombre = nombre;
        this.numHoras = numHoras;
        this.sueldoHora = sueldoHora;
    }
    
    //Métodos get y set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public double getSueldoHora() {
        return sueldoHora;
    }

    public void setSueldoHora(double sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    public double getSueldoFijo() {
        return sueldoFijo;
    }
    
    //Métodos abstractos
    public abstract double calcularSalario();
    
    
}
