/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Kuzk
 */
import javax.swing.JOptionPane;
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Introduce la cadena que deseas que reverse.");
        String invertida = "";
	for (int i = cadena.length()-1; i >= 0; i--) {
            invertida += cadena.charAt(i);
	}
        
	System.out.println("Cadena original: " + cadena);
	System.out.println("Cadena invertida: " + invertida);
    }
    
}
