/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AA729
 */

public class Proyecto{
    
    //CREAR UN ARRAYLIST DEL TIPO PELICULA
    public ArrayList <Pelicula> arrPelicula = new ArrayList <Pelicula>();
    
    //CREAR UN ARRAYLIST DEL TIPO ACTOR
    public ArrayList <Actor> arrActor = new ArrayList <Actor>();
    
    //MÉTODOS GET Y SET
    public ArrayList<Pelicula> getArrPelicula() {
        return arrPelicula;
    }
    public void setArrPelicula(ArrayList<Pelicula> arrPelicula) {
        this.arrPelicula = arrPelicula;
    }

    public ArrayList<Actor> getArrActor() {
        return arrActor;
    }

    public void setArrActor(ArrayList<Actor> arrActor) {
        this.arrActor = arrActor;
    }
    
    //CREAR UN OBJETO FECHA PARA CADA OBJETO ACTOR
        //USANDO EL CONSTRUCTOR CON TODOS LOS PARÁMETROS
        Fecha oF1 = new Fecha(27, 4, 1976);
        Fecha oF2 = new Fecha(9, 6, 1961);
        Fecha oF3 = new Fecha(2, 8, 1976);
        
        //USANDO EL CONSTRUCTOR POR DEFAULT
        Fecha oF4 = new Fecha();
        Fecha oF5 = new Fecha();
        
    //CREAR UN OBJETO ACTOR PARA CADA OBJETO PELÍCULA
        //USANDO EL CONSTRUCTOR CON TODOS LOS PARÁMETROS
        Actor oA1 = new Actor("Sally Hawkins", 'M', 14, oF1);
        Actor oA2 = new Actor("Michael J. Fox", 'H', 32, oF2);
        Actor oA3 = new Actor("Sam Worthington", 'H', 04, oF3);
        
        //USANDO EL CONSTRUCTOR POR DEFAULT
        Actor oA4 = new Actor(" ", ' ', 0, oF4);
        Actor oA5 = new Actor(" ", ' ', 0, oF5);
    
    //CREAR UN OBJETO EN CADA POSICIÓN DEL ARRAYLIST USANDO LOS DISTINTOS CONSTRUCTORES
        //USANDO EL CONSTRUCTOR CON TODOS LOS PARÁMETROS
        Pelicula oP1 = new Pelicula ("La Forma del Agua", 'D', "Guillermo del Toro", 2017, 2.03, true, oA1); 
        Pelicula oP2 = new Pelicula ("Volver al Futuro", 'F', "Robert Zemeckis", 1985, 1.56, true, oA2);
        Pelicula oP3 = new Pelicula ("Avatar", 'F', "James Cameron", 2009, 2.42, true, oA3);
        
        //USANDO EL CONSTRUCTOR CON EL NOMBRE DE LA PELÍCULA Y EL CREADOR COMO PARÁMETROS
        Pelicula oP4 = new Pelicula ("Indiana Jones", ' ', "Steven Spielberg", 0, 0.0, false, oA4);
        
        //USANDO EL CONSTRUCTOR POR DEFAULT
        Pelicula oP5 = new Pelicula (" ", ' ', " ", 0, 0.0, false, oA5);
        
    //MÉTODO PARA AÑADIR LOS OBJETOS PELÍCULA Y ACTOR A SUS RESPECTIVOS ARRAYLIST
    public void enviarArraylist(){
        arrPelicula.add(oP1);
        arrPelicula.add(oP2);
        arrPelicula.add(oP3);
        arrPelicula.add(oP4);
        arrPelicula.add(oP5);
        
        arrActor.add(oA1);
        arrActor.add(oA2);
        arrActor.add(oA3);
        arrActor.add(oA4);
        arrActor.add(oA5);
        }
    
    //MÉTODO PARA EVITAR QUE NO SE ACUMULEN LOS ARRAYLIST AL PRESIONAR LOS TRES BOTONES
    public void borrarArraylist(){
        arrPelicula.removeAll(arrPelicula);
        arrActor.removeAll(arrActor);
        }
    
    //HACER UN MÉTODO PARA MOSTRAR LOS DATOS DE LOS ARRAYLIST EN UNA TABLA
    public void mostrar(ArrayList <Pelicula> array, JTable tabla, ArrayList <Actor> array2, JTable tabla2){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        for(int i=0; i<array.size();i++){
            Pelicula oP = array.get(i);
            Object[] fila = {oP.getTitulo(), oP.getGenero(), oP.getCreador(), oP.getAño(), oP.getDuracion(), oP.isVisto(), oP.getActor().getNombre()};
            modelo.addRow(fila);
            }
        DefaultTableModel modelo2 = (DefaultTableModel) tabla2.getModel();
        for(int i=0; i<array2.size();i++){
            Actor oA = array2.get(i);
            Object[] fila2 = {oA.getNombre(), oA.getSexo(), oA.getNumeroDePeliculas(), oA.getFechaDeNacimiento().getDia() + "/" + oA.getFechaDeNacimiento().getMes() + "/" + oA.getFechaDeNacimiento().getAño()};
            modelo2.addRow(fila2);
            }
    }
    
    //HACER UN MÉTODO PARA MOSTRAR LAS PELICULAS MAYORES O IGUALES A 2001
    public void mayores(ArrayList <Pelicula> array, JList lista){
        DefaultListModel <String> modelo = new DefaultListModel <String>();
        for(int i=0; i<array.size();i++){
            Pelicula oP = array.get(i);
            if(oP.getAño()>=2001){
                modelo.addElement(oP.getTitulo() + " - " + oP.getGenero());
                lista.setModel(modelo);
            }
        }
    }
    
    //HACER UN MÉTODO QUE MUESTRE EL NOMBRE DE LA PELICULA MAS RECIENTE
    public void reciente(ArrayList <Pelicula> array, JLabel etiqueta){
        int mayor = 0;
        String nombre = "";
        for(int i=0; i<array.size(); i++){
            Pelicula oP = array.get(i);
            if(oP.getAño()>mayor){
                mayor = oP.getAño();
                nombre = oP.getTitulo();
            }          
        }
        etiqueta.setText(nombre);
    }
}
       
