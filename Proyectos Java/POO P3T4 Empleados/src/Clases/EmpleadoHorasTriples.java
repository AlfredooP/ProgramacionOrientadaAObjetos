/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */
public class EmpleadoHorasTriples extends Empleados{
    
    //Atributos
    private int numHorasTriples;
    private double sueldoHoraTriple;
    
    //Constructores

    public EmpleadoHorasTriples(){
        super();
    }
    
    public EmpleadoHorasTriples(int numHorasTriples, double sueldoHoraTriple, int id, String nombre){
        super(id, nombre);
        this.numHorasTriples = numHorasTriples;
        this.sueldoHoraTriple = sueldoHoraTriple;
    }

    @Override
    public double calcularSalario() {
        double sueldo = 0.0;
        if(numHorasTriples > 5){
            numHorasTriples = 5;
            System.out.println("Sólo se pueden pagar como máximo 5 horas triples a la semana porque es un empleado con horas extras");
        }
        else{
            sueldo = this.numHorasTriples * this.sueldoHoraTriple;
        }
        return sueldo;
    }
    
    
    
}
