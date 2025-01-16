/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */
public class EmpleadoSinHorasExtras extends Empleados{
    
    //Constructores
    public EmpleadoSinHorasExtras(){
        super();
    }

    public EmpleadoSinHorasExtras(int id, String nombre, int numHoras, double sueldoHora) {
        super(id, nombre, numHoras, sueldoHora);
    }
    
    @Override
    public double calcularSalario(){
        double sueldo = 0.0;
        if(super.getNumHoras()>40){
            super.setNumHoras(40);
            System.out.println("Sólo se pueden pagar como máximo 40 horas a la semana");
        }
        
        sueldo = super.getNumHoras() * super.getSueldoHora();
        return sueldo;
    }
}
