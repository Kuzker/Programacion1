/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Kuzk
 */
import javax.swing.JOptionPane;
import java.util.Arrays;
import Excepciones.*;

public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bucle = true;
        String cadena = "";
        char[] letra = new char[26];
        for(int i = 0; i<26; i++) {
            letra[i] = (char) ('A' + i);
            // Comprobar lo que tiene el Array: JOptionPane.showMessageDialog(null, letra[i]);
        }
        
        try {
         
            do{
            int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número. (-1 En caso de que quieras finalizar el programa.)"));
            if(num == -1)
            {
              bucle = false;  
            }if(num<-1 || num>25){
              throw new numIncorrecto();
            }else{
                cadena += letra[num];
            }
        } while(bucle != false);
        
        JOptionPane.showMessageDialog(null, "La cadena resultante es: "+cadena);
        }  catch (numIncorrecto e) {
            JOptionPane.showMessageDialog(null, "Has introducido un valor menor de -1 y mayor de 25");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRORES");
        }        
    }
}
