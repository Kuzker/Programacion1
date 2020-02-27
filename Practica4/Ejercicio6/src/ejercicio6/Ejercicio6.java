/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;
import javax.swing.JOptionPane;
import java.util.Arrays;


/**
 *
 * @author Egibide
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String resultado = "";
        
        String texto = JOptionPane.showInputDialog("Introduce un texto");
        String textoString = texto.toUpperCase();
        
        char[] letras = new char[26];
        
            for(int x=0; x < letras.length; x++){
            letras[x]= (char) ('A' + x );
            } 
            
            for (int contar=0; contar<textoString.length();contar++) { 
                int a = 0;
                for(int valor=0; valor<26; valor++){
                    
                    if (textoString.charAt(contar)==letras[valor]){
                        a++;
                    }
                        resultado = textoString.charAt(contar) + " = " + a + "\n";
                    }
            }
            
          JOptionPane.showMessageDialog(null, resultado);
        
       
    }
    
}
