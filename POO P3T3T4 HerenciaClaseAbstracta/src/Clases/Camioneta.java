/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */
public class Camioneta extends Autos{
    
    //Atributos
    private int pesoTon;
    
    //Constructores
    public Camioneta() {
        super();
        this.pesoTon = 0;
    }

    public Camioneta(String placa, String modelo, String color, String fechaVenta, int precioInicial, int pesoTon) {
        super(placa, modelo, color, fechaVenta, precioInicial);
        this.pesoTon = pesoTon;
    }
    
    //Métodos get y set
    public int getPesoTon() {
        return pesoTon;
    }
    public void setPesoTon(int pesoTon) {
        this.pesoTon = pesoTon;
    }
    
    
    //Método sobreescrito
    @Override
    public double pago() {
        double porcIEPS = 0.0;
        double porcTotal = 0.0;
        double pago = 0.0;
        
        if(pesoTon > 400)
            porcIEPS = 0.07;
        else
            porcIEPS = 0.03;
        
        porcTotal = 0.38 + porcIEPS;
        pago = super.getPrecioInicial() + (super.getPrecioInicial() * porcTotal);
        return pago;
    }
}
