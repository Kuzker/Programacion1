/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

/**
 *
 * @author Kuzk
 */
import javax.swing.JOptionPane;
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static double consum ;
    public static double total;
    public static void main(String[] args) {
        // TODO code application logic here
        String dato1 = JOptionPane.showInputDialog("¿Qué consumo mensual quiere cobrar?");
        consum = Double.parseDouble(dato1);
        
        if (consum>=0)
        {
            if (300>consum)
            {
                total = consum * 0.04;
                JOptionPane.showMessageDialog(null, "El consumo mensual es de "+Math.round(total)+"€");
            }else{
                tratarConsumo();
            }
        }else{
            JOptionPane.showMessageDialog(null, "El número introducido no es correcto.");
        }
        
    }
    
    public static void tratarConsumo(){
        
        double primeros;
        primeros = 300 * 0.03;
        double total1;
        double restantes;
        double coste;
        double desc;
        if (300<=consum && consum<=500)
        {
            total = consum * 0.03;
            JOptionPane.showMessageDialog(null, "El consumo mensual es de "+Math.round(total)+"€");
        }else{
            if (consum<800)
            {
                restantes = 300 - consum;
                total1 = restantes * 0.02;
                total = primeros + total1;
                JOptionPane.showMessageDialog(null, "El consumo mensual es de "+Math.round(total)+"€");
            }else{
                restantes = consum - 300;
                total1 = restantes * 0.02;
                coste = primeros + total1;
                desc = coste * 0.125;
                total = coste - desc;
                JOptionPane.showMessageDialog(null, "El consumo mensual es de "+Math.round(total)+"€");
            }
        }
    }
    
}
