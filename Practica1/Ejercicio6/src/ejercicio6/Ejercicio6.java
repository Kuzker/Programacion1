/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author Kuzk
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dato1 = javax.swing.JOptionPane.showInputDialog("Introduzca el radio de la circunferencia.");
        double radio = Double.parseDouble(dato1);
        double area;
        double pi = Math.PI;
        double radio2 = Math.pow(radio, 2);
        area = pi * radio2;
        javax.swing.JOptionPane.showMessageDialog(null, "El área de la circunferencia que corresponde al radio "+ dato1 +" es "+ Math.round(area * 100.0) / 100.0);
        
    }
    
}
