/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */
public class Trapecio extends Distancia{
    //Atributos
    private double baseChica;
    private double baseGrande;
    private double altura;
    
    //Constructores
    public Trapecio(){
        this.altura = 0.0;
        this.baseChica = 0.0;
        this.baseGrande = 0.0;
    }

    public Trapecio(double baseChica, double baseGrande, double altura) {
        this.baseChica = baseChica;
        this.baseGrande = baseGrande;
        this.altura = altura;
    }
    
    //Métodos get y set

    public double getBaseChica() {
        return baseChica;
    }

    public void setBaseChica(double baseChica) {
        this.baseChica = baseChica;
    }

    public double getBaseGrande() {
        return baseGrande;
    }

    public void setBaseGrande(double baseGrande) {
        this.baseGrande = baseGrande;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    //Método para emplear el polimorfismo
    @Override
    public double calcularArea(){
        return (baseGrande + baseChica) / 2 * altura;
    }
}
