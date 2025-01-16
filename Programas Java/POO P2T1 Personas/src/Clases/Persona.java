/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author AA729
 */
public class Persona {
    
    //Atributos
    private String nombre;
    private int edad;
    private double estatura;
    private char sexo;
    private int dia;
    private int mes;
    private int año;
    
    //Constructores
    
    //Por defecto
    public Persona(){
        this.nombre="";
        this.edad=0;
        this.estatura=0.0;
        this.sexo=' ';
        this.dia=0;
        this.mes=0;
        this.año=0;
    }
    
    //Con todos los atributos como parámetros
    public Persona(String nombre, int edad, double estatura, char sexo, int dia, int mes, int año){
        this.nombre=nombre;
        this.edad=edad;
        this.estatura=estatura;
        this.sexo=sexo;
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }
    
    //Con la edad generada aleatoriamente
    public Persona(String nombre, double estatura, char sexo, int dia, int mes){
        this.nombre = nombre;
        Random rnd = new Random();
        this.edad=rnd.nextInt(100)+1;
        this.sexo=sexo;
        this.dia=dia;
        this.mes=mes;
        this.año=2023-edad;        
    }

  
    //Métodos get y set
    
    //Get
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public double getEstatura(){
        return estatura;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAño(){
        return año;
    }
    
    //Set
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void setEstatura(double estatura){
        this.estatura=estatura;
    }
    
    public void setSexo(char sexo){
        this.sexo=sexo;
    }
    
    public void setDia(int dia){
        this.dia=dia;
    }
    
    public void setMes(int mes){
        this.mes=mes;
    }
    
    public void setAño(int año){
        this.año=año;
    }
    
    //Métodos
    private boolean esBisiesto(){
        if((año%4 == 0) && (año%100 != 0) || (año%400 == 0))
            return true;
        else
            return false;
    }
    
    public boolean verificarFecha(){
        boolean bandDia=false, bandMes=false, bandAño=false;
        
        if(año>=1930){
            bandAño=true;
            
            if(mes>=0 && mes<13){
                bandMes=true;
                switch(mes){
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if(dia>0 && dia<31)
                            bandDia=true;
                        else
                            JOptionPane.showMessageDialog(null, "El dia no es válido");
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if(dia>0 && dia<32)
                            bandDia=true;
                        else
                            JOptionPane.showMessageDialog(null, "El día no es válido");
                        break;
                    case 2:
                        if (esBisiesto())
                            if(dia>0 && dia<30)
                                bandDia = true;
                            else
                                JOptionPane.showMessageDialog(null, "El día no es válido");
                        else
                            if(dia>0 && dia<29)
                                bandDia=true;
                            else
                                JOptionPane.showMessageDialog(null, "El día no es válido");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El mes no es válido");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El año no es válido");
        }
        return bandDia && bandMes && bandAño;
    }
    
    public boolean esMayorDeEdad(){
        if(edad>17)
            return true;
        else
            return false;
    }
    
    public void mostrarDatos(JTable tabla){
        tabla.setValueAt(nombre, 0, 0);
        tabla.setValueAt(edad, 0, 1);
        tabla.setValueAt(estatura, 0, 2);
        tabla.setValueAt(sexo, 0, 3);
        tabla.setValueAt(dia, 0, 4);
        tabla.setValueAt(mes, 0, 5);
        tabla.setValueAt(año, 0, 6);
    }
}

