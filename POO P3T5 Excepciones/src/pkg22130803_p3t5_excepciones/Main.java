/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22130803_p3t5_excepciones;

import java.util.InputMismatchException;
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
        
        try{
            Object num = new Integer(5);
            System.out.println(num);
            
            int [] numeros = {1,2,3,4,5};
            System.out.println(numeros[4]);
            
            int [] enteros = new int[10];
            
            Object objeto = 5;
            System.out.println(objeto.toString());

            int numerador = 10;
            int denominador = 2;
            double division = numerador/denominador;	
            System.out.println(division);

            int edad;
            Scanner leer = new Scanner(System.in);
            System.out.println("Escribe tu edad: ");
            edad = leer.nextInt();
        }
        
        catch(ClassCastException ex){
            System.out.println("No se puede cambiar el tipo de dato: " + ex.toString());
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("No se puede accesar a la posición del arreglo: " + ex.toString());
        }
        catch(NegativeArraySizeException ex){
            System.out.println("no se puede crear un arreglo con un tipo de dato entero: " + ex.toString());
        }
        catch(NullPointerException ex){
            System.out.println("El objeto no ha sido creado: " + ex.toString());
        }
        catch(ArithmeticException ex){
            System.out.println("Error aritmético: " + ex.toString());
        }
        catch(InputMismatchException ex){
            System.out.println("Escribe el dato correctamente: ");
        }
        
        finally{
            System.out.println("Programa terminado!");
        }
    }
    
}
