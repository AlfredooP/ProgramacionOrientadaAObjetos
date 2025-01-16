/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author AA724
 */
public class Carro {
    
    //Atributos
    private int idCarro;
    private String matricula;
    private int año;
    private String marca;
    private double precio;
    
    //Constructores
    //Por defecto
    public Carro(){
        this.idCarro=0;
        this.matricula="";
        this.año=0;
        this.marca="";
        this.precio=0.0;
    }
    
    //Con los atributos como parámetro
    public Carro(int idCarro, String matricula, int año, String marca, double precio){
        this.idCarro=idCarro;
        this.matricula=matricula;
        this.año=año;
        this.marca=marca;
        this.precio=precio;
    }
    
    //Con un objeto Carro como parámetro
    public Carro(Carro oCarro){
        this.idCarro=oCarro.idCarro;
        this.matricula=oCarro.matricula;
        this.año=oCarro.año;
        this.marca=oCarro.marca;
        this.precio=oCarro.precio;
    }
    
    
    //Métodos get y set
    public int getIdCarro(){
        return this.idCarro;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public int getAño(){
        return this.año;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    //Métodos set
    public void setIdCarro(int idCarro){
        this.idCarro=idCarro;
    }
    
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    
    public void setAño(int año){
        this.año=año;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public void setPrecio(double precio){
        this.precio=precio;
    }
    
    //Métodos sobrecargados
    @Override
    public String toString(){
        
        String mensaje="Id Carro: "+idCarro+
                       "\nMatricula: "+matricula+
                       "\nAño: "+año+
                       "\nMarca: "+marca+
                       "\nPrecio: "+precio;
        
            return mensaje;
        
    }
    
    
}
