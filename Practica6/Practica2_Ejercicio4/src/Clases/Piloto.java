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
public class Piloto {
    //Atributos
    private String cod_piloto;
    private String nombre;
    private String apellido;
    private int num_licencia;
    
    //Constructores
    public Piloto() {
    }
    
    public Piloto(String cod_piloto, String nombre, String apellido, int num_licencia) {
        this.cod_piloto = cod_piloto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.num_licencia = num_licencia;
    }
    
    //Getter and Setter
    public String getCod_piloto() {
        return cod_piloto;
    }

    public void setCod_piloto(String cod_piloto) {
        this.cod_piloto = cod_piloto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNum_licencia() {
        return num_licencia;
    }

    public void setNum_licencia(int num_licencia) {
        this.num_licencia = num_licencia;
    }
    
    //Otros Metodos
    public void agregar_nuevo(){
        
    }
    public void asignar_vuelo(){
        
    }
    public void cancelar_vuelo(){
        
    }
    public void modificar(){
        
    }
    public Piloto buscar(){
        return null;
    }
}
