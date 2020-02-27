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
public class Asiento {
    //Atributos
    private int num_asiento;
    private Boolean estado;
    private String compartimento;
    //Relaciones
    //Constructores
    public Asiento() {
    }

    public Asiento(int num_asiento, Boolean estado, String compartimento) {
        this.num_asiento = num_asiento;
        this.estado = estado;
        this.compartimento = compartimento;
    }
    
    //Getter and Setter
    public int getNum_asiento() {
        return num_asiento;
    }

    public void setNum_asiento(int num_asiento) {
        this.num_asiento = num_asiento;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getCompartimento() {
        return compartimento;
    }

    public void setCompartimento(String compartimento) {
        this.compartimento = compartimento;
    }
    //Otros Metodos
    public void reservar(){
        
    }
    public void comprar(){
        
    }
    public boolean mostrar_disponibilidad(){
        return false;
    }
    public void desbloquear(){
        
    }
}
