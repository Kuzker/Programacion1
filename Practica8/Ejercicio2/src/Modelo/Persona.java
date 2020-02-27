package Modelo;

public class Persona {
    //Atributos
    private String nombre;
    private String apellidos;
    private String dni;
    
    //Constructores
    public Persona() {
    }
    
    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }
    
    //Getter and Setter
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    //Otros Metodos
    @Override
    public String toString(){
        return nombre + " " + apellidos + " " + dni;
    }
    
}
