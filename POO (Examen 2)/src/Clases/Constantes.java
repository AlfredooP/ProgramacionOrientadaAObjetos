/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Clases;

import java.time.LocalDate;

/**
 *
 * @author AA726
 */
public interface Constantes {
    
    //Constante
    public static final double sueldo = 12500;
    
    //Método 
    public double regresarSueldo();
    
    
    //Constante dia
    LocalDate oDate = LocalDate.now();
    
    public static final int DIA = oDate.getDayOfMonth();
    
    
}
