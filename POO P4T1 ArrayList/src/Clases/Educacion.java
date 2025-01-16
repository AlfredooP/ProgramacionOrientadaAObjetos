/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AA729
 */
public class Educacion {
    //ATRIBUTOS
    private ArrayList <Escuela> arrEsc;
    
    //CONSTRUCTORES
    public Educacion(){
        arrEsc = new ArrayList();
    }
    
    //METODOS
    public void guardarEscuela (Escuela oEsc){
        arrEsc.add(oEsc);
    }
    
    public void mostrarArrayList (JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(arrEsc.size());
        
        for(int i=0; i<arrEsc.size(); i++){
        tabla.setValueAt(arrEsc.get(i).getNumero(), i, 0);
        tabla.setValueAt(arrEsc.get(i).getNombre(), i, 1);
        tabla.setValueAt(arrEsc.get(i).getNumAlumno(), i, 2);
        tabla.setValueAt(arrEsc.get(i).getTipoEsc(), i, 3);
        }
    }
    
    public void modificarEscuela (Escuela oEsc, int indice){
        arrEsc.set(indice, oEsc);
    }
    
    public void eliminarEscuela(int indice){
        arrEsc.remove(indice);
    }
    
    public void totalEscuelas(JLabel etiqPublica, JLabel etiqPrivada){
        int contPublicas = 0;
        int contPrivadas = 0;
        
        for(int i=0; i<arrEsc.size(); i++){
            if(arrEsc.get(i).getTipoEsc() == '0')
                contPublicas++;
            else
                contPrivadas++;
            etiqPublica.setText(contPublicas + "");
            etiqPrivada.setText(contPrivadas + "");
        }
            
                
    }
}
