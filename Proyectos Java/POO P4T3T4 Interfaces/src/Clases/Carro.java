/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.DayOfWeek;
import javax.swing.JOptionPane;

/**
 *
 * @author AA729
 */
public class Carro extends Vehiculo implements IFecha{

    //Atributos
    private String matricula;
    private int tiempo;
    
    //Constructores
    public Carro(String matricula) {
        this.matricula = matricula;
        this.tiempo = 0;
    }
    
    //Métodos get y set
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getTiempo() {
        return tiempo;
    }
    
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    //Métodos
    @Override
    public double factura(int tiempo) {
        
        if(tiempo == 24)
            return 299;
        else
            return tiempo * 25;
        
    }

    @Override
    public boolean hayLugar(Estacionamiento oEst) {
        
        if(oEst.getLugares() > 0)
            return true;
        else
            return false;
            
    }

    @Override
    public void estacionarVehiculo(Estacionamiento oEst) {
        
        if(DIA.compareTo(DayOfWeek.SATURDAY)>0 || DIA.compareTo(DayOfWeek.SUNDAY)>0){
            JOptionPane.showMessageDialog(null, "Solo se puede estacionar de Lunes a Viernes");
        }
        else{
        if(this.hayLugar(oEst)){
            JOptionPane.showMessageDialog(null, "Objeto estacionado");
            oEst.restarLugares();
        }
        else
            JOptionPane.showMessageDialog(null, "No hay lugares disponibles");
        }
    }
    
    
    
}
