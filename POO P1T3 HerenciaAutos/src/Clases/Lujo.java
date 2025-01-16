/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */

public class Lujo extends Auto{
    
    //Atributos
    private int numCilindros;
    
    //Constructores
    public Lujo(){
        super();
        this.numCilindros = 0;
    }
    
    public Lujo(int numCilindros, int numSerie, String marca, int modelo, double precio){
        super(numSerie, marca, modelo, precio);
        this.numCilindros = numCilindros;
    }
    
    //Métodos get
    public int getNumCilindros(){
        return this.numCilindros;
    }
    
    //Métodos
    @Override
    public double calcularTenencia(){
       return super.calcularTenencia()*1.07;
    }
    
}
