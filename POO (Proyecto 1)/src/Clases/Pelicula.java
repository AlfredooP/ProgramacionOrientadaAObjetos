/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA729
 */
public class Pelicula {
    
//ATRIBUTOS
    private String titulo;
    private char genero;
    private String creador;
    private int año;
    private double duracion;
    private boolean visto;
    private Actor actor;
    
//CONSTRUCTORES
    //POR DEFECTO
    public Pelicula(){
        this.titulo = "";
        this.genero = ' ';
        this.creador = "";
        this.año = 0;
        this.duracion = 0.0;
        this.visto = false;
        this.actor = null;
    }
    
    //CON EL TITULO Y EL CREADOR
    public Pelicula(String titulo, String creador){
        this.titulo = titulo;
        this.genero = ' ';
        this.creador = creador;
        this.año = 0;
        this.duracion = 0.0;
        this.visto = false;
        this.actor = null;
    }
    
    //CON TODOS LOS ATRIBUTOS
    public Pelicula(String titulo, char genero, String creador, int año, double duracion, boolean visto, Actor actor){
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.año = año;
        this.duracion = duracion;
        this.visto = visto;
        this.actor = actor;
    }
    
    //MÉTODOS GET Y SET
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }
    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }

    public double getDuracion() {
        return duracion;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public boolean isVisto() {
        return visto;
    }
    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    
}
