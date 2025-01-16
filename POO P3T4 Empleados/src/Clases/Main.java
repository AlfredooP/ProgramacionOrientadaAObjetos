/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author AA729
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Declarar objetos
        EmpleadoSinHorasExtras oESH;
        EmpleadoHorasDobles oEHD;
        EmpleadoHorasTriples oEHT;
        
        //Variables
        int id;
        String nombre;
        int numHoras;
        double sueldoHora;
        
        int numHorasDobles;
        double sueldoHoraDoble;
        
        int numHorasTriples;
        double sueldoHoraTriple;
        
        //Crear el objeto oESH
        System.out.println("EMPLEADO SIN HORAS EXTRAS");
        System.out.println("Id: ");
        id = leer.nextInt();
        System.out.println("Nombre: ");
        nombre = leer.next();
        System.out.println("Número de horas trabajadas (no deben pasar más de 40 horas): ");
        numHoras = leer.nextInt();
        System.out.println("Valor del sueldo por hora: ");
        sueldoHora = leer.nextDouble();
        
        oESH = new EmpleadoSinHorasExtras(id, nombre, numHoras, sueldoHora);
        
        //Mostrar el sueldo del empleado
        System.out.println("El sueldo del empleado sin horas extras es: " + oESH.calcularSalario());
   
        //Crear el objeto oEHD
        System.out.println("EMPLEADO CON HORAS EXTRAS DOBLES");
        System.out.println("Id: ");
        id = leer.nextInt();
        System.out.println("Nombre: ");
        nombre = leer.next();
        
        System.out.println("Número de horas extras dobles (no deben pasar más de 8 horas): ");
        numHorasDobles = leer.nextInt();
        System.out.println("Valor del sueldo por hora extra doble: ");
        sueldoHoraDoble = leer.nextDouble();
        
        oEHD = new EmpleadoHorasDobles(numHorasDobles, sueldoHoraDoble, id, nombre);
        
        //Mostrar el sueldo del empleado
        System.out.println("El sueldo del empleado con horas extras dobles es: " + (oEHD.getSueldoFijo() + oEHD.calcularSalario()));
        
        //Crear el objeto oEHT
        System.out.println("EMPLEADO CON HORAS EXTRAS TRIPLES");
        System.out.println("Id: ");
        id = leer.nextInt();
        System.out.println("Nombre: ");
        nombre = leer.next();
        
        System.out.println("Número de horas extras triples (no deben pasar más de 5 horas): ");
        numHorasTriples = leer.nextInt();
        System.out.println("Valor del sueldo por hora extra triple: ");
        sueldoHoraTriple = leer.nextDouble();
        
        oEHT = new EmpleadoHorasTriples(numHorasTriples, sueldoHoraTriple, id, nombre);
        
        //Mostrar el sueldo del empleado
        System.out.println("El sueldo del empleado con horas extras triples es: " + (oEHT.getSueldoFijo() + oEHT.calcularSalario()));
        
    }
    
}
