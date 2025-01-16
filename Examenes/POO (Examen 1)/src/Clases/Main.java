/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

/**
 *
 * @author AA710
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Crear 5 objetos del tipo empresa
        Empresa oE1 = new Empresa();
        Empresa oE2 = new Empresa(2, "Lala");
        Empresa oE3 = new Empresa(3, "Peñoles", 23456.78, 'S');
        Empresa oE4 = new Empresa(4, "Soriana", 100000.78, 'A');
        Empresa oE5 = new Empresa(5, "Telmex");
        
        //Guardar los objetos Empresa en el ArrayList
        Franquicia oFran = new Franquicia();
        oFran.guardarObjetoEmpresa(oE1);
        oFran.guardarObjetoEmpresa(oE2);
        oFran.guardarObjetoEmpresa(oE3);
        oFran.guardarObjetoEmpresa(oE4);
        oFran.guardarObjetoEmpresa(oE5);
        
        //Llamar al método toString
        System.out.println(oFran.toString());
        
        //Llamar al método que calcula el promedio
        System.out.println("Promedio de los presupuestos = " + oFran.calcularPresupuesto());
        System.out.println("===========================================================");
        
        //Modificar los datos del objeto oE1
        oE1.setIdEmpresa(1);
        oE1.setNombreEmpresa("Pollo Loco");
        oE1.setPresupuesto(122344677.34);
        oE1.setTipo('A');
        
        //Llamar al método toString nuevamente
        System.out.println(oFran.toString());
        
    }
    
}
