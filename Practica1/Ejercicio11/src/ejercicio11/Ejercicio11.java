/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author Kuzk
 */
import javax.swing.JOptionPane;
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Dame un número."));
        String dato2 = JOptionPane.showInputDialog("Dame otro número.");
        String dato3 = JOptionPane.showInputDialog("Dame otro número!");
        
        
        int num2 = Integer.parseInt(dato2);
        int num3 = Integer.parseInt(dato3);
        
        if (num1>num2 && num1>num3)
        {
            if (num2>num3)
            {
                JOptionPane.showMessageDialog(null, "El número "+num1+" es el mayor y el número "+num3+" es el menor.");
            }else{
                JOptionPane.showMessageDialog(null, "El número "+num1+" es el mayor y el número "+num2+" es el menor.");
            }
        }else{
            if (num2>num1 && num2>num3)
            {
                if (num1>num3)
                {
                    JOptionPane.showMessageDialog(null, "El número "+num2+" es el mayor y el número "+num3+" es el menor.");
                }else{
                    JOptionPane.showMessageDialog(null, "El número "+num2+" es el mayor y el número "+num1+" es el menor.");
                }
            }else{
                if (num3>num1 && num3>num2)
                {
                    if (num2>num1)
                    {
                        JOptionPane.showMessageDialog(null, "El número "+num3+" es el mayor y el número "+num1+" es el menor.");
                    }else{
                        JOptionPane.showMessageDialog(null, "El número "+num3+" es el mayor y el número "+num2+" es el menor.");
                    }
                }
            }
        }
    }
        
}
