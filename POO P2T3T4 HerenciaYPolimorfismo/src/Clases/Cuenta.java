/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */
public abstract class Cuenta {
    
    //Atributos
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoDeInteres;
    
    //Constructores
    public Cuenta() {
        this.nombre = "";
        this.cuenta = "";
        this.saldo = 0.0;
        this.tipoDeInteres = 0.0;
    }

    public Cuenta(String nombre, String cuenta, double saldo, double tipoDeInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoDeInteres = tipoDeInteres;
    }
    
    //Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoDeInteres() {
        return tipoDeInteres;
    }

    public void setTipoDeInteres(double tipoDeInteres) {
        this.tipoDeInteres = tipoDeInteres;
    }
    
    //Métodos abstractos
    public abstract double comisiones();
    public abstract double intereses();
    
    //Métodos
    public void ingreso(double cantidad){
        saldo += cantidad;
    }
    
    public void reintegro(double cantidad){
        saldo -= cantidad;
    }
}
