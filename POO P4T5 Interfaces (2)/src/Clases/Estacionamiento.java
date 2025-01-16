/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */
public class Estacionamiento {

    //Atributos
    private int lugares;
    
    //Constructores
    public Estacionamiento() {
        this.lugares = 0;
    }
    
    public Estacionamiento(int lugaresdisponibles) {
        this.lugares = lugaresdisponibles;
    }
    
    //Métodos get y set
    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }
    
    //Métodos
    public int restarLugares(){
        return this.lugares --;
    }
    
    public int incrementarLugares(){
        return this.lugares ++;
    }
    
}
