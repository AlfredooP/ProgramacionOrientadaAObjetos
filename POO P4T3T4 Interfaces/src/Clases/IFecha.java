/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Clases;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author AA729
 */
public interface IFecha {

    LocalDate oDate = LocalDate.now();
    
    //Constante
    public static final DayOfWeek DIA = oDate.getDayOfWeek();
    
}
