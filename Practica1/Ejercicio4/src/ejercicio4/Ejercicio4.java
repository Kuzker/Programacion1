/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Kuzk
 */
import javax.swing.JOptionPane;

public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dato1;
        String dato2;
        dato1 = JOptionPane.showInputDialog("Introduce la diagonal mayor del rombo.");
        dato2 = JOptionPane.showInputDialog("Introduce la diagonal menor del rombo.");
        double diaMax = Double.parseDouble(dato1);
        double diaMen = Double.parseDouble(dato2);
        double area;
        area = diaMax * diaMen / 2;
        JOptionPane.showMessageDialog(null, "El área del rombo es "+ area);
    }
    
}
