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
public class Circulo extends Figura{
    //Constructores
    public Circulo() {
        super();
    }

    public Circulo(int x, int y, int tamaño) {
        super(x, y, tamaño);
    }
    
    @Override
    public void moverDerecha() {
        super.setX(super.getX()+40);
    }
    
    @Override
    public void moverIzquierda() {
        super.setX(super.getX()-80);
    }

    @Override
    public void moverArriba() {
        super.setY(super.getY()-40);
    }

    @Override
    public void moverAbajo() {
        super.setY(super.getY()+80);
    }
    
     @Override
    public void mostrar(Graphics g, Color color) {
        g.setColor(color);
        g.drawOval(super.getX(), super.getY(), super.getTamaño(), super.getTamaño());
    }
    
    
}
