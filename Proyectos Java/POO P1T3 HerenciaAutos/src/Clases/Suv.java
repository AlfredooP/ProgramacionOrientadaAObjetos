/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */

public class Suv extends Auto {
    
    //Atributos
    private double capacKgs;
    
    //Constructores
    public Suv(){
        super();
        this.capacKgs = 0.0;
    }
    
    public Suv(double capacKgs, int numSerie, String marca, int modelo, double precio){
        super(numSerie, marca, modelo, precio);
        this.capacKgs = capacKgs;
    }

    //Métodos get
    public double getCapacKgs() {
        return capacKgs;
    }
    
    
}
