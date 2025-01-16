/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */
public class Rectangulo extends Distancia{
    //Atributos
    private double base;
    private double altura;
    
    //Constructores
    public Rectangulo() {
        this.base = 0.0;
        this.altura = 0.0;
    }
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Métodos get y set
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //Método de polimorfismo
    @Override
    public double calcularArea(){
        return base*altura;
    }
    
}
