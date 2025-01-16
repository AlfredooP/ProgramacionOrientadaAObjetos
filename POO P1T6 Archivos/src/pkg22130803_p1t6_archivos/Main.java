/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22130803_p1t6_archivos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author AA730
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random rnd = new Random();
        
        //Clase para escribir en el archivo
        FileWriter oFW = null;
        PrintWriter oPW = null;
        
        try {
            //Crear el objeto FW
            oFW = new FileWriter("F:\\ARCHIVOS\\Programación Orientada a Objetos\\Archivos POO\\P1T6.txt", true);
            oPW = new PrintWriter(oFW);
            
            //Ciclo para almacenar los 100 numeros en el archivo de texto
            for(int i=1; i<=100; i++){
                //Instrucción para escribir en el archivo
                oPW.println("Número " + i + ": " + rnd.nextInt(1000));                
            }
            
            //Cerrar los objetos
            oPW.close();
            oFW.close();
            
            //Clase para leer del archivo de texto
            FileReader oFR = null;
            
            //Crear el objeto oFR
            oFR = new FileReader("F:\\ARCHIVOS\\Programación Orientada a Objetos\\Archivos POO\\P1T6.txt");
            
            //Declarar un entero para convertir el caracter
            int valor = oFR.read();
            
            while(valor != -1){
                 System.out.print((char)valor);
                 valor = oFR.read();
            }
            
            oFR.close();
            
        } catch (IOException ex) {
            System.out.println("Error de escritura. " + ex.getMessage());
        }
        
    }
    
}
