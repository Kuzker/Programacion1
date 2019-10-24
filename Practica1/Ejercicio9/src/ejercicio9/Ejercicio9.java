/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author Kuzk
 */
import javax.swing.JOptionPane;
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dato1 = JOptionPane.showInputDialog("Dame un número del 0 al 10");
        int num1 = Integer.parseInt(dato1);
        
        switch (num1)
        {
            case 0: case 1: case 2: case 3: JOptionPane.showMessageDialog(null, "Muy deficiente!");
                break;
            case 4: JOptionPane.showMessageDialog(null, "Insuficiente!");
                break;
            case 5: JOptionPane.showMessageDialog(null, "Suficiente!");
                break;
            case 6: case 7: JOptionPane.showMessageDialog(null, "Bien!");
                break;
            case 8: JOptionPane.showMessageDialog(null, "Notable!");
                break;
            case 9: case 10: JOptionPane.showMessageDialog(null, "Sobresaliente!");
                break;
            default: JOptionPane.showMessageDialog(null, "El número introducido no es correcto.");
        }
    }
    
}
