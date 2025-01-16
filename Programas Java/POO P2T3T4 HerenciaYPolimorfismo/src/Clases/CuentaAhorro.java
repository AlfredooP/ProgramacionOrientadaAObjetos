/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author AA729
 */
public class CuentaAhorro extends Cuenta{

    //Atributos
    private double cuotaMtto;
    
    //Constructores

    public CuentaAhorro() {
        super();
        this.cuotaMtto = 0.0;
    }

    public CuentaAhorro(double cuotaMtto, String nombre, String cuenta, double saldo, double tipoDeInteres) {
        super(nombre, cuenta, saldo, tipoDeInteres);
        this.cuotaMtto = cuotaMtto;
    }
    
    @Override
    public double comisiones() {
       LocalDate fecha = LocalDate.now();
       double comision = 0.0;
       
       if(fecha.getDayOfMonth() == 24){
           super.reintegro(cuotaMtto);
           comision = cuotaMtto;
       }
       else{
           JOptionPane.showMessageDialog(null, "No es el día primero del mes");
       }
       
       return comision;
    }

    @Override
    public double intereses() {
        LocalDate fecha = LocalDate.now();
        double interesesProducidos = 0.0;
        
        if(fecha.getDayOfMonth() == 24){
            interesesProducidos = super.getSaldo() * super.getTipoDeInteres() / 1200;
            super.ingreso(interesesProducidos);
        }
        else{
            JOptionPane.showMessageDialog(null, "No es el día primero del mes");
        }
        
        return interesesProducidos;
    }
    
}
