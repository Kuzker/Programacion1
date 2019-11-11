/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author Kuzk
 */
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Ejercicio8 {


    public static void main(String[] args) {
        try
        {
            boolean correcto = false;
            do {            
                String op = JOptionPane.showInputDialog("Introduce la letra (a, b, c o d) para seleccionar la opción deseada:"+"\n"+"\n"+
                                                        "a) Calcular la edad"+"\n"+
                                                        "b) Suma entre dos números"+"\n"+
                                                        "c) Contar las vocales de una frase o párrafo"+"\n"+
                                                        "d) Salir");
                char opc = op.toLowerCase().charAt(0);
                switch (opc) {
                    case 'a':
                        calcularEdad();
                        break;
                    case 'b':
                        sumarNumeros();
                        break;
                    case 'c':
                        contarVocales();
                        break;
                    case 'd':
                        correcto = true;
                        break;
                    default:
                        break;
                        }
            } while (correcto != true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Problemas: " + e.getMessage());
        }
    }
    
    public static void calcularEdad() {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fechaString = JOptionPane.showInputDialog("Teclea tu fecha de nacimiento (dd/MM/yyyy)");
            LocalDate fnacimiento = LocalDate.parse(fechaString, formatter);
            LocalDate factual = LocalDate.now();
            Period edad = Period.between(fnacimiento, factual);
            JOptionPane.showMessageDialog(null, "Tienes "+ edad.getYears() +" años!");
    }
    
    public static void sumarNumeros() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número que desees sumar."));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número."));
        int suma = num1 + num2;
        JOptionPane.showMessageDialog(null, "La suma de "+num1+" y "+num2+" es "+suma);
    }
        
    public static void contarVocales() {
        String cadena = JOptionPane.showInputDialog("Introduce una frase para que cuente sus vocales.");
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int x = 0; x < cadena.length(); x++) {
            char mirar = cadena.toLowerCase().charAt(x);

            switch (mirar) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "La frase tiene "+(a+e+i+o+u)+" vocales!");
    }
}
