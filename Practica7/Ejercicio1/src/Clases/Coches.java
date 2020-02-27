package Clases;

import Enumeraciones.enuCoche;

public class Coches extends Vehiculos {
    //Atributos
    private enuCoche marca;
    
    //Constructores
    public Coches() {
    }

    public Coches(enuCoche marca) {
        this.marca = marca;
    }

    public Coches(enuCoche marca, String matricula, Persona personas) {
        super(matricula, personas);
        this.marca = marca;
    }

    //Getter and Setter
    public void setMarca(enuCoche marca) {    
        this.marca = marca;
    }
    
    public enuCoche getMarca() {    
        return marca;
    }

    //Metodos
    @Override
    public String toString() {
        return "Coches{" + "marca=" + marca + '}';
    }
    
    
}
