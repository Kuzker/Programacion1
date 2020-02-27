/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio1;

/**
 *
 * @author Kuzk
 */

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Ejercicio1 {

public static ArrayList<Double> primero;
public final static NumberFormat FORM = NumberFormat.getNumberInstance(Locale.ROOT);        
    
    public static void main(String[] args) {
        try
        {
            primero = new ArrayList();
            int opcion=0;
            rellenar();
            while(opcion != 10)
            {
                opcion=mostrarMenu();
                switch(opcion)
                {
                    case 1:
                        valorMaxMin();
                        break;
                    case 2:
                            buscarNum();
                        break;
                    case 3:
                            buscarNumBorrado();
                        break;
                    case 4:
                            convertir();
                        break;
                     case 5:
                            mostrarContenido();
                        break;
                     case 6:
                            insertFinal();
                        break;
                     case 7:
                            insertCustom();
                         break;
                     case 8:
                            remove();
                         break;
                     case 9:
                            sumaMedia();
                         break;
                     case 10:
                         JOptionPane.showMessageDialog(null,"Hasta otra");
                         break;
                     default:
                         JOptionPane.showMessageDialog(null, "El número introducido no es correcto.");

                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Problemas no identificados " + e.getMessage());
        }
    }
    
    public static int mostrarMenu() throws Exception
    {
        int opcion=0;
        boolean correcto;
        do
        {
            try
            {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1.- Visualizar el valor maximo y el minimo. \n" +
                                              "2.- Solicitar un numero y buscarlo.\n" +
                                              "3.- Solicitar un numero, buscarlo y borrarlo.\n" +
                                              "4.- Convertir el arrayList en un array.\n" +
                                              "5.- Mostrar el numero de elementos que contiene.\n" +
                                              "6.- Insertar un nuevo elemento por el final.\n" +
                                              "7.- Insertar un nuevo elemento en la posicion indicada.\n" +
                                              "8.- Borrar un elemento de una posicion concreta.\n" + 
                                              "9.- Calcular la suma y media aritmetica de los valores contenidos.\n" +
                                              "10.- Finalizar."));
                correcto = true;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "La opción tiene que ser un número");
                correcto = false;
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(null, "10.- Finalizar");
                correcto = false;
            }
        }
        while(!correcto);
        return opcion;
    }
    public static void rellenar() throws Exception
    {
        boolean continuar = false;
        double num;
        int rep;
        do {
            num = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número. Dicho número puede ser con decimales."));
            primero.add(num);
            rep = JOptionPane.showConfirmDialog(null, "Quieres continuar introduciendo numeros?");
            if (rep==0) {
                continuar = false;
            } else {
                continuar = true;
            }
        } while (!continuar);
    }
    public static Double pedirNumero() throws Exception{
        Double numero = null;
        boolean correcto;
        do
        {
            try
            {
                numero = Double.parseDouble(JOptionPane.showInputDialog("Teclea el número"));
                correcto = true;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"El dato tecleado no es válido");
                correcto = false;
            }
        }
        while(!correcto);
        return numero;
       
    }
    public static void valorMaxMin(){
        double max = primero.get(0);
        double min = primero.get(0);
        for(int i = 1; i < primero.size(); i++) {
            if (primero.get(i) > max) {
                max = primero.get(i);
            }
        }

        for (int i = 1; i < primero.size(); i++) {
            if (primero.get(i) < min) {
                min = primero.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "El valor máximo es "+FORM.format(max)+" y el mínimo es "+FORM.format(min)+".");
    }
    
    public static void buscarNum(){
        Double buscar = Double.parseDouble(JOptionPane.showInputDialog("Que numero desea buscar?"));
        for(int i=0; i < primero.size(); i++){
            if (primero.get(i)==buscar) {
                JOptionPane.showMessageDialog(null, "He encontrado el número: "+FORM.format(buscar)+"!");
            }else{
                JOptionPane.showMessageDialog(null, "Lo siento, no he encontrado el número: "+FORM.format(buscar)+".");
            }
        }
    }
    
    public static void buscarNumBorrado() throws Exception{
        Double numero = pedirNumero();

        if (primero.contains(numero)){
            primero.remove(numero);
            JOptionPane.showMessageDialog(null, "El número ha sido borrado.");
        }
        else
            JOptionPane.showMessageDialog(null, "El número indicado no se encuentra.");      

        if (primero.remove(pedirNumero())== true)
            JOptionPane.showMessageDialog(null, "El número ha sido borrado.");
        else
            JOptionPane.showMessageDialog(null, "El número indicado no se encuentra.");
    }
    
    public static void convertir(){
        
    }
    
    public static void mostrarContenido(){
        
    }
    
    public static void insertFinal(){
        
    }
    
    public static void insertCustom(){
        
    }
    public static void remove(){
        
    }
    public static void sumaMedia(){
        
    }
}
