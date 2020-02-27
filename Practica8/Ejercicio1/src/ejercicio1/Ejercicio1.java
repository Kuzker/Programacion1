package ejercicio1;

import Vista.*;

public class Ejercicio1 {
    private static Ventana v;

    public static void main(String[] args) {
        v = new Ventana();
        v.setVisible(true);
    }

    public static int generarNumeros(){
        return (int)(1000 * Math.random());
    } 

    public static void terminar() {
        v.dispose();
        System.exit(0);
    }

    public static void comprobarNumero() {
        
    }

    public static void comprobarNumero(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
