/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */
public class Sedan extends Autos{
    
    //Atributos
    private int numeroPuertas;
    
    //Constructores
    public Sedan() {
        super();
        this.numeroPuertas = 0;
    }
    
    public Sedan(String placa, String modelo, String color, String fechaVenta, int precioInicial, int numeroPuertas) {
        super(placa, modelo, color, fechaVenta, precioInicial);
        this.numeroPuertas = numeroPuertas;
    }
    
    //Métodos get y set
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    
    //Método sobreescrito
    @Override
    public double pago(){
        double porcIEPS = 0.0;
        double porcTotal = 0.0;
        double pago = 0.0;
        
        if(numeroPuertas == 2)
            porcIEPS = 0.04;
        else{
            if(numeroPuertas > 2)
                porcIEPS = 0.06;
            else
                porcIEPS = 0.03;
        }
        
        porcTotal = 0.34 + porcIEPS;
        pago = super.getPrecioInicial() + (super.getPrecioInicial() * porcTotal);
        return pago;
    }
}
