/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Kuzk
 */
import javax.swing.JOptionPane;
public class Ejercicio1 {


    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Introduce una frase para que cuente sus vocales.");
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int x = 0; x < cadena.length(); x++) {
            char mirar = cadena.toLowerCase().charAt(x);

            switch (mirar) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "La frase tiene "+(a+e+i+o+u)+" vocales!");
    }
    
}
