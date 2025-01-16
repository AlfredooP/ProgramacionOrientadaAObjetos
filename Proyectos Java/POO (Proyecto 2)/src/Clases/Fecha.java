/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Clases;

import java.time.LocalDate;

/**
 *
 * @author Puentes Vargas Alfredo - 22130803
 */
public interface Fecha {
    
    //CREACIÓN DEL OBJETO FECHA
    LocalDate oFecha = LocalDate.now();
    
    //CONSTANTE
    public static final int DIA = oFecha.getDayOfMonth();
    
}
