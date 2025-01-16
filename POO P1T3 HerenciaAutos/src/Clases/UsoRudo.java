/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */

public class UsoRudo extends Auto {
    
    //Atributos
    private int numEjes;
    private int numRodadas;
    
    //Constructores
    public UsoRudo(){
        super();
        this.numEjes = 0;
        this.numRodadas = 0;
    }
    
    public UsoRudo(int numEjes, int numRodadas, int numSerie, String marca, int modelo, double precio){
        super(numSerie, marca, modelo, precio);
        this.numEjes = numEjes;
        this.numRodadas = numRodadas;
    }
    
    //Métodos get

    public int getNumEjes() {
        return numEjes;
    }

    public int getNumRodadas() {
        return numRodadas;
    }
    
}
