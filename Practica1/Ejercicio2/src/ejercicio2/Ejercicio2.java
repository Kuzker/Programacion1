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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dato1;
        String dato2;
        dato1 = javax.swing.JOptionPane.showInputDialog(null, "Dame un número.");
        int num1 = Integer.parseInt(dato1);
        dato2 = javax.swing.JOptionPane.showInputDialog(null, "Dame otro número.");
        int num2 = Integer.parseInt(dato2);
        int mult;
        mult = num1 * num2;
        javax.swing.JOptionPane.showMessageDialog(null, "La multiplicación de ambos números es "+ mult);
    }
    
}
