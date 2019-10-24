/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author Kuzk
 */
import javax.swing.JOptionPane;

public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dato = JOptionPane.showInputDialog("Dame un numero entre el 1 y 7");
        int num = Integer.parseInt(dato);
        
        switch (num)
        {
            case 1: JOptionPane.showMessageDialog(null, "El número 1 es el Lunes.");
                break;
            case 2: JOptionPane.showMessageDialog(null, "El número 2 es el Martes.");
                break;
            case 3: JOptionPane.showMessageDialog(null, "El número 3 es el Miercoles.");
                break;
            case 4: JOptionPane.showMessageDialog(null, "El número 4 es el Jueves.");
                break;
            case 5: JOptionPane.showMessageDialog(null, "El número 5 es el Viernes.");
                break;
            case 6: JOptionPane.showMessageDialog(null, "El número 6 es el Sabado.");
                break;
            case 7: JOptionPane.showMessageDialog(null, "El número 7 es el Domingo.");
                break;
            default: JOptionPane.showMessageDialog(null, "El número introducido es incorrecto.");
        }
    }
    
}
