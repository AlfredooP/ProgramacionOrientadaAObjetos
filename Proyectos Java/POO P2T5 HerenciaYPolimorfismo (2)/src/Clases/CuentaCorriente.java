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
public class CuentaCorriente extends Cuenta{
    
    //Atributos
    private int transacciones;
    private double importePorTrans;
    private int transExentas;
    
    //Constructores
    public CuentaCorriente() {
        super();
        this.transacciones = 0;
        this.importePorTrans = 0.0;
        this.transExentas = 0;
    }

    public CuentaCorriente(int transacciones, double importePorTrans, int transExentas, String nombre, String cuenta, double saldo, double tipoDeInteres) {
        super(nombre, cuenta, saldo, tipoDeInteres);
        this.transacciones = transacciones;
        this.importePorTrans = importePorTrans;
        this.transExentas = transExentas;
    }
    
    //Métodos get y set
    public int getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(int transacciones) {
        this.transacciones = transacciones;
    }

    public double getImportePorTrans() {
        return importePorTrans;
    }

    public void setImportePorTrans(double importePorTrans) {
        this.importePorTrans = importePorTrans;
    }

    public int getTransExentas() {
        return transExentas;
    }

    public void setTransExentas(int transExentas) {
        this.transExentas = transExentas;
    }
    
    //Métodos
    public void decrementarTransacciones(){
        this.transacciones --;
    }
    
    @Override
    public void ingreso(double cantidad){
        super.ingreso(cantidad);
        this.transacciones ++;
    }
    
    @Override
    public void reintegro(double cantidad){
        super.reintegro(cantidad);
        this.transacciones ++;
    }
    
    @Override
    public double comisiones() {
        LocalDate fecha = LocalDate.now();
        double comisiones = 0.0;
        
        if(fecha.getDayOfMonth() == 24){
            int n = this.transacciones - this.transExentas;
            if(n > 0){
                this.reintegro(n * this.importePorTrans);
                this.transacciones = 0;
                comisiones = n * this.importePorTrans;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No es el día primero del mes");
        }
        return comisiones;
    }

    @Override
    public double intereses() {
        LocalDate fecha = LocalDate.now();
        double interesesProducidos = 0.0;
        
        if(fecha.getDayOfMonth() == 24){
            if(super.getSaldo() <= 3000){
                interesesProducidos = super.getSaldo() * 0.5 / 1200;
            }
            else{
                interesesProducidos = 3000 * 0.5 / 12 + (super.getSaldo() - 3000) * super.getTipoDeInteres() / 1200;
            }
            this.decrementarTransacciones();
            super.ingreso(interesesProducidos);
        }
        else{
            JOptionPane.showMessageDialog(null, "No es el día primero del mes");
        }
        return interesesProducidos;
    }
}
