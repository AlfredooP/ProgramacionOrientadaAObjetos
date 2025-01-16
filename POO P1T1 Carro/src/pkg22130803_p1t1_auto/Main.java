/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22130803_p1t1_auto;

import Clases.Carro;
import java.util.Scanner;

/**
 *
 * @author AA724
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declarar objetos de la clase Carro
        Carro c1,c2,c3;
        
        //Crear el objeto c1 con el constructor por default o defecto
        c1 = new Carro();
        
        //Asignar datos al objeto c1 con los métodos set
        int idCarro, año;
        String matricula, marca;
        double precio;
        
        System.out.println("==ASIGNAR DATOS AL OBJETO C1==");
        System.out.println("Id del carro: ");
        idCarro=leer.nextInt();
        System.out.println("Matrícula: ");
        matricula=leer.next();
        System.out.println("Año: ");
        año=leer.nextInt();
        System.out.println("Marca:");
        marca=leer.next();
        System.out.println("Precio: ");
        precio=leer.nextInt();
        
        //Asignar los datos al objeto c1
        c1.setIdCarro(idCarro);
        c1.setMatricula(matricula);
        c1.setAño(año);
        c1.setMarca(marca);
        c1.setPrecio(precio);
        
        //Crear el objeto c2 con el constructor que usa todos los atributos como parámetro
        System.out.println("==ASIGNAR DATOS AL OBJETO C2==");
        System.out.println("Id del carro: ");
        idCarro=leer.nextInt();
        System.out.println("Matrícula: ");
        matricula=leer.next();
        System.out.println("Año: ");
        año=leer.nextInt();
        System.out.println("Marca:");
        marca=leer.next();
        System.out.println("Precio: ");
        precio=leer.nextInt();
        
        //Crear el objeto c2
        c2 = new Carro(idCarro, matricula, año, marca, precio);
        
        //Crear el objeto c3 con el constructor que recibe un objeto del mismo tipo como parámetro
        c3 = new Carro(c1);
        
        //Mostrar los datos del objeto c1 y c2 con los métodos get
        System.out.println("==MOSTRAR DATOS DEL OBJETO C1==");
        System.out.println("Id del carro: " + c1.getIdCarro()+
                           "\nMatricula: "+ c1.getMatricula()+
                           "\nAño: "+ c1.getAño()+
                           "\nMarca: "+ c1.getMarca()+
                           "\nPrecio: "+ c1.getPrecio());
        
        System.out.println("==MOSTRAR DATOS DEL OBJETO C2==");
        System.out.println("Id del carro: " + c2.getIdCarro()+
                           "\nMatricula: "+ c2.getMatricula()+
                           "\nAño: "+ c2.getAño()+
                           "\nMarca: "+ c2.getMarca()+
                           "\nPrecio: "+ c2.getPrecio());
        
        //Mostrar los datos del objeto c3 con el método toString()
        System.out.println("==MOSTRAR DATOS DEL OBJETO C3==");
        System.out.println(c3.toString());
    }
    
}
