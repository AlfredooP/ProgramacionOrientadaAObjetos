/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg22130803_p3t6_participacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alfre
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    try {
            
            int opcion;
            String buscar;
            String [] nombres = {"María","Ignacio", "Carlos", "Xavier", "Mauricio", "Samantha", "Pablo"};
            String [] puestos = {"Director(a)","Secretario(a)", "Supervisor(a)", "Asistente", "Gerente", "Empleado(a)", "Administrador(a)"};
            Scanner leer = new Scanner(System.in);
            Random rnd = new Random();

            do{

                    System.out.print("\nMENÚ \n1. Alta de empleados \n2. Buscar empleado \n3. Mostrar empleados \n4. Salir");
                    System.out.println("\nSELECCIONE UNA OPCIÓN");
                    opcion = leer.nextInt();
                    
                    switch(opcion){
                        case 1:
                            FileWriter oFW = new FileWriter("G:\\ARCHIVOS\\Programación Orientada a Objetos\\Archivos POO\\P3T6.txt", false);
                            PrintWriter oPW = new PrintWriter(oFW);
                            
                            for(int i=1; i<=100; i++){
                                
                                oPW.println(i);
                                oPW.println(nombres[rnd.nextInt(nombres.length)]);
                                oPW.println(puestos[rnd.nextInt(puestos.length)]);
                                oPW.println(rnd.nextInt(7000)+3000);
                                oPW.println("");
                                
                            }
                            
                            oPW.close();
                            oFW.close();
                            
                            System.out.println("Se han generado los datos exitosamente");
                            break;
                            
                        case 2:
                            System.out.println("Ingrese el número del empleado a buscar: ");
                            buscar = leer.next();
                            
                            FileReader oFR = new FileReader("G:\\ARCHIVOS\\Programación Orientada a Objetos\\Archivos POO\\P3T6.txt");
                            BufferedReader oBR = new BufferedReader(oFR);
                            String linea;
                            boolean encontrado = false;
                            
                            while((linea = oBR.readLine()) != null){
                                if(linea.equals(buscar))
                                    encontrado = true;
                                
                                if(encontrado){
                                    System.out.println("Se ha encontrado al empleado número " + buscar + ", sus datos son los siguientes:");
                                    for(int i=0;i<3;i++){
                                        System.out.println(oBR.readLine());
                                    }
                                    encontrado = false;
                                }
                                
                            }
                            oFR.close();
                            
                            break;
                            
                        case 3:
                            System.out.println("Ingrese el puesto del empleado a buscar: ");
                            buscar = leer.next();
                            
                            FileReader oFR2 = new FileReader("G:\\ARCHIVOS\\Programación Orientada a Objetos\\Archivos POO\\P3T6.txt");
                            BufferedReader oBR2 = new BufferedReader(oFR2);
                            String linea2;
                            boolean encontrado2 = false;
                            
                            while((linea2 = oBR2.readLine()) != null){
                                if(linea2.equals(buscar))
                                    encontrado2 = true;
                                
                                if(encontrado2){
                                    System.out.println("Hay una coincidencia, sus datos son los siguientes:");
                                    for(int i=0;i<1;i++){
                                        System.out.println(oBR2.readLine());
                                    }
                                    encontrado2 = false;
                                }
                                
                            }
                            oFR2.close();
                           
                            
                            break;
                            
                        case 4:
                            System.out.println("\nHas salido exitosamente");
                            break;
                            
                        default:
                            System.out.println("Opción no válida");
                    }


            }while(opcion != 4);
    }
    catch(IOException ex){
        System.out.println("Error de escritura. " + ex.getMessage());
        }
    }
    
}
