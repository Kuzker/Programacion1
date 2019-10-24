/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author Kuzk
 */
import javax.swing.JOptionPane;
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dato1 = JOptionPane.showInputDialog("Introduce el primer cateto.");
        String dato2 = JOptionPane.showInputDialog("Introduce el segundo cateto.");
        double cateto1 = Double.parseDouble(dato1);
        double cateto2 = Double.parseDouble(dato2);
        double hipo;
        hipo = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        JOptionPane.showMessageDialog(null, "La hipotenusa del triángulo es "+ Math.round(hipo));
    }
    
}
