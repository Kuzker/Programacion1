/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author Kuzk
 */
import javax.swing.JOptionPane;
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dato1 = JOptionPane.showInputDialog("Dame un número del 0 al 10");
        int num1 = Integer.parseInt(dato1);
        
        if (num1 >=0 && num1<=10)
        {
            if (num1 >= 5)
            {
                JOptionPane.showMessageDialog(null, "Aprobado!");
            }else{
                JOptionPane.showMessageDialog(null, "Suspenso!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El número introducido no es correcto.");
        }
    }
    
}
