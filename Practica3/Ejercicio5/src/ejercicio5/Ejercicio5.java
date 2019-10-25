/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Kuzk
 */
import javax.swing.JOptionPane;
import java.util.*;
import java.text.*;
import java.time.*;
public class Ejercicio5 {
    public static void main(String[] args) {
        int d = Integer.parseInt(JOptionPane.showInputDialog("Introduce el día. (dd)"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes. (MM)"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año. (yyyy)"));
        LocalDate fecha = LocalDate.of(y,m,d);
        fecha = fecha.plusDays(100);
        JOptionPane.showMessageDialog(null,fecha.getDayOfWeek() + ", " + fecha.getDayOfMonth() + " de " + fecha.getMonth() + " de " + fecha.getYear());
        
       /* String cadena = d + m + y;
        SimpleDateFormat junto = new SimpleDateFormat("ddMMyyyy");
        Date date = junto.parse(cadena.toString());
        SimpleDateFormat buenFormato = new SimpleDateFormat("dd-MM-yyyy");
        String fecha = buenFormato.format(date);*/
        // prueba para saber lo que tiene fecha 
        //JOptionPane.showMessageDialog(null, fecha);
        //TODO sumar a la fecha 100 días y mostrarla en formato Viernes, 16 de noviembre de 2018
    }
    
}
