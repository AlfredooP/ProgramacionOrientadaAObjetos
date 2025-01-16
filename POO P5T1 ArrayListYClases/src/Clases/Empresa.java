/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author alfre
 */
public class Empresa {
    //ATRIBUTOS
    private String nombre;
    private Gerente gerente;
    private Ubicacion ubicacion;
    private ArrayList<Empleado> arrayEmpleados;
    
    //CONSTRUCTORES
    public Empresa(){
        this.nombre="";
        this.gerente=null;
        this.ubicacion=null;
        this.arrayEmpleados=null;
    }
    
    public Empresa(String nombre, Gerente gerente, Ubicacion ubicacion, ArrayList<Empleado> arrayEmpleados){
        this.nombre=nombre;
        this.gerente=gerente;
        this.ubicacion=ubicacion;
        this.arrayEmpleados=arrayEmpleados;
    }
    
    //MÉTODOS GET Y SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Empleado> getArrayEmpleados() {
        return arrayEmpleados;
    }

    public void setArrayEmpleados(ArrayList<Empleado> arrayEmpleados) {
        this.arrayEmpleados = arrayEmpleados;
    }
    
     //Método para copiar de una empresa a otra
    public void copiarEmpresa(Empresa oEmpresa){
        this.nombre=oEmpresa.getNombre();
        this.gerente=oEmpresa.getGerente();
        this.ubicacion=oEmpresa.getUbicacion();
        this.arrayEmpleados=oEmpresa.getArrayEmpleados();
    }
}
