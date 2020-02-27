/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

public class Coche {
    //Atributos
    private String matricula;
    private String color;
    //Constructor

    public Coche(String matricula, String color) {
        this.matricula = matricula;
        this.color = color;
    }

    public Coche() {
    }

    public Coche(String matricula) {
        this.matricula = matricula;
    }
    //Setter and getter

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
