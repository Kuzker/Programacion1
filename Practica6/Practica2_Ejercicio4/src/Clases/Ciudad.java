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
public class Ciudad {
    //Atributos
    private String cod_ciudad;
    private String nombre;
    
    //Constructores
    public Ciudad() {
    }
    public Ciudad(String cod_ciudad, String nombre) {
        this.cod_ciudad = cod_ciudad;
        this.nombre = nombre;
    }
    
    //Setter and Getter
    public String getCod_ciudad() {
        return cod_ciudad;
    }

    public void setCod_ciudad(String cod_ciudad) {
        this.cod_ciudad = cod_ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Otros Metodos
    public void agregar_nuevo(){
        
    }
    public Ciudad obtener(){
        return null;
    }
}
