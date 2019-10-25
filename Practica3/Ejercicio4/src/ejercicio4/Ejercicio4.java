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
import java.text.ParseException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
public class Ejercicio4 {

    /**
     */
    public static Calendar f1 = Calendar.getInstance();
    public static Calendar f2 = Calendar.getInstance();
    public static Long dias;
    
    public static void main(String[] args) throws ParseException {
        solicitarDatos();
        tratarDatos();
        JOptionPane.showMessageDialog(null, "La diferencia es de " + dias + " días");
    }
    
    public static void solicitarDatos() throws ParseException {
        String fecha = JOptionPane.showInputDialog("Teclea una fecha (dd-MM-yyyy)");
        SimpleDateFormat forma = new SimpleDateFormat("dd-MM-yyyy");
        f1.setTime(forma.parse(fecha));
        
        fecha = JOptionPane.showInputDialog("Teclea otra fecha (dd-MM-yyyy)");
        f2.setTime(forma.parse(fecha));
    }
    
    public static void tratarDatos() {
        Long milisegundos = f1.getTimeInMillis() - f2.getTimeInMillis();
        dias = milisegundos / 86400000;
    }
}
