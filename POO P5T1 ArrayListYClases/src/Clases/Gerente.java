/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Random;
import javax.swing.JTable;

/**
 *
 * @author alfre
 */
public class Gerente {
    
    //ATRIBUTOS
    private String nombre;
    private double sueldo;
    private Fecha fechaNac;
    
    //CONSTRUCTORES
    public Gerente(){
        this.nombre="";
        this.sueldo=0.0;
        this.fechaNac=null;
    }
    
    public Gerente(String nombre, double sueldo, Fecha fechaNac){
        this.nombre=nombre;
        this.sueldo=sueldo;
        this.fechaNac=fechaNac;
    }
    
    //MÉTODOS GET Y SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Fecha getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    //Método para copiar de un gerente a otro
    public void copiarGerente(Gerente oGerente){
        this.nombre=oGerente.getNombre();
        this.sueldo=oGerente.getSueldo();
        this.fechaNac=oGerente.getFechaNac();
    }
    
     public void aleatorioGerente(JTable tabla){
        String[]nombres = {"Carlos", "José", "María", "Esteban", "Luis", "Patricia"};
        String[]apellidos = {"Arenas", "Betancourt", "Canales", "Díaz", "Flores", "González", "Ibarra", "Jiménez", "López", "Macías", "Núñez"};
        Random rnd = new Random();
        
        tabla.setValueAt(nombres[rnd.nextInt(nombres.length)] + " " + 
                         apellidos[rnd.nextInt(apellidos.length)] + " " +
                         apellidos[rnd.nextInt(apellidos.length)], 0, 0);
        tabla.setValueAt(rnd.nextInt(50000)+50000, 0, 1);
        tabla.setValueAt(rnd.nextInt(28)+1, 0, 2);
        tabla.setValueAt(rnd.nextInt(12)+1, 0, 3);
        tabla.setValueAt(rnd.nextInt(40)+1960, 0, 4);
    }
}
