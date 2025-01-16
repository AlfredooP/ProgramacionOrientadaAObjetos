/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author alfre
 */
public class Personas {
    //ATRIBUTOS
    public String rfc;
    public String nombre;
    public String ocupacion;
    public int sueldo;
    
    //CONSTRUCTORES
    
    //Constructor default
    public Personas(){
        this.rfc= "";
        this.nombre= "";
        this.ocupacion= "";
        this.sueldo= 0;
    }
    
    //Constructor con rfc y sueldo
    public Personas(String rfc, int sueldo){
        this.rfc= rfc;
        this.nombre= "";
        this.ocupacion= "";
        this.sueldo= sueldo;
    }
        
    //Constructor con todos los atributos
    public Personas(String rfc, String nombre, String ocupacion, int sueldo){
        this.rfc= rfc;
        this.nombre= nombre;
        this.ocupacion= ocupacion;
        this.sueldo= sueldo;
    }
    
    //METODOS GET Y SET
    
    //Get
    public String getRfc(){
        return rfc;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getOcupacion(){
        return ocupacion;
    }
    
    
    public int getSueldo(){
        return sueldo;
    }
    
    //Set
    public void setRfc(String rfc){
        this.rfc=rfc;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setOcupacion(String ocupacion){
        this.ocupacion=ocupacion;
    }
    
    public void setSueldo(int sueldo){
        this.sueldo=sueldo;
    }
    
    //METODOS SOBRECARGADOS
    @Override
    public String toString(){
        String mensaje = "RFC: " + rfc +
                "\nNombre: " + nombre +
                "\nOcupación: " + ocupacion +
                "\nSueldo: " + sueldo;
        return mensaje;
    }
}
    
    
    
        
