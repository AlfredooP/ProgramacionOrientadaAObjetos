/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Random;
import javax.swing.JTable;

/**
 *
 * @author AA729
 */
public class Empleado {
    
    //ATRIBUTOS
    private String nombre;
    private String puesto;
    private Fecha fechaNac;
    
    //CONSTRUCTORES
    public Empleado(){
        this.nombre="";
        this.puesto="";
        this.fechaNac=null;
    }
    
    public Empleado(String nombre, String puesto, Fecha fechaNac){
        this.nombre=nombre;
        this.puesto=puesto;
        this.fechaNac=fechaNac;
    }
    
    //MÉTODOS GET Y SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Fecha getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    //Método para copiar de un empleado a otro
    public void copiarEmpleado(Empleado oEmpleado){
        this.nombre=oEmpleado.getNombre();
        this.puesto=oEmpleado.getPuesto();
        this.fechaNac=oEmpleado.getFechaNac();
    }
    
    public void aleatorioEmpleado(JTable tabla){
        String[]nombres = {"Carlos", "José", "María", "Esteban", "Luis", "Patricia"};
        String[]apellidos = {"Arenas", "Betancourt", "Canales", "Díaz", "Flores", "González", "Ibarra", "Jiménez", "López", "Macías", "Núñez"};
        String[]puestos = {"Operario", "Técnico", "Ingeniero", "Secretario(a)", "Jefe", "Contador"};
        Random rnd = new Random();
        
        tabla.setValueAt(nombres[rnd.nextInt(nombres.length)] + " " + 
                         apellidos[rnd.nextInt(apellidos.length)] + " " +
                         apellidos[rnd.nextInt(apellidos.length)], 0, 0);
        tabla.setValueAt(puestos[rnd.nextInt(puestos.length)], 0, 1);
        tabla.setValueAt(rnd.nextInt(28)+1, 0, 2);
        tabla.setValueAt(rnd.nextInt(12)+1, 0, 3);
        tabla.setValueAt(rnd.nextInt(40)+1960, 0, 4);
    }
}
