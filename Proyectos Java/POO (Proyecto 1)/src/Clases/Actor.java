/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */
public class Actor {
    
//ATRIBUTOS
    private String nombre;
    private char sexo;
    private int numeroDePeliculas;
    private Fecha fechaDeNacimiento;
    
//CONSTRUCTORES
    //POR DEFAULT
    public Actor(){
        this.nombre = "";
        this.sexo = ' ';
        this.numeroDePeliculas = 0;
        this.fechaDeNacimiento = null;
    }
    
    //CON TODOS LOS ATRIBUTOS
    public Actor(String nombre, char sexo, int numeroDePeliculas, Fecha fechaDeNacimiento){
        this.nombre = nombre;
        this.sexo = sexo;
        this.numeroDePeliculas = numeroDePeliculas;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
//METODOS GET Y SET
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getNumeroDePeliculas() {
        return numeroDePeliculas;
    }
    public void setNumeroDePeliculas(int numeroDePeliculas) {
        this.numeroDePeliculas = numeroDePeliculas;
    }

    public Fecha getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
