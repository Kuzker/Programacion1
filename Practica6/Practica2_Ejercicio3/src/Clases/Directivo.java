/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Kuzk
 */
public class Directivo extends Empleado {
    //Atributo
    private String categoria;
    //Constructor heredado
    private ArrayList<Empleado> subordinados;
    
    //Constructores
    public Directivo() {
    }
    
    public Directivo(String categoria, double sueldo_bruto, String nombre, int edad) {
        super(sueldo_bruto, nombre, edad);
        this.categoria = categoria;
    }
    
    public Directivo(String categoria, ArrayList<Empleado> subordinados, String nombre, int edad) {
        super(nombre, edad);
        this.categoria = categoria;
        this.subordinados = subordinados;
    }

    public Directivo(String categoria, ArrayList<Empleado> subordinados) {
        this.categoria = categoria;
        this.subordinados = subordinados;
    }

    public Directivo(String categoria, ArrayList<Empleado> subordinados, double sueldo_bruto) {
        super(sueldo_bruto);
        this.categoria = categoria;
        this.subordinados = subordinados;
    }

    public Directivo(String categoria, ArrayList<Empleado> subordinados, double sueldo_bruto, String nombre, int edad) {
        super(sueldo_bruto, nombre, edad);
        this.categoria = categoria;
        this.subordinados = subordinados;
    }
    //Getter and Setter
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Empleado> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(ArrayList<Empleado> subordinados) {
        this.subordinados = subordinados;
    }
    //Otros Metodos
    @Override
    public String mostrar(){
        return this.getNombre() + " " + this.getEdad() + " " + this.getSueldo_bruto() + " " + this.getCategoria() + " " + this.getSubordinados();
    }
}
