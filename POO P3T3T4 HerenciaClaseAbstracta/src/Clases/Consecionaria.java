/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;


/**
 *
 * @author AA729
 */
public class Consecionaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Crear los 5 autos de distintos tipos
        Sedan oSedan = new Sedan("GAD-3498", "2005", "Azul electrico", "20/11/2007", 178000, 4);
        Sedan oSedan2 = new Sedan("PAR-4577", "2011", "Rojo Intenso", "05/08/2014", 214000, 2);
        Camioneta oCamioneta = new Camioneta("SER-2206", "1998", "Gris Claro", "22/10/2000", 146000, 428);
        Camioneta oCamioneta2 = new Camioneta("ASN-6913", "2015", "Negro", "13/04/2015", 293000, 345);
        SUV oSUV = new SUV("ARJ-6492", "2017", "Blanco", "04/12/2019", 213000, 5);
        
        //Mostrar la cantidad a ganar y las ganancias
        System.out.println("CONCESIONARIA NISSAN - AUTOS DISPONIBLES : 5");
        System.out.println("\nAUTO " + oSedan.getPlaca() + " / Modelo " + oSedan.getModelo() + " / Color " + oSedan.getColor() + " / " + oSedan.getNumeroPuertas() + " puertas");
        System.out.println("Precio inicial: " + oSedan.getPrecioInicial() + " / Cantidad a pagar: " + oSedan.pago() + " / Ganancia: " + (oSedan.pago() - oSedan.getPrecioInicial()));
        System.out.println("\nAUTO " + oSedan2.getPlaca() + " / Modelo " + oSedan2.getModelo() + " / Color " + oSedan2.getColor() + " / " + oSedan2.getNumeroPuertas() + " puertas");
        System.out.println("Precio inicial: " + oSedan2.getPrecioInicial() + " / Cantidad a pagar: " + oSedan2.pago() + " / Ganancia: " + (oSedan2.pago() - oSedan2.getPrecioInicial()));
        System.out.println("\nAUTO " + oCamioneta.getPlaca() + " / Modelo " + oCamioneta.getModelo() + " / Color " + oCamioneta.getColor() + " / " + oCamioneta.getPesoTon() + " toneladas");
        System.out.println("Precio inicial: " + oCamioneta.getPrecioInicial() + " / Cantidad a pagar: " + oCamioneta.pago() + " / Ganancia: " + (oCamioneta.pago() - oCamioneta.getPrecioInicial()));
        System.out.println("\nAUTO " + oCamioneta2.getPlaca() + " / Modelo " + oCamioneta2.getModelo() + " / Color " + oCamioneta2.getColor() + " / " + oCamioneta2.getPesoTon() + " toneladas");
        System.out.println("Precio inicial: " + oCamioneta2.getPrecioInicial() + " / Cantidad a pagar: " + oCamioneta2.pago() + " / Ganancia: " + (oCamioneta2.pago() - oCamioneta2.getPrecioInicial()));
        System.out.println("\nAUTO " + oSUV.getPlaca() + " / Modelo " + oSUV.getModelo() + " / Color " + oSUV.getColor() + " / " + oSUV.getNumPasajeros() + " pasajeros");
        System.out.println("Precio inicial: " + oSUV.getPrecioInicial() + " / Cantidad a pagar: " + oSUV.pago() + " / Ganancia: " + (oSUV.pago() - oSUV.getPrecioInicial()));
        
    }
    
}
