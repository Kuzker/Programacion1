package Clases;

import Enumeraciones.enuMoto;
import java.util.ArrayList;

public class Persona {
    
    //Atributos
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String numtelefono;
    private ArrayList<Vehiculos> vehiculos;
    
    //Constructores
    public Persona() {
    }
    
    public Persona(String dni, String nombre, String apellidos, String direccion, String numtelefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.numtelefono = numtelefono;
    }
    
    //Getter and Setter
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumtelefono() {
        return numtelefono;
    }

    public void setNumtelefono(String numtelefono) {
        this.numtelefono = numtelefono;
    }
    
    public ArrayList<Vehiculos> getVehiculos() {
        return vehiculos;
    }
    
    public void setVehiculos(ArrayList<Vehiculos> coches) {
        this.vehiculos = coches;
    }
    
    public int getNumeroMotos(){
        int contador = 0;
        for(Vehiculos v: vehiculos)
            if (v instanceof Motos)
                contador++;
        return contador;
    }
    
    public boolean getMotoDucate(){
        return vehiculos.stream().filter((v) -> (v instanceof Motos)).anyMatch((v) -> (((Motos) v).getMarca() == enuMoto.Ducate));
    }
    
    //Otros Metodos
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", numtelefono=" + numtelefono + '}';
    }
    
}
