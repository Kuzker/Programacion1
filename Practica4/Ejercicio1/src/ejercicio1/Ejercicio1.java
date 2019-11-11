/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import javax.swing.JOptionPane;
import java.util.Arrays;
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double min = 111;
        double max = 0;
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
           array[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número."));
           if(array[i]>max)
               max = array[i];
           if(array[i]<min)
               min = array[i];
        }
        
        JOptionPane.showMessageDialog(null, "El número más alto introducido es "+max+" y el número mas bajo es "+min+".");
    }
    
}
