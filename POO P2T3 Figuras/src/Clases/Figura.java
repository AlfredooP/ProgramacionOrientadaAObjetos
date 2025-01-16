/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author AA729
 */
public abstract class Figura {
    
    //Atributos
    private int x;
    private int y;
    private int tamaño;
    
    //Constructores
    public Figura() {
        this.x = 0;
        this.y = 0;
        this.tamaño = 0;
    }
    
    public Figura(int x, int y, int tamaño) {
        this.x = x;
        this.y = y;
        this.tamaño = tamaño;
    }
    
    //Métodos get
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getTamaño() {
        return tamaño;
    }
    
    //Métodos set
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    
    //Métodos abstractos
    public abstract void moverDerecha();
    public abstract void moverIzquierda();
    public abstract void moverArriba();
    public abstract void moverAbajo();
    public abstract void mostrar(Graphics g, Color color);
    
    
    
    
            
}
