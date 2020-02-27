package Clases;

import Enumeraciones.enuMoto;

public class Motos extends Vehiculos {
    //Atributos
    private enuMoto marca;
    
   //Constructores
    public Motos() {
    }

    public Motos(enuMoto marca) {
        this.marca = marca;
    }

    public Motos(enuMoto marca, String matricula, Persona personas) {
        super(matricula, personas);
        this.marca = marca;
    }
    
    //Getter and Setter
    public enuMoto getMarca() {
        return marca;
    }

    public void setMarca(enuMoto marca) {
        this.marca = marca;
    }
    
    
    //Metodos
    @Override
    public String toString() {
        return "Motos{" + "marca=" + marca + '}';
    }
    
    
}
