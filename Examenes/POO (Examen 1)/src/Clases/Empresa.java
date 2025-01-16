/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA710
 */
public class Empresa {
    
    //ATRIBUTOS
    private int idEmpresa;
    private String nombreEmpresa;
    private double presupuesto;
    private char tipo;
    
    //CONSTRUCTORES
    //Por default
    public Empresa(){
        this.idEmpresa = 0;
        this.nombreEmpresa = "";
        this.presupuesto = 0.0;
        this.tipo = ' ';
    }
    
    //Con los atributos idEmpresa y nombreEmpresa como parámetro
    public Empresa(int idEmpresa, String nombreEmpresa){
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.presupuesto = 0.0;
        this.tipo = ' ';
    }
    
    //Con los 4 atributos como parámetros
    public Empresa(int idEmpresa, String nombreEmpresa, double presupuesto, char tipo){
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.presupuesto = presupuesto;
        this.tipo = tipo;
    }
    
    //MÉTODOS
    //Métodos get y set
    public int getIdEmpresa() {
        return idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public char getTipo() {
        return tipo;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
    
}
