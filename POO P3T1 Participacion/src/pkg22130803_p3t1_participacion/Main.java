/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22130803_p3t1_participacion;

import Clases.Animal;

/**
 *
 * @author AA729
 */
public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Crear el arreglo de tipo Animal y declararlo
        Animal [] arrAnimales = new Animal [5];
        
        //Definir los objetos del tipo Animal
        Animal oA1, oA2, oA3, oA4, oA5;
        
        //Crear los objetos con los distintos constructores
        oA1 = new Animal();
        oA2 = new Animal(1, "Larry");
        oA3 = new Animal(2, "Joss", "Felino", 23, 5, 2020);
        oA4 = new Animal(3, "Pecas", "Ave", 1, 1, 2023);
        oA5 = new Animal(4, "Lucas");
        
        //Agregar un objeto Animal en el arreglo
        arrAnimales[0] = oA1;
        arrAnimales[1] = oA2;
        arrAnimales[2] = oA3;
        arrAnimales[3] = oA4;
        arrAnimales[4] = oA5;
        
        //Mostrar el número y nombre de los animales
        for(int i=0; i<arrAnimales.length; i++){
            System.out.println("oA" + (i+1));
            System.out.println("Número: " + arrAnimales[i].numero);
            System.out.println("Nombre: " + arrAnimales[i].nombre);
            System.out.println(" ");
        }
        
        //Indica cual es el año mas reciente
        int añoMayor =-1;
        String nombreMayor = "";
        for(int i=0; i<arrAnimales.length; i++){
            if(arrAnimales[i].año> añoMayor){
                añoMayor = arrAnimales[i].año;
                nombreMayor = arrAnimales[i].nombre;
            }
        }
        System.out.println("El animal con el año más reciente es: " + nombreMayor);
        
        
    }
    
}
