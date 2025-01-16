/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */
public class SUV extends Autos{
    
    //Atributos
    private int numPasajeros;
    
    //Constructores
    public SUV() {
        super();
        this.numPasajeros = 0;
    }

    public SUV(String placa, String modelo, String color, String fechaVenta, int precioInicial, int numPasajeros) {
        super(placa, modelo, color, fechaVenta, precioInicial);
        this.numPasajeros = numPasajeros;
    }
    
    //Métodos get y set
    public int getNumPasajeros() {
        return numPasajeros;
    }
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    
    //Método sobreescrito
    @Override
    public double pago() {
        double porcIEPS = 0.0;
        double porcTotal = 0.0;
        double pago = 0.0;
        
        if(numPasajeros > 4)
            porcIEPS = 0.08;
        else
            porcIEPS = 0.03;
        
        porcTotal = 0.35 + porcIEPS;
        pago = super.getPrecioInicial() + (super.getPrecioInicial() * porcTotal);
        return pago;
    }
}
