package ejercicio2;

import Modelo.*;
import Ventanas.*;
import java.util.ArrayList;

public class Ejercicio2 {
    
    private static Persona p;
    private static ArrayList<Persona> lista;
    private static V_Alta v;
    private static V_Listado v1;

    public static void main(String[] args) {
        lista = new ArrayList();
        v = new V_Alta();
        v.setVisible(true);
    }
    
    public static boolean validarDni(String dni){
        //Recorrer el arrayList y buscar una persona con ese dni
        return lista.stream().anyMatch(p->p.getDni().equals(dni));
    }
    
    public static void altaPersona(String nombre, String apellidos, String dni){
        p = new Persona();
        p.setNombre(nombre);
        p.setApellidos(apellidos);
        p.setDni(dni);
        lista.add(p);
    }
    
    public static void terminarVentana(){
        //Destruir la ventana
        v.dispose();
        //Cogemos los datos y se los pasamos a la segunda ventana
        String datos="";
        datos = lista.stream().map((p) -> p.toString() + "\n").reduce(datos, String::concat);
        //Mostramos la otra ventana
        v1 = new V_Listado(datos);
        v1.setVisible(true);
    }
    
    public static void salir(){
        v1.dispose();
        System.exit(0);
    }
}
