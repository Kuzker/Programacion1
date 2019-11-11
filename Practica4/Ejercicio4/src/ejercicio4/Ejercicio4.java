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
import java.util.Arrays;
import java.util.Calendar;
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] meses = new String[12];
        boolean correcto = true;
        
        meses[0] = "Enero";
        meses[1] = "Febrero";
        meses[2] = "Marzo";
        meses[3] = "Abril";
        meses[4] = "Mayo";
        meses[5] = "Junio";
        meses[6] = "Julio";
        meses[7] = "Agosto";
        meses[8] = "Septiembre";
        meses[9] = "Octubre";
        meses[10] = "Noviembre";
        meses[11] = "Diciembre";
        
        String mes = JOptionPane.showInputDialog("Introduce un mes (Enero, Febrero...)");
       /* for (int i = 0; i<meses.length; i++ ) {
            if(mes.equalsIgnoreCase(meses[i]))
            {
                correcto = true;
                JOptionPane.showMessageDialog(null, "El mes es correcto!");
            } else {
                correcto = false;
            }
        }
        if(correcto = false)
        {
            JOptionPane.showMessageDialog(null, "El mes es incorrecto!");
        }*/
       int i;
       for(i = 0; i < meses.length && meses[i].compareToIgnoreCase(mes) != 0 ; i++){}
       if (i == meses.length)
       {
            JOptionPane.showMessageDialog(null, "El mes es incorrecto!");
       } else {
            JOptionPane.showMessageDialog(null, "El mes es correcto!");

       }
    }
}
