/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import MisClases.*;
import java.util.ArrayList;
public class Poo {

    public static void main(String[] args) {
        String mayor;
        //Creamos Objetos
        Persona p1 = new Persona();
        p1.edad = 19;
        p1.setDni("111111111A");
        p1.setEdad(20);
        p1.setNombre("Pepe");
        p1.setApellidos("Ruiz");
        javax.swing.JOptionPane.showMessageDialog(null, p1.getNombre() + " es " + p1.isMayor());
        
        Coche auto1 = new Coche("1255JNG", "Rojo");
        //Relación entre Coche y Persona con Cardinalidad uno
        //p1.setAuto(c1);
        //javax.swing.JOptionPane.showMessageDialog(null, "El coche de " + p1.getNombre() + " es de color " + p1.getAuto().getColor() + " y tiene la mátricula " + p1.getAuto().getMatricula() +".");
        
        //Relación entre Coche y Persona con Cardinalidad muchos
        Coche auto2 = new Coche("1234KKT", "Amarillo");
        Coche auto3 = new Coche("1617TTH", "Negro");
        ArrayList<Coche> list = new ArrayList();
        list.add(auto1);
        list.add(auto2);
        list.add(auto3);
        p1.setLista(list);
        Coche auto4 = new Coche("5656YYT", "Blanco");
        p1.setUnCoche(auto4);
        
        
        Persona p2 = new Persona("Antonio",18,"22222222B","nose");
        Persona[] listaPersonas = new Persona[3];
        listaPersonas[0] = p1;
        listaPersonas[1] = p2;
        
       
    }
    
}
