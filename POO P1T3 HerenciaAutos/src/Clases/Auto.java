/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */

public class Auto {
    
    //Atributos
    private int numSerie;
    private String marca;
    private int modelo;
    private double precio;
    
    //Constructores
    public Auto(){
        this.numSerie = 0;
        this.marca = "";
        this.modelo = 0;
        this.precio = 0.0;
    }
    
    public Auto(int numSerie, String marca, int modelo, double precio){
        this.numSerie = numSerie;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    //Métodos get
    public int getNumSerie() {
        return numSerie;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
    
    //Métodos
    public double calcularTenencia(){
        double pagoTenencia = 0.0;
        double excedente;
        
        if(modelo<=2010)
            pagoTenencia = 5500;
        else if (modelo<=2015){
            pagoTenencia = 7800;
            if(precio>100000){
                excedente = (precio - 100000)*0.002;
                pagoTenencia +=excedente;
            }
        }
        else if(modelo<=2020){
            pagoTenencia = 14560;
            if(precio>134000){
                excedente = (precio - 134000)*0.038;
                pagoTenencia +=excedente;
            }
        }
        else if(modelo<=2023){
            pagoTenencia = 35000;
            if(precio>158000){
                excedente = (precio - 158000)*0.066;
                pagoTenencia +=excedente;
            }
        }
        return pagoTenencia;
    }
}
