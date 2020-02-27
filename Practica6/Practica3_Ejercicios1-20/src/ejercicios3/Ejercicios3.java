/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Ejercicios3 {

    public static void main(String[] args) {
        try
        {
            boolean correcto = false;
            do {            
                String op = JOptionPane.showInputDialog("Elige lo que deseas hacer:"+"\n"+"\n"+
                                                        "1) Validar un número entero."+"\n"+
                                                        "2) Validar un número entero positivo."+"\n"+
                                                        "3) Validar un número entero negativo."+"\n"+
                                                        "4) Validar DNI, 8 números y una letra al final."+"\n"+
                                                        "5) Validar una IP."+"\n"+
                                                        "6) Validar una matricula de un coche con formato 0000XXX."+"\n"+
                                                        "7) Validar un número binario."+"\n"+
                                                        "8) Validar un número octal."+"\n"+
                                                        "9) Validar un número hexadecimal."+"\n"+
                                                        "10) Validar un número real."+"\n"+
                                                        "11) Validar un número real positivo."+"\n"+
                                                        "12) Validar un número real negativo."+"\n"+
                                                        "13) Validar un número real con x decimales."+"\n"+
                                                        "14) Validar un número real positivo con x decimales."+"\n"+
                                                        "15) Validar un número real negativo con x decimales."+"\n"+
                                                        "16) Validar una fecha con formato dd/mm/aaaa"+"\n"+
                                                        "17) Validar un nombre, incluyendo nombre compuestos."+"\n"+
                                                        "18) Validar un email."+"\n"+
                                                        "19) Validar un nombre de usuario en twitter, empieza por @ y puede contener letras mayúsculas y minúsculas, número, guiones y guiones bajos."+"\n"+
                                                        "20) Validar ISBN de 13 digitos, siempre empieza en 978 o 979."+"\n"+
                                                        "21) Salir"+"\n"+" ");
                int opc = Integer.parseInt(op);
                switch (opc) {
                    case 1:
                        ejercicio1();
                        break;
                    case 2:
                        ejercicio2();
                        break;
                    case 3:
                        ejercicio3();
                        break;
                    case 4:
                        ejercicio4();
                        break;
                    case 5:
                        ejercicio5();
                        break;
                    case 6:
                        ejercicio6();
                        break;
                    case 7:
                        ejercicio7();
                        break;
                    case 8:
                        ejercicio8();
                        break;
                    case 9:
                        ejercicio9();
                        break;
                    case 10:
                        ejercicio10();
                        break;
                    case 11:
                        ejercicio11();
                        break;
                    case 12:
                        ejercicio12();
                        break;
                    case 13:
                        ejercicio13();
                        break;
                    case 14:
                        ejercicio14();
                        break;
                    case 15:
                        ejercicio15();
                        break;
                    case 16:
                        ejercicio16();
                        break;
                    case 17:
                        ejercicio17();
                        break;
                    case 18:
                        ejercicio18();
                        break;
                    case 19:
                        ejercicio19();
                        break;
                    case 20:
                        ejercicio20();
                        break;
                    case 21:
                        correcto = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error! No has introducido la letra correcta.");
                        break;
                        }
            } while (correcto != true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Problemas: " + e.getMessage());
        }
    }
    public static void ejercicio1() {
        //Ejercicio1
        String cadena = JOptionPane.showInputDialog("Introduce un número entero para validarlo.)");
        Pattern pat = Pattern.compile("^-?[0-9]+$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El número es entero.");
        } else {
            JOptionPane.showMessageDialog(null, "El número NO es entero.");
        }
    }
    public static void ejercicio2(){
        //Ejercicio2
        String validacion = JOptionPane.showInputDialog("Introduce un número entero positivo para validarlo.");
        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher m = p.matcher(validacion);
        if (m.matches()) {
            JOptionPane.showMessageDialog(null, "El número es entero positivo.");
        } else {
            JOptionPane.showMessageDialog(null, "El número NO es entero positivo.");
        }  
    }
    public static void ejercicio3(){
        //Ejercicio3
        String cad = JOptionPane.showInputDialog("Introduce un número entero negativo para validarlo");
        Pattern pa = Pattern.compile("^-[0-9]+$");
        Matcher ma = pa.matcher(cad);
        if (ma.matches()) {
            JOptionPane.showMessageDialog(null, "El número es entero negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "El número NO es entero negativo.");
        }
    }
    public static void ejercicio4(){
        //Ejercicio4
        String caden = JOptionPane.showInputDialog("Introduce un DNI para validarlo");
        Pattern patt = Pattern.compile("^[0-9]{8}[A-Z]$");
        Matcher matc = patt.matcher(caden);
        if (matc.matches()) {
            JOptionPane.showMessageDialog(null, "El DNI es CORRECTO.");
        } else {
            JOptionPane.showMessageDialog(null, "El DNI es INCORRECTO.");
        }
    }
    public static void ejercicio5(){
       //Ejercicio5
       String cadena = JOptionPane.showInputDialog("Introduce una IP para validarla");
       Pattern pat = Pattern.compile("^([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])[.]){3}[0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$");
       Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "La IP es CORRECTA.");
        } else {
            JOptionPane.showMessageDialog(null, "La IP es INCORRECTA.");
        }
    }
    public static void ejercicio6(){
       //Ejercicio6
       String cadena = JOptionPane.showInputDialog("Introduce una matricula para validarla (0000XXX)");
       Pattern pat = Pattern.compile("^[0-9]{4}[BCDFGHJKLMNPRSTVWXYZ]{3}$");
       Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "La mátricula es CORRECTA.");
        } else {
            JOptionPane.showMessageDialog(null, "La mátricula es INCORRECTA.");
        }
    }
    public static void ejercicio7(){
       //Ejercicio7
       String cadena = JOptionPane.showInputDialog("Introduce un número binario para validarlo");
       Pattern pat = Pattern.compile("^[0-1]+$");
       Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El número es binario!");
        } else {
            JOptionPane.showMessageDialog(null, "El número introducido NO es un número binario.");
        }
    }
    public static void ejercicio8(){
       //Ejercicio8
       String cadena = JOptionPane.showInputDialog("Introduce una número octal para validarlo");
       Pattern pat = Pattern.compile("^[0-7]+$");
       Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El número es octal!");
        } else {
            JOptionPane.showMessageDialog(null, "El número introducido NO es un número octal.");
        }
    }
    public static void ejercicio9(){
       //Ejercicio9
       String cadena = JOptionPane.showInputDialog("Introduce una número hexadecimal para validarlo");
       Pattern pat = Pattern.compile("^([A-F]*[0-9]*)+$");
       Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El número es hexadecimal!");
        } else {
            JOptionPane.showMessageDialog(null, "El número introducido NO es un número hexadecimal.");
        }
    }
    public static void ejercicio10(){
       //Ejercicio10
       String cadena = JOptionPane.showInputDialog("Introduce un número real para validarlo");
       Pattern pat = Pattern.compile("^-?[0-9]+|-?[0-9]+([.]|[,])[0-9]+$");
       Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El número real es CORRECTO!");
        } else {
            JOptionPane.showMessageDialog(null, "El número real introducido es INCORRECTO.");
        }
    }
    public static void ejercicio11(){
       //Ejercicio11
       String cadena = JOptionPane.showInputDialog("Introduce un número real positivo para validarlo");
       Pattern pat = Pattern.compile("^[0-9]+|[0-9]+([.]|[,])[0-9]+$");
       Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El número real positivo es CORRECTO!");
        } else {
            JOptionPane.showMessageDialog(null, "El número real positivo introducido es INCORRECTO.");
        }
    }
    public static void ejercicio12(){
       //Ejercicio12
       String cadena = JOptionPane.showInputDialog("Introduce un número real negativo para validarlo");
       Pattern pat = Pattern.compile("^-[0-9]+|-[0-9]+([.]|[,])[0-9]+$");
       Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El número real negativo es CORRECTO!");
        } else {
            JOptionPane.showMessageDialog(null, "El número real negativo introducido es INCORRECTO.");
        }
    }
    public static void ejercicio13(){
       //Ejercicio13
       int decimales = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos decimales tendrá el número?"));
       String cadena = JOptionPane.showInputDialog("Introduce un número real con "+decimales+" decimales para validarlo");
       Pattern pat = Pattern.compile("^-?[0-9]+([.]|[,])[0-9]{"+decimales+"}$");
       Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El número real con "+decimales+" decimales es CORRECTO!");
        } else {
            JOptionPane.showMessageDialog(null, "El número real con "+decimales+" decimales introducido es INCORRECTO.");
        }
    }
    public static void ejercicio14(){
       //Ejercicio14
       int decimales = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos decimales tendrá el número?"));
       String cadena = JOptionPane.showInputDialog("Introduce un número real positivo con "+decimales+" decimales para validarlo");
       Pattern pat = Pattern.compile("^[0-9]+([.]|[,])[0-9]{"+decimales+"}$");
       Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El número real positivo con "+decimales+" decimales es CORRECTO!");
        } else {
            JOptionPane.showMessageDialog(null, "El número real positivo con "+decimales+" decimales introducido es INCORRECTO.");
        }
    }
    public static void ejercicio15(){
       //Ejercicio15
       int decimales = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos decimales tendrá el número?"));
       String cadena = JOptionPane.showInputDialog("Introduce un número real negativo con "+decimales+" decimales para validarlo");
       Pattern pat = Pattern.compile("-[0-9]+([.]|[,])[0-9]{"+decimales+"}");
       Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El número real negativo con "+decimales+" decimales es CORRECTO!");
        } else {
            JOptionPane.showMessageDialog(null, "El número real negativo con "+decimales+" decimales introducido es INCORRECTO.");
        }
    }
    public static void ejercicio16(){
       //Ejercicio16
       String cadena = JOptionPane.showInputDialog("Introduce una fecha con formato dd/MM/yyyy para validarla");
       Pattern pat = Pattern.compile("^([1-9]|[1-2][0-9]|3[0-1])[/]([13578]|10|12)[/][12][0-9]{3}$");
       Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "La fecha con formato dd/MM/yyyy es CORRECTA!");
        } else {
            JOptionPane.showMessageDialog(null, "La fecha introducida con formato dd/MM/yyyy es INCORRECTA.");
        }
    }
    public static void ejercicio17(){
       //Ejercicio17
       String cadena = JOptionPane.showInputDialog("Introduce un nombre (incluyendo nombres compuestos) para validarlo");
       Pattern pat = Pattern.compile("^([A-Z][a-z]+[\\s]?){1,3}$");
       Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El nombre es CORRECTO!");
        } else {
            JOptionPane.showMessageDialog(null, "El nombre introducido es INCORRECTO.");
        }
    }
    public static void ejercicio18(){
       //Ejercicio18
       String cadena = JOptionPane.showInputDialog("Introduce un email para validarlo");
       Pattern pat = Pattern.compile("^([\\w]+[\\W]*){3,30}@([\\w]{3,15}[.])?[\\w]{3,20}[.][a-z]{2,3}$");
       Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El email es CORRECTO!");
        } else {
            JOptionPane.showMessageDialog(null, "El email introducido es INCORRECTO.");
        }
    }
    public static void ejercicio19(){
        //Ejercicio19
        String cadena = JOptionPane.showInputDialog("Introduce un nombre de usuario para validarlo.");
        Pattern pat = Pattern.compile("^$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El nombre de usuario es CORRECTO!");
        } else {
            JOptionPane.showMessageDialog(null, "El nombre de usuario introducido es INCORRECTO.");
        }
    }
    public static void ejercicio20(){
        //Ejercicio20
        String cadena = JOptionPane.showInputDialog("Introduce un número ISBN de 13 digitos para validarlo.");
        Pattern pat = Pattern.compile("^$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            JOptionPane.showMessageDialog(null, "El número es CORRECTO!");
        } else {
            JOptionPane.showMessageDialog(null, "El número introducido es INCORRECTO.");
        }
    }
}
