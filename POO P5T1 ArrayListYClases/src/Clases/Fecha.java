/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */
public class Fecha {
    
    //ATRIBUTOS
    private int dia;
    private int mes;
    private int año;
    
    //CONSTRUCTORES
    public Fecha(){
        this.dia=0;
        this.mes=0;
        this.año=0;
    }
    
    public Fecha(int dia, int mes, int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }
    
    //METODOS GET Y SET
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    //Método para copiar de una fecha a otra
    public void copiarFecha(Fecha oFecha){
        this.dia=oFecha.getDia();
        this.mes=oFecha.getMes();
        this.año=oFecha.getAño();
    }
    
}
