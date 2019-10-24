/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploif;

/**
 *
 * @author Kuzk
 */
public class EjemploIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "pepe";
        String num1 = javax.swing.JOptionPane.showInputDialog("Dame un numero");
        int numero = Integer.parseInt(num1);
        
        if (numero >= 6 || numero != 10 && nombre.equalsIgnoreCase("pepe"))
            
            
            
        switch (numero)
        {
            case 1: javax.swing.JOptionPane.showMessageDialog(null, "Es un uno.");
                break;
            case 2: javax.swing.JOptionPane.showMessageDialog(null, "Es un dos.");
                break;
            default: javax.swing.JOptionPane.showMessageDialog(null, "No es nada.");
        }
    }
    
}
