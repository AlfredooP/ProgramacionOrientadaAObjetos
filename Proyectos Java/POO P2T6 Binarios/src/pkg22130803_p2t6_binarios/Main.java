/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22130803_p2t6_binarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AA729
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static double promedio(){
        
        double suma = 0.0;
        
        try{
            //Objetos para leer del archivo binario
            FileInputStream oFIS = null;
            DataInputStream oDIS = null;
            
            //Crear los objetos
            oFIS = new FileInputStream("F:\\ARCHIVOS\\Programación Orientada a Objetos\\Archivos POO\\P2T6.bin");
            oDIS = new DataInputStream(oFIS);
            
            do{
                oDIS.readInt();
                oDIS.readUTF();
                suma += oDIS.readDouble();
            }while(oDIS.available()>0);
            
        }
        catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error de archivo. " + ex.getMessage());
        }
        catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Error de lectura / escritura. " + ex.getMessage());
        }
        return suma / 5;
    }
    
    public static void main(String[] args) {
        
        //Objetos para escribir en el archivo binario
        FileOutputStream oFOS = null;
        DataOutputStream oDOS = null;
        int matricula;
        String nombre;
        double promedio;
        Scanner leer = new Scanner(System.in);
        
        try{
            //Crear el objeto oFOS para accesar al archivo binario
            oFOS = new FileOutputStream("F:\\ARCHIVOS\\Programación Orientada a Objetos\\Archivos POO\\P2T6.bin", false);
            
            //Crear el objeto ODOS
            oDOS = new DataOutputStream(oFOS);
            
            //Ciclo para solicitar los datos y guardarlos en el archivo
            for(int i=1; i<=5; i++){
                System.out.println("Matrícula estudiante " + i + ": ");
                matricula = leer.nextInt();
                System.out.println("Nombre estudiante " + i + ": ");
                nombre = leer.next();
                System.out.println("Promedio estudiante " + i + ": ");
                promedio = leer.nextDouble();
                
                    //Escribir en el archivo binario
                    oDOS.writeInt(matricula);
                    oDOS.writeUTF(nombre);
                    oDOS.writeDouble(promedio);
            }
            
            oFOS.close();
            oDOS.close();
            
            //Objetos para leer del archivo binario
            FileInputStream oFIS = null;
            DataInputStream oDIS = null;
            
            //Crear los objetos
            oFIS = new FileInputStream("F:\\ARCHIVOS\\Programación Orientada a Objetos\\Archivos POO\\P2T6.bin");
            oDIS = new DataInputStream(oFIS);
            
            int i=1;
            do{
                //Leer del archivo binario
                matricula = oDIS.readInt();
                nombre = oDIS.readUTF();
                promedio = oDIS.readDouble();
                
                System.out.println("Matrícula estudiante "+ i + ": " + matricula);
                System.out.println("Nombre estudiante "+ i + ": " + nombre);
                System.out.println("Promedio estudiante "+ i + ": " + promedio);
                i++;
                
            }while(oDIS.available()>0);
            
            oFIS.close();
            oDIS.close();
            
        }
        catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error de archivo. " + ex.getMessage());
        }
        catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Error de lectura / escritura. " + ex.getMessage());
        }
        
        //Mandar llamar el método
        System.out.println("El promedio general es: " + promedio());
    }
    
}
