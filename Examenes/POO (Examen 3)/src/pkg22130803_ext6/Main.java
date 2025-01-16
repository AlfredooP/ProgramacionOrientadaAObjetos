/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22130803_ext6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AA727
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
        String sexo;
        String  edad;
        String estatura;
        String ocupacion;
        Scanner teclado = new Scanner(System.in);
        
        try {
            FileWriter oFW = new FileWriter("C:\\Users\\Usuario\\Downloads\\examen\\examen.txt", true);
            PrintWriter oPW = new PrintWriter(oFW);
            
            System.out.println("Ingrese el número de personas a generar: ");
            int numPersonas = teclado.nextInt();
            
            for(int i=0; i<numPersonas; i++){
                System.out.println("PERSONA " + (i+1));
                System.out.println("Nombre:");
                nombre = teclado.next();
                oPW.print(nombre + "   ");
                System.out.println("Sexo:");
                sexo = teclado.next();
                oPW.print(sexo + "   ");
                System.out.println("Edad:");
                edad = teclado.next();
                oPW.print(edad + " años   ");
                System.out.println("Estatura:");
                estatura = teclado.next();
                oPW.print(estatura + " cm.   ");
                System.out.println("Ocupación:");
                ocupacion = teclado.next();
                oPW.print(ocupacion + "   ");
                
                oPW.println();
            }
            oFW.close();
            oPW.close();
            
            FileReader oFR = new FileReader("C:\\Users\\Usuario\\Downloads\\examen\\examen.txt");
            BufferedReader oBR = new BufferedReader(oFR);
            
            System.out.println("\nNOMBRE    SEXO    EDAD    ESTATURA    OCUPACIÓN");
            
            for(int i=0; i<numPersonas; i++){
                System.out.println(oBR.readLine());
            }
            
            oFR.close();
            oBR.close();
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error de lectura / escritura");
        }
    
        
    }
    
}
