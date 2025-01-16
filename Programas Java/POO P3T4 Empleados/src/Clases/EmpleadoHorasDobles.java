/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */
public class EmpleadoHorasDobles extends Empleados{

    //Atributos
    private int numHorasDobles;
    private double sueldoHoraDoble;
    
    //Constructores
    public EmpleadoHorasDobles() {
        super();
    }

    public EmpleadoHorasDobles(int numHorasDobles, double sueldoHoraDoble, int id, String nombre){
        super(id, nombre);
        this.numHorasDobles = numHorasDobles;
        this.sueldoHoraDoble = sueldoHoraDoble;
    }
    
    @Override
    public double calcularSalario() {
        double sueldo = 0.0;
        if(numHorasDobles > 8){
            numHorasDobles = 8;
            System.out.println("Sólo se pueden pagar como máximo 8 horas dobles a la semana porque es un empleado con horas extras");
        }
        else{
            sueldo = this.numHorasDobles * this.sueldoHoraDoble;
        }
        return sueldo;
    }
    
}
