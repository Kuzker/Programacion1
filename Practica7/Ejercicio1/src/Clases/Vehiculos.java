package Clases;

public class Vehiculos {
    //Atributos
    private String matricula;
    private Persona personas;
    
    //Constructores
    public Vehiculos() {
    }

    public Vehiculos(String matricula, Persona personas) {
        this.matricula = matricula;
        this.personas = personas;
    }
    
    
    //Getter and Setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Persona getPersonas() {
        return personas;
    }

    public void setPersonas(Persona personas) {
        this.personas = personas;
    }
    
    //Otros metodos
    @Override
    public String toString() {
        return "Vehiculos{" + "matricula=" + matricula + '}';
    }
    
}
