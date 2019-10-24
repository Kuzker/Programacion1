/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

/**
 *
 * @author Kuzk
 */
import javax.swing.JOptionPane;
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String x="";
        int nota;
        int aprobados=0;
        while(!x.equals("F"))
        {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la nota del alumno. (0 - 10)"));
            if (nota>=6)
            {
                aprobados++;
            }
            x = JOptionPane.showInputDialog("Introduzca F en caso de que quiera finalizar el programa, sino, presione Enter.");
        }
        JOptionPane.showMessageDialog(null, "El número de aprobados es de "+aprobados);
    }
}
