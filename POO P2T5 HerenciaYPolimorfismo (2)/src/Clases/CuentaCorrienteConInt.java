/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDate;

/**
 *
 * @author AA729
 */
public class CuentaCorrienteConInt extends CuentaCorriente{
    
    //Constructores
    public CuentaCorrienteConInt() {
        super();
    }

    public CuentaCorrienteConInt(int transacciones, double importePorTrans, int transExentas, String nombre, String cuenta, double saldo, double tipoDeInteres) {
        super(transacciones, importePorTrans, transExentas, nombre, cuenta, saldo, tipoDeInteres);
    }
    
    //Métodos
    @Override
    public double intereses(){
        LocalDate fecha = LocalDate.now();
        double interesesProducidos = 0.0;
        
        if(fecha.getDayOfMonth() != 1 || super.getSaldo() < 3000){
            return interesesProducidos;
        }
        else{
            interesesProducidos = super.getSaldo() * super.getTipoDeInteres() / 1200;
            super.ingreso(interesesProducidos);
            super.decrementarTransacciones();
            
            return interesesProducidos;
        }
        
    }
}
