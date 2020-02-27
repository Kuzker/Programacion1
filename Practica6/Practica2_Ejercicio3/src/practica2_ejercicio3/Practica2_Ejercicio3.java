/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_ejercicio3;
import Clases.*;
import java.util.ArrayList;
public class Practica2_Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Empleado> subordinados;
        System.out.printf("Personas: **********************\n");
        Persona p1 = new Persona("Pepe",22);
        Persona p2 = new Persona("Sergio",30);
        Persona p3 = new Persona("Ernesto",44);
        Persona p4 = new Persona("Leire",20);
        System.out.println(p1.mostrar());
        System.out.println(p2.mostrar());
        System.out.println(p3.mostrar());
        System.out.println(p4.mostrar());
        
        System.out.printf("Clientes: **********************\n");
        Cliente c1 = new Cliente("622777427", p2.getNombre(), p2.getEdad());
        Cliente c2 = new Cliente("612345782", p4.getNombre(), p4.getEdad());
        System.out.println(c1.mostrar());
        System.out.println(c2.mostrar());
        
        System.out.printf("Empleados: **********************\n");
        Empleado e1 = new Empleado(2000, p1.getNombre(), p1.getEdad());
        Empleado e2 = new Empleado(3000, p3.getNombre(), p3.getEdad());
        System.out.println(e1.mostrar());
        System.out.println(e2.mostrar());
        
        System.out.printf("Directivos: **********************\n");
        subordinados = new ArrayList<Empleado>();
        subordinados.add(e1);
        Directivo d1 = new Directivo("becario",subordinados,e1.getSueldo_bruto(), e1.getNombre(), e1.getEdad());
        System.out.println(d1.mostrar());
        
    }
}
