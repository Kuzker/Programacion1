package Modelo;

public class Personas {
    //Atributos
    private String nombre;
    private int edad;
    private String profesion;
    private String telefono;
    
    //Constructores
    public Personas() {
    }

    public Personas(String nombre, int edad, String profesion, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.telefono = telefono;
    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
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

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
