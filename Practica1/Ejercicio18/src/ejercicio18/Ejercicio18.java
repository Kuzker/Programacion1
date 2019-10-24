/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

/**
 *
 * @author Kuzk
 */
import javax.swing.JOptionPane;
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=1;
        int num2=1;
        int suma;
        int parar = Integer.parseInt(JOptionPane.showInputDialog("Escribe númericamente cuantos números de la serie de Fibonacci quieres."));
        for (int cont = 2; cont < parar; cont++) {
            suma = num1 + num2;
            JOptionPane.showMessageDialog(null, suma);
            num1 = num2;
            num2 = suma;
        }
    }
    
}
