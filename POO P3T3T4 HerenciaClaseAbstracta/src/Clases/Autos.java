/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */
public abstract class Autos {
    
    //Atributos
    private String placa;
    private String modelo;
    private String color;
    private String fechaVenta;
    private int precioInicial;
    
    //Constructores
    public Autos() {
        this.placa = "";
        this.modelo = "";
        this.color = "";
        this.fechaVenta = "";
        this.precioInicial = 0;
    }

    public Autos(String placa, String modelo, String color, String fechaVenta, int precioInicial) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.fechaVenta = fechaVenta;
        this.precioInicial = precioInicial;
    }
    
    //Métodos get y set
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }
    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getPrecioInicial() {
        return precioInicial;
    }
    public void setPrecioInicial(int precioInicial) {
        this.precioInicial = precioInicial;
    }    
    
    //Métodos abstractos
    public abstract double pago();
    
}
