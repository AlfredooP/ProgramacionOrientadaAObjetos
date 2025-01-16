/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22130803_p4t6_ordenararreglo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AA729
 */
public class NewMain {
    
    public static int buscarNumero(int n){
        //Leer en un archivo binario
        FileInputStream oFIS = null;
        DataInputStream oDIS= null;
        int num;
        int i=1;
        
        try
        {
            oFIS = new FileInputStream("F:\\ARCHIVOS\\Programación Orientada a Objetos\\Archivos POO\\P4T6.bin");
            oDIS = new DataInputStream(oFIS);
            
            do{
                num = oDIS.readInt();
                if(num == n)
                    return i;
                else
                    i++;
                
            }while(oDIS.available()>0);
            
            oFIS.close();
            oDIS.close();
            
        } catch (FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "No se puede crear / abrir el archivo");
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, "No se puede escribir / leer en el archivo");
        }
        
        return -1;
    }
    
    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        //Escribir en un archivo binario
        FileOutputStream oFOS = null;
        DataOutputStream oDOS = null;
        
        //Leer en un archivo binario
        FileInputStream oFIS = null;
        DataInputStream oDIS= null;
        
        try{
            oFOS = new FileOutputStream("F:\\ARCHIVOS\\Programación Orientada a Objetos\\Archivos POO\\P4T6.bin", true);
            oDOS = new DataOutputStream(oFOS);
        
            int num;
            Random rnd = new Random();
            
            for(int i=0; i<=100; i++){
                num = rnd.nextInt(1000);
                oDOS.writeInt(num);
            }
            
            oFOS.close();
            oDOS.close();
            
            oFIS = new FileInputStream("F:\\ARCHIVOS\\Programación Orientada a Objetos\\Archivos POO\\P4T6.bin");
            oDIS = new DataInputStream(oFIS);
            
            int i = 1;
            do{
                num = oDIS.readInt();
                System.out.println("Número " + i + ": num");
                i++;
            }while(oDIS.available()>0);
            
            oFIS.close();
            oDIS.close();
            
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Escribe el número a buscar: ");
            int nBuscar = leer.nextInt();
            
            //Llamar el método para buscar un número del archivo
            //La variable res recibe la posición si el número se encuentra
            //Si no se encuentra recibe un -1
            int res = buscarNumero(nBuscar);
            if(res != -1){
                System.out.println("El número se encuentra en la posición " + res);
            }
            else{
                System.out.println("El número no se encuentra en el archivo");
            }
            
        }
        catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "No se puede crear / abrir el archivo");
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "No se puede escribir / leer en el archivo");
        }
    
    }
}
