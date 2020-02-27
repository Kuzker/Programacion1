/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Date;

public class Vuelo {
    //Atributos
    private int numvuelo;
    private String hsalida;
    private String hllegada;
    private String lorigen;
    private String ldestino;
    private Date fsalida;
    private Date fregreso;
    private String tvuelo;
    
    //Relaciones
    private Avion avion;
    private Piloto piloto;
    private ArrayList<Asiento> listaAsientos = new ArrayList();
    private Pasajero pasajero;
    private Ciudad ciudad;
    
    //Constructores
    public Vuelo() {
    }

    public Vuelo(int numvuelo) {
        this.numvuelo = numvuelo;
    }
    
    public Vuelo(int numvuelo, String hsalida, String hllegada, String lorigen, String ldestino, Date fsalida, Date fregreso, String tvuelo) {
        this.numvuelo = numvuelo;
        this.hsalida = hsalida;
        this.hllegada = hllegada;
        this.lorigen = lorigen;
        this.ldestino = ldestino;
        this.fsalida = fsalida;
        this.fregreso = fregreso;
        this.tvuelo = tvuelo;
    }
    //Getter and Setter

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public ArrayList<Asiento> getListaAsientos() {
        return listaAsientos;
    }

    public void setListaAsientos(ArrayList<Asiento> listaAsientos) {
        this.listaAsientos = listaAsientos;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    public int getNumvuelo() {
        return numvuelo;
    }

    public void setNumvuelo(int numvuelo) {
        this.numvuelo = numvuelo;
    }

    public String getHsalida() {
        return hsalida;
    }

    public void setHsalida(String hsalida) {
        this.hsalida = hsalida;
    }

    public String getHllegada() {
        return hllegada;
    }

    public void setHllegada(String hllegada) {
        this.hllegada = hllegada;
    }

    public String getLorigen() {
        return lorigen;
    }

    public void setLorigen(String lorigen) {
        this.lorigen = lorigen;
    }

    public String getLdestino() {
        return ldestino;
    }

    public void setLdestino(String ldestino) {
        this.ldestino = ldestino;
    }

    public Date getFsalida() {
        return fsalida;
    }

    public void setFsalida(Date fsalida) {
        this.fsalida = fsalida;
    }

    public Date getFregreso() {
        return fregreso;
    }

    public void setFregreso(Date fregreso) {
        this.fregreso = fregreso;
    }

    public String getTvuelo() {
        return tvuelo;
    }

    public void setTvuelo(String tvuelo) {
        this.tvuelo = tvuelo;
    }
    //Otros Metodos
    public void reservar(){
        
    }
    public void modificar(){
        
    }
    public void eliminar(){
        
    }
    public Vuelo buscar(){
        return null;
    }
}
