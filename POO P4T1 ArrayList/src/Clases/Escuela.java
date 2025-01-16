/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Random;
import javax.swing.JTable;

/**
 *
 * @author AA729
 */
public class Escuela {
    //ATRIBUTOS
    private int numero;
    private String nombre;
    private int numAlumno;
    private char tipoEsc;
    
    //CONSTRUCTORES
    public Escuela(){
        this.numero=0;
        this.nombre="";
        this.numAlumno=0;
        this.tipoEsc=' ';
    }
    
    public Escuela(int numero, String nombre, int numAlumno, char tipoEsc){
        this.numero=numero;
        this.nombre=nombre;
        this.numAlumno=numAlumno;
        this.tipoEsc=tipoEsc;
    }
    
    //METODOS GET Y SET
    //Get
    public int getNumero(){
        return this.numero;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getNumAlumno(){
        return this.numAlumno;
    }
    
    public char getTipoEsc(){
        return this.tipoEsc;
    }
    
    //Set
    public void setNumero(int numero){
        this.numero=numero;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setNumAlumno(int numAlumno){
        this.numAlumno=numAlumno;
    }
    
    public void setTipoEsc(char tipoEsc){
        this.tipoEsc=tipoEsc;
    }
    
    //METODOS
    public void aleatorioEscuela(JTable tabla){
        Random rnd = new Random();
        String []nombres = {"Anexa", "España", "Mijares", "Cervantes",
            "Federal 8", "Eti 1", "Da Luz", "Borrego", "Federal 2"};
        
        tabla.setValueAt(rnd.nextInt(100)+1, 0, 0);
        tabla.setValueAt(nombres[rnd.nextInt(nombres.length)], 0, 1);
        tabla.setValueAt(rnd.nextInt(5000)+500, 0, 2);
        tabla.setValueAt(rnd.nextInt(2), 0, 3);
    }
}
