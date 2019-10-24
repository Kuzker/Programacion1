/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author Kuzk
 */
import javax.swing.JOptionPane;
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma=0;
        for(int cont=0;cont<10;cont++)
        {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Dame un número."));
            suma = suma + num;
        }
        JOptionPane.showMessageDialog(null, "La suma de los 10 números es "+suma+".");
    }
    
}
