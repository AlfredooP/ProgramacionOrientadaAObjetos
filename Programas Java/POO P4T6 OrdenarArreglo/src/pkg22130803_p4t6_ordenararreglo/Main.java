/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22130803_p4t6_ordenararreglo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AA723
 */
public class Main {

    public static void quicksort(int A[], int izq, int der) {

        int pivote=A[izq]; 
        int i=izq;         
        int j=der;         
        int aux;
 
        while(i < j){                                                          
            while(A[i] <= pivote && i < j) i++; 
                while(A[j] > pivote) j--;           
                     if (i < j) {                                         
                        aux= A[i];                      
                        A[i]=A[j];
                        A[j]=aux;
                        }
        }
   
        A[izq]=A[j];                                      
        A[j]=pivote;      
   
        if(izq < j-1)
           quicksort(A,izq,j-1);          
        if(j+1 < der)
           quicksort(A,j+1,der);          
   
}

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FileWriter oFW = null;
        PrintWriter oPW = null;
        FileReader oFR = null;
        
        try{
            
            Random rnd = new Random();
            int [] numeros = new int [1000];
            
            for(int i=0; i<numeros.length; i++){
                numeros[i] = rnd.nextInt(1000);
            }
            
            //Objetos para escribir en un archivo de texto
            oFW = new FileWriter("G:\\ARCHIVOS\\Programación Orientada a Objetos\\Archivos POO\\P4T6.txt", false);
            oPW = new PrintWriter(oFW);
            
            for(int i=0; i<1000; i++){
                //Escribir en el archivo de texto
                oPW.println("Número" + (i+1) + ": " + numeros[i]);
            }
            
            //Llamar al método quicksort
            quicksort(numeros, 0, numeros.length-1);
            oFW = new FileWriter("G:\\ARCHIVOS\\Programación Orientada a Objetos\\Archivos POO\\P4T6.txt", false);
            oPW = new PrintWriter(oFW);
            
            for(int i=0; i<1000; i++){
                //Escribir en el archivo de texto
                oPW.println("Número " + (i+1) + ": " + numeros[i]);
            }
            
            //Crear el objeto oFR
            oFR = new FileReader("G:\\ARCHIVOS\\Programación Orientada a Objetos\\Archivos POO\\P4T6.txt");
            
            int valor = oFR.read();
            while(valor != -1){    
                System.out.print((char)valor);
                valor = oFR.read();
                
            }
            
        } 
        catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Error de entrada / salida. " + ex.toString());
        }
        finally{
            try{
                oFW.close();
                oFR.close();
            }
            catch(IOException ex){
                JOptionPane.showMessageDialog(null, "Error de entrada / salida. " + ex.toString());
            }
        }
        
    }
    
}
