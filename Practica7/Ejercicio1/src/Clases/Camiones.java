package Clases;

import Enumeraciones.enuCamion;

public class Camiones extends Vehiculos {
    //Atributos
    private enuCamion marca;
    
    //Constructores
    public Camiones() {
    }

    public Camiones(enuCamion marca) {
        this.marca = marca;
    }

    public Camiones(enuCamion marca, String matricula, Persona personas) {
        super(matricula, personas);
        this.marca = marca;
    }
    
    //Getter and Setter
    public enuCamion getMarca() {
        return marca;
    }

    public void setMarca(enuCamion marca) {
        this.marca = marca;
    }
    
    
    //Metodos
    @Override
    public String toString() {
        return "Camiones{" + "marca=" + marca + '}';
    }
    
    
}
