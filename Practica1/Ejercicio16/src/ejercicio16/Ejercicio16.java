/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

/**
 *
 * @author Kuzk
 */
import javax.swing.JOptionPane;
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String x="";
        int edad;
        int suma = 0;
        int cont = 1;
        double promedio = 0;
        while(!x.equals("F"))
        {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante."));
            suma = suma + edad;
            // suma += edad; Lo mismo que suma = suma + edad;
            promedio = suma/cont;
            cont++;
            x = JOptionPane.showInputDialog("Introduzca F en caso de que quiera finalizar el programa, sino, presione Enter.");
        }
        JOptionPane.showMessageDialog(null, "El promedio de todas las notas introducidas es "+promedio+".");
    }
    
}
