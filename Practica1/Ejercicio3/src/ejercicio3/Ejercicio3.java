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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dato1;
        String dato2;
        dato1 = javax.swing.JOptionPane.showInputDialog(null, "Introduce la base del rectángulo.");
        dato2 = javax.swing.JOptionPane.showInputDialog(null, "Introduce la altura del rectángulo.");
        int num1 = Integer.parseInt(dato1);
        int num2 = Integer.parseInt(dato2);
        int peri;
        peri = 2 * num1 + 2 * num2;
        javax.swing.JOptionPane.showMessageDialog(null, "El perímetro del rectángulo es "+ peri);
        
        
    }
    
}
