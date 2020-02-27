/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

import java.util.ArrayList;

/**
 *
 * @author Kuzk
 */
public class Persona {
    //Atributos
    private String nombre;
    public int edad;
    private String dni;
    private String apellidos;
    
    /* //Relación con cardinalidad uno
    private Coche auto;

    public Coche getAuto() {
        return auto;
    }

    public void setAuto(Coche auto) {
        this.auto = auto;
    }*/
    
    //Relación con cardinalidad muchos
    private ArrayList<Coche> lista;

    public ArrayList<Coche> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Coche> lista) {
        this.lista = lista;
    }
    
    public void setUnCoche(Coche auto){
        lista.add(auto);
    }
    
    //Métodos
        //Constructores
    public Persona() {
    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre, int edad, String dni, String apellidos) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.apellidos = apellidos;
    }

    public Persona(String nombre, String dni, String apellidos) {
        this.nombre = nombre;
        this.dni = dni;
        this.apellidos = apellidos;
    }

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
        //Setter y Getter

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
        //Métodos propios
    public boolean isMayor() {
        return(edad>=18);
    }
}
