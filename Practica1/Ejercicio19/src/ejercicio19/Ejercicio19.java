/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

/**
 *
 * @author Kuzk
 */
import javax.swing.JOptionPane;
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número y te mostraré su cuadrado."));
        int suma=0;
        int impar = 1;
        
        for (int cont=1;cont<=numero;cont++)
        {
            suma = suma + impar;
            impar = impar + 2;
        }
        JOptionPane.showMessageDialog(null, "El cuadrado de "+numero+" es "+suma);
    }
    
}
