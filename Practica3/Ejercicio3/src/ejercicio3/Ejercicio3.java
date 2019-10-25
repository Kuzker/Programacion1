/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Kuzk
 */
import javax.swing.JOptionPane;
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0;
        String cadena = JOptionPane.showInputDialog("Introduce una frase.");
        String let = JOptionPane.showInputDialog("Introduce la letra que quieras que cuente.");
        char letra = let.charAt(0);
        num = contarLetras(cadena, letra);
        JOptionPane.showMessageDialog(null, "Hay " + num + " "+ letra + ".");
    }
    
    public static int contarLetras(String cadena, char letra) {
        int p, cont = 0;
        p = cadena.indexOf(letra);
        while (p != -1) {
            cont++;
            p = cadena.indexOf(letra, p + 1);
        }
        return cont;
   }
}

