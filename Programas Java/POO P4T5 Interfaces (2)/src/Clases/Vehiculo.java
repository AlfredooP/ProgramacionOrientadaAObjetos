/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */
public abstract class Vehiculo {
    
    public abstract double factura(int tiempo);
    public abstract boolean hayLugar(Estacionamiento oEst);
    public abstract void estacionarVehiculo(Estacionamiento oEst);    
    
}
