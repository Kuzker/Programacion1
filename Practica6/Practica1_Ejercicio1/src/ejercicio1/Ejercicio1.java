/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import Clases.*;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Ejercicio1 {

    public static void main(String[] args) {
        //Entrada
        double r = Double.parseDouble(JOptionPane.showInputDialog("Teclea el radio de la circunferencia."));
        //Creacion
        Circunferencia c = new Circunferencia();
        c.setRadio(r);
        //Salida
        DecimalFormat df = new DecimalFormat("#.00");
        JOptionPane.showMessageDialog(null, "Los datos de la circunferencia con radio: " + c.getRadio() + " son: " +
                "\n" + "Logintud: " + df.format(c.getLongitud()) +
                "\n" + "Area: " + df.format(c.getArea()) +
                "\n" + "Volumen: " + c.getVolumen());
    }
    
}
