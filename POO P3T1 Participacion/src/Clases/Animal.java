/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */
public class Animal {
    
    //ATRIBUTOS
    public int numero;
    public String nombre;
    public String tipo;
    public int dia;
    public int mes;
    public int año;
    
    //CONSTRUCTORES
    
    //Constructor default
    public Animal(){
        this.numero= 0;
        this.nombre= "";
        this.tipo= "";
        this.dia= 0;
        this.mes= 0;
        this.año= 0;
    }
    
    //Constructor con número y nombre
    public Animal(int numero, String nombre){
        this.numero= numero;
        this.nombre= nombre;
        this.tipo= "";
        this.dia= 0;
        this.mes= 0;
        this.año= 0;
    }
    
    //Constructor con todos los atributos
    public Animal(int numero, String nombre, String tipo, int dia, int mes, int año){
        this.numero= numero;
        this.nombre= nombre;
        this.tipo= tipo;
        this.dia= dia;
        this.mes= mes;
        this.año= año;
    }
    
    //METODOS SOBRECARGADOS
    @Override
    public String toString(){
        String mensaje = "Numero: " + numero +
                "\nNombre: " + nombre +
                "\nTipo: " + tipo +
                "\nDía: " + dia +
                "\nMes: " + mes +
                "\nAño: " + año;
        return mensaje;
    }
    
}
