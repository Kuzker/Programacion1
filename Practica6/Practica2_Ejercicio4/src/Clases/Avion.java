/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Kuzk
 */
public class Avion {
    //Atributos
    private String aerolinea;
    private String cod_avion;
    private int numasientos;
    private String compartimentos;
    //Relaciones
    private ArrayList<Vuelo> listaVuelos = new ArrayList();
    //Constructores
    public Avion() {
    }

    public Avion(String aerolinea, String cod_avion, int numasientos, String compartimentos) {
        this.aerolinea = aerolinea;
        this.cod_avion = cod_avion;
        this.numasientos = numasientos;
        this.compartimentos = compartimentos;
    }
    //Getter and Setter
    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getCod_avion() {
        return cod_avion;
    }

    public void setCod_avion(String cod_avion) {
        this.cod_avion = cod_avion;
    }

    public int getNumasientos() {
        return numasientos;
    }

    public void setNumasientos(int numasientos) {
        this.numasientos = numasientos;
    }

    public String getCompartimentos() {
        return compartimentos;
    }

    public void setCompartimentos(String compartimentos) {
        this.compartimentos = compartimentos;
    }
    //Otros Metodos
    public void asignarvuelo(){
        
    }
    public void obtener(){
        
    }
    public void cancelarvuelo(){
        
    }
}
