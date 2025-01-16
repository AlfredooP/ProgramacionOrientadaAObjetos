/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alfre
 */
public class Empleado {
    
    //Atributos
    private String rfc;
    private String nombre;
    private String direccion;
    private String telefono;
    private int edad;
    private String puesto;
    private double sueldo;
    
    //Métodos constructores
    //Por defecto
    public Empleado() {
        this.rfc = "";
        this.nombre = "";
        this.direccion = "";
        this.telefono = "";
        this.edad = 0;
        this.puesto = "";
        this.sueldo = 0.0;
    }
    
    //Con todos los parámetros
    public Empleado(String rfc, String nombre, String direccion, String telefono, int edad, String puesto, double sueldo) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }
    
    //Métodos get
    public String getRfc() {
        return rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    //Métodos set
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    //Crear el ArrayList en el que se gusrdarán los empleados
    ArrayList <Empleado> arrEmp = new ArrayList();

    //Crear sus métodos get y set
    public ArrayList<Empleado> getArrEmp() {
        return arrEmp;
    }
    
    public void setArrEmp(ArrayList<Empleado> arrEmp) {
        this.arrEmp = arrEmp;
    }
    
    //Métodos
    //Método para agregar los empleados al ArrayList
    public void alta(Empleado oEmp){
        arrEmp.add(oEmp);
    }
    
    //Método para escribir los datos del ArrayList al archivo binario
    public void escribirArchivo(boolean opcion){
        FileOutputStream oFOS = null;
        DataOutputStream oDOS = null;
        try {
            oFOS = new FileOutputStream("G:\\ARCHIVOS\\Programación Orientada a Objetos\\Archivos POO\\ProyectoT5T6.bin", opcion);
            oDOS = new DataOutputStream(oFOS);
            for(int i=0; i<arrEmp.size(); i++){
                oDOS.writeUTF(arrEmp.get(i).getRfc());
                oDOS.writeUTF(arrEmp.get(i).getNombre());
                oDOS.writeUTF(arrEmp.get(i).getDireccion());
                oDOS.writeUTF(arrEmp.get(i).getTelefono());
                oDOS.writeInt(arrEmp.get(i).getEdad());
                oDOS.writeUTF(arrEmp.get(i).getPuesto());
                oDOS.writeDouble(arrEmp.get(i).getSueldo());
            }
            oFOS.close();
            oDOS.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No es posible crear el archivo " + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error de escritura (" + ex.getMessage() + ")");
        }
    }    
    
    //Método para leer los datos del archivo binario
    public void leerArchivo(){
        FileInputStream oFIS = null;
        DataInputStream oDIS = null;
        try {
            oFIS = new FileInputStream("G:\\ARCHIVOS\\Programación Orientada a Objetos\\Archivos POO\\ProyectoT5T6.bin");
            oDIS = new DataInputStream(oFIS);
            do{
                rfc = oDIS.readUTF();
                nombre = oDIS.readUTF();
                direccion = oDIS.readUTF();
                telefono = oDIS.readUTF();
                edad = oDIS.readInt();
                puesto = oDIS.readUTF();
                sueldo = oDIS.readDouble();
                Empleado oEmp = new Empleado(rfc, nombre, direccion, telefono, edad, puesto, sueldo);
                this.arrEmp.add(oEmp);
            }while(oDIS.available()>0);
            oFIS.close();
            oDIS.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se encontró el archivo " + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error de lectura (" + ex.getMessage() + ")");
        }
    }
    
    //Método para escribir los datos del ArrayList a la tabla indicada
    public void imprimirDatos(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(arrEmp.size());
        for(int i=0; i<arrEmp.size(); i++){
            tabla.setValueAt(arrEmp.get(i).getRfc(), i, 0);
            tabla.setValueAt(arrEmp.get(i).getNombre(), i, 1);
            tabla.setValueAt(arrEmp.get(i).getDireccion(), i, 2);
            tabla.setValueAt(arrEmp.get(i).getTelefono(), i, 3);
            tabla.setValueAt(arrEmp.get(i).getEdad(), i, 4);
            tabla.setValueAt(arrEmp.get(i).getPuesto(), i, 5);
            tabla.setValueAt(arrEmp.get(i).getSueldo(), i, 6);
        }
    }
    
    //Método para buscar el RFC indicado entre todos los empleados
    public int buscarRFC(String buscar){
        for(int i=0; i<arrEmp.size(); i++){
            if(arrEmp.get(i).getRfc().equals(buscar))
                return i;
        }
        return -1;
    }
    
    //Método para buscar el sueldo indicado entre todos los empleados
    public int buscarSueldo(double buscar, int i){
        if(arrEmp.get(i).getSueldo() == buscar)
            return i;
        else
            return -1;
    }
    
}
