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
public class Cliente extends Persona {
    //Constructor heredado
    public Cliente(String nombre, int edad){
        super(nombre,edad);
    }
    //Atributos
    private String telefono_de_contacto;
    //Constructores
    public Cliente() {
    }

    public Cliente(String telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }

    public Cliente(String telefono_de_contacto, String nombre, int edad) {
        super(nombre, edad);
        this.telefono_de_contacto = telefono_de_contacto;
    }
    //Getter and Setter
    public String getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setTelefono_de_contacto(String telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }
    //Otros Metodos
    @Override
    public String mostrar(){
        return this.getNombre() + " " + this.getEdad() + " " + this.getTelefono_de_contacto();
    }
}
