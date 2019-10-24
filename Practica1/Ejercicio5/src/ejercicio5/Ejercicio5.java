/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Kuzk
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dato1;
        dato1 = javax.swing.JOptionPane.showInputDialog(null, "Grados centígrados que quieras pasar a Fahrenheit.");
        double cent = Double.parseDouble(dato1);
        double fah;
        fah = 1.8*cent+32;
        javax.swing.JOptionPane.showMessageDialog(null, dato1+ "ºC son "+ fah +"ºF");
        
    }   
    
    
}
