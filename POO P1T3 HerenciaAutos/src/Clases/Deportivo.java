/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */

public class Deportivo extends Auto{
    
    //Atributos
    private int numPasajeros;
    
    //Constructores
    public Deportivo(){
        super();
        this.numPasajeros = 0;
    }
    
    public Deportivo(int numPasajeros, int numSerie, String marca, int modelo, double precio){
        super(numSerie, marca, modelo, precio);
        this.numPasajeros = numPasajeros;
    }
    
    //Métodos get
    public int getNumPasajeros(){
        return this.numPasajeros;
    }
}
