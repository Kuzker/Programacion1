/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import javax.swing.JOptionPane;
import java.util.Arrays;
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del Array."));
        int[] array = new int[num];
        int suma=0;
        
        for(int i=0; i<num; i++){
            array[i] = (int) (Math.random()*10);
            JOptionPane.showMessageDialog(null, "El contenido del Array es: "+array[i]);
        }
        
        for (int i=0; i<num; i++) {
            suma += array[i];
        }
        JOptionPane.showMessageDialog(null, "La suma de todos los números del Array es "+suma+".");
    }
    
}
