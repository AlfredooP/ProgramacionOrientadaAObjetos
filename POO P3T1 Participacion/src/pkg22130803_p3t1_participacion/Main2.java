/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg22130803_p3t1_participacion;

import Clases.Personas;

/**
 *
 * @author alfre
 */
public class Main2 {
    
       public static void main(String[] args) {
           
        //Crear el arreglo de tipo Persona y declararlo
        Personas [] arrPersonas = new Personas [5];
        
        //Definir los objetos del tipo Personas
        Personas oP1, oP2, oP3, oP4, oP5;
        
        //Crear los objetos con los distintos constructores
        oP1 = new Personas();
        oP2 = new Personas("GOED220375", 20000);
        oP3 = new Personas("JITH220856", "Hugo", "Gerente", 50000);
        oP4 = new Personas("PUVA040725", 10000);
        oP5 = new Personas("PEAM141180", "Martha", "Secretaria", 17000);
        
        //Agregar un objeto Personas en el arreglo
        arrPersonas[0] = oP1;
        arrPersonas[1] = oP2;
        arrPersonas[2] = oP3;
        arrPersonas[3] = oP4;
        arrPersonas[4] = oP5;
        
        //Mostrar el rfc y nombre de las personas
        for(int i=0; i<arrPersonas.length; i++){
            System.out.println("oP" + (i+1));
            System.out.println("RFC: " + arrPersonas[i].rfc);
            System.out.println("Nombre: " + arrPersonas[i].nombre);
            System.out.println(" ");
        }
        
        //Indica cual es la persona con mayor sueldo
        int sueldoMayor =-1;
        String nombreMayor = "";
        for(int i=0; i<arrPersonas.length; i++){
            if(arrPersonas[i].sueldo> sueldoMayor){
                sueldoMayor = arrPersonas[i].sueldo;
                nombreMayor = arrPersonas[i].nombre;
            }
        }
        System.out.println("El empleado con el mayor sueldo es: " + nombreMayor);
       }
}
