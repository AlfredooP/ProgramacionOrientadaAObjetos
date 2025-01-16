/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author AA710
 */
public class Franquicia {
    
    //ATRIBUTOS
    private ArrayList<Empresa> ArrayList1;
    
    //CONSTRUCTORES
    //Por Default
    public Franquicia(){
        ArrayList1 = new ArrayList();
    }
    
    //MÉTODOS
    //Métodos get y set
    public ArrayList<Empresa> getArrayList1() {
        return ArrayList1;
    }

    public void setArrayList1(ArrayList<Empresa> ArrayList1) {
        this.ArrayList1 = ArrayList1;
    }
    
    //Guardar un objeto empresa en el Array List
    public void guardarObjetoEmpresa(Empresa oEmpresa){
        this.ArrayList1.add(oEmpresa);
    }
    
    //Crear un método sobrecargado toString() para mostrar todos los datos de los objetos
    @Override
    public String toString(){
        String cad = "";
        for(int i = 0; i < ArrayList1.size(); i++){
        cad += "\nId Empresa: " + ArrayList1.get(i).getIdEmpresa() + 
                "\nNombre empresa: " + ArrayList1.get(i).getNombreEmpresa() +
                "\nPresupuesto: " + ArrayList1.get(i).getPresupuesto() +
                "\nTipo: " + ArrayList1.get(i).getTipo() +
                "\n===========================================================";
        }
        return cad;
    }
    
    //Método que calcule y muestre el presupuesto promedio de todos los objetos Empresa 
    public double calcularPresupuesto(){
        double suma = 0;
        for(int i = 0; i < ArrayList1.size(); i++){
            suma += ArrayList1.get(i).getPresupuesto();
        }
        return suma/ArrayList1.size();
    }
    
    
}
