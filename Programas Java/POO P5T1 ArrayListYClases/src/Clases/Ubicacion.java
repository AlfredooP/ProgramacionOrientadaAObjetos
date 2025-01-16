/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Random;
import javax.swing.JTable;

/**
 *
 * @author alfre
 */
public class Ubicacion {
    //ATRIBUTOS
    private String calle;
    private String numero;
    private String colonia;
    private String cd;
    private String cp;
    
    //CONSTRUCTORES
    public Ubicacion(){
        this.calle="";
        this.numero="";
        this.colonia="";
        this.cd="";
        this.cp="";
    }

    public Ubicacion(String calle, String numero, String colonia, String cd, String cp) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cd = cd;
        this.cp = cp;
    }
    
    //MÉTODOS GET Y SET

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
    
    //Método para copiar de una ubicacion a otra
    public void copiarUbicacion(Ubicacion oUbicacion){
        this.calle=oUbicacion.getCalle();
        this.numero=oUbicacion.getNumero();
        this.colonia=oUbicacion.getColonia();
        this.cd=oUbicacion.getCd();
        this.cp=oUbicacion.getCp();
    }
    
    public void aleatorioUbicacion (JTable tabla){
        String[]calles = {"Hidalgo", "Cepeda", "Juárez", "Ocampo", "Morelos", "Matamoros"};
        String[]colonias = {"Centro", "Valle Oriente", "Ampliación La Rosita", "Las Fuentes", "Cd. Industrial", "Villa Ángeles"};
        String[]cds = {"Torreón", "Gómez Palacio", "Lerdo"};
        Random rnd = new Random();
        
        tabla.setValueAt(calles[rnd.nextInt(calles.length)], 0, 0);
        tabla.setValueAt(rnd.nextInt(10000)+1, 0, 1);
        tabla.setValueAt(colonias[rnd.nextInt(colonias.length)], 0, 2);
        tabla.setValueAt(27000 + rnd.nextInt(1000), 0, 3);
        tabla.setValueAt(cds[rnd.nextInt(cds.length)], 0, 4);
    }
}
