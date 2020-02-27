/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Kuzk
 */
public class Empleado extends Persona {
    //Constructor heredado
    public Empleado(String nombre, int edad){
        super(nombre,edad);
    }
    //Atributos
    private double sueldo_bruto;
    //Constructores
    public Empleado() {
    }

    public Empleado(double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    public Empleado(double sueldo_bruto, String nombre, int edad) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }
    //Getter and Setter
    public double getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }
    
    //Otros Metodos
    public Double calcular_salario_neto(){
        return null;
    }
    
    @Override
    public String mostrar(){
        return this.getNombre() + " " + this.getEdad() + " " + this.getSueldo_bruto();
    }
}
