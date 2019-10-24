/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

/**
 *
 * @author Kuzk
 */
import javax.swing.JOptionPane;
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota;
        String nombre;
        int mayor=0;
        int menor=10;
        String nomMayor="";
        String nomMenor="";
        
        for(int cont=0;cont<40;cont++)
        {
            nombre = JOptionPane.showInputDialog("Introduce el nombre del alumn@");
            nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota."));
            if (nota>mayor)
            {
                mayor = nota;
                nomMayor = nombre;
            } else {
                if(nota<menor)
                {
                    menor = nota;
                    nomMenor = nombre;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "El/La alumn@ "+nomMayor+" tiene la calificación mayor con la nota "+mayor+".");
        JOptionPane.showMessageDialog(null, "El/La alumn@ "+nomMenor+" tiene la calificación menor con la nota "+menor+".");
    }
 
}
