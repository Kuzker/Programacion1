/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import Excepciones.DatoNoValidoException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Kuzk
 */
public class Ejercicio2 {
private static String[] todosIdiomas;
    private static String[] todosNiveles;
    private static ArrayList<ArrayList<Integer>> alumnos;
    private static ArrayList<String> idiomas;
    private static ArrayList<ArrayList<String>> niveles;

    public static void main(String[] args) {
        try{
            crearEstructuras();
            entradaDatos();
            listados();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas " + e.getMessage());
        }
    }
    
    public static void crearEstructuras() throws Exception{
        todosIdiomas=new String[4];
        todosIdiomas[0] = "Inglés";
        todosIdiomas[1] = "Francés";
        todosIdiomas[2] = "Alemán";
        todosIdiomas[3] = "Ruso";
        
        todosNiveles = new String[3];
        todosNiveles[0] = "Básico";
        todosNiveles[1] = "Medio";
        todosNiveles[2] = "Perfeccionamiento";
        
        alumnos = new ArrayList();
        idiomas = new ArrayList();
        niveles = new ArrayList();
    }

    public static void entradaDatos() throws Exception{
        boolean correcto;
        do
        {
            do
            {
                String idioma = introducirDato("idioma", todosIdiomas);
                String nivel = introducirDato("nivel", todosNiveles);
                correcto = introducirAlumnos(idioma,nivel);
            }
            while(!correcto);  
        }
        while(JOptionPane.showConfirmDialog(null, "¿ Quieres continuar?")==0);
    }
    
    public static String introducirDato(String dato, String[] array) throws Exception{
        boolean correcto;
        String datoEntrada="";
        do
        {
            try
            {
                datoEntrada = JOptionPane.showInputDialog("Teclea un " + dato);
                if (!Arrays.asList(array).contains(datoEntrada))
                    throw new DatoNoValidoException();
                correcto = true;
            }
            catch(DatoNoValidoException e)
            {
                JOptionPane.showMessageDialog(null, dato + " no válido");
                correcto = false;
            }
        }
        while(!correcto);
        return datoEntrada;
    }

    public static boolean introducirAlumnos(String idioma, String nivel)
    {
            boolean correcto;
            try
            {
                int posIdioma,posNivel;
                if (!idiomas.isEmpty())
                {
                    posIdioma= idiomas.indexOf(idioma);
                    if (posIdioma== -1)
                    {
                        idiomas.add(idioma);
                        posIdioma = idiomas.size() - 1;
                        niveles.add(new ArrayList());
                        niveles.get(niveles.size()-1).add(nivel);
                        alumnos.add(new ArrayList());
                    }
                    else
                    {
                        posNivel = niveles.get(posIdioma).indexOf(nivel);
                        if (posNivel == -1)
                        {
                            niveles.get(posIdioma).add(nivel);
                        }
                        else
                            throw new DatoNoValidoException();
                    }
                }
                else
                {
                    posIdioma = 0;
                    idiomas.add(idioma);
                    niveles.add(new ArrayList());
                    niveles.get(0).add(nivel);
                    alumnos.add(new ArrayList());
                }
                int nroAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Indica el número de alumnos"));
                alumnos.get(posIdioma).add(nroAlumnos);
                correcto = true;
            }
            catch(DatoNoValidoException e)
            {
                JOptionPane.showMessageDialog(null,"Ya has indicado alumnos para ese idioma y nivel");
                correcto = false;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Problemas con el tipo de dato");
                correcto = false;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Problemas");
                correcto = false;
            }
        return correcto;
    }
    public static void listados() throws Exception{
        String datos = "";
        for (int x = 0; x < alumnos.size(); x++)
        {
            datos += "Idioma: " + idiomas.get(x) + "\n";
            for ( int y = 0; y < niveles.get(x).size(); y++)
                datos += "Nivel: "+ niveles.get(x).get(y) + " " + alumnos.get(x).get(y) + "\n";
        }
        JOptionPane.showMessageDialog(null, datos);
        datos = "";
        for(int x = 0; x < idiomas.size(); x++)
        {
             datos += "Idioma: " + idiomas.get(x) + " Total alumnos: ";
             int suma = 0;
             for (int y = 0; y < alumnos.get(x).size(); y++)
                 suma += alumnos.get(x).get(y);
             datos += suma + "\n";
        }
        JOptionPane.showMessageDialog(null, datos);
        datos = "";
        for(int x = 0; x < todosNiveles.length; x++)
        {
             datos += "Nivel: " + todosNiveles[x] + " Total alumnos: ";
             int suma = 0;
             for(int z = 0;z < niveles.size(); z++){
                   int y = niveles.get(z).indexOf(todosNiveles[x]);
                   if (y != -1){
                       suma += alumnos.get(z).get(y);
                   }
          }
           datos += suma + "\n";
    }
    JOptionPane.showMessageDialog(null, datos);
    }
}
