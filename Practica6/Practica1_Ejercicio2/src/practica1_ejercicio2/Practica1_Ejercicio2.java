package practica1_ejercicio2;

import Excepciones.*;
import Modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Practica1_Ejercicio2 {

    public static void main(String[] args) {
        try {
            ArrayList<Alumno> listaAlumnos;
            listaAlumnos = obtenerAlumnos();
            buscar(listaAlumnos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas: " + e.getMessage());
        }
    }
    
    public static void buscar(ArrayList<Alumno> lista) throws Exception {
        String codigo = JOptionPane.showInputDialog("Teclea el código del alumno.");
        validarCodigo(codigo);
        int i;
        for (i = 0; i < lista.size() && lista.get(i).getCodigo().equals(codigo) == false; i++) { 
        }
        if (i == lista.size()) {
            JOptionPane.showMessageDialog(null, "El alumno no ha sido encontrado.");
        } else {
            JOptionPane.showMessageDialog(null, "Alumno: " + lista.get(i) + "\n" + lista.get(i).toString());
        }
    }
    
    public static ArrayList<Alumno> obtenerAlumnos(){
        ArrayList<Alumno> lista = new ArrayList();
        do {            
            try {
                String codigo = JOptionPane.showInputDialog("Introduce el código del alumno.");
                validarCodigo(codigo);
                String nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno.");
                validarNombre(nombre);
                String domi = JOptionPane.showInputDialog("Introduce el domicilio.");
                validarDomi(domi);
                String telef = JOptionPane.showInputDialog("Introduce el telefono.");
                validarTelef(telef);
                Alumno a = new Alumno(codigo, nombre, domi, telef);
                lista.add(a);
            }
            catch(DatoNoValido e){
              JOptionPane.showMessageDialog(null,"El dato introducido es incorrecto.");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Problemas :" + e.getMessage());
            }
        } while (JOptionPane.showConfirmDialog(null,"¿ Quieres continuar con otro alumno?")==0);
        return lista;
    }
    
    public static void validarCodigo(String codigo)throws Exception{
        boolean error=false;
        if (codigo.length()!= 5)
            error = true;
        else
            for (int i = 0; i < codigo.length() && error == false;i++)
                if (Character.isAlphabetic(codigo.charAt(i)))
                    error = true;
        if (error)
            throw new DatoNoValido();          
    }
    
    public static void validarNombre(String nombre)throws Exception{
        boolean error=false;
        if (nombre.length()<= 2)
            error = true;
        else
            for (int i = 0; i < nombre.length() && error == false;i++)
                if (Character.isDigit(nombre.charAt(i)))
                    error = true;
        if (error)
            throw new DatoNoValido();       
    }
    
    public static void validarDomi(String domicilio)throws Exception{
        if (domicilio.length()<= 10)
            throw new DatoNoValido();
    }
    
    public static void validarTelef(String telefono) throws Exception{
        boolean error=false;
        if (telefono.length()!= 9)
            error = true;
        else
            if (telefono.charAt(0)!= '6' && telefono.charAt(0)!= '7' && telefono.charAt(0)!= '8' && telefono.charAt(0)!= '9' )
                error = true;
            else
                for (int i = 0; i < telefono.length() && error == false;i++)
                    if (Character.isAlphabetic(telefono.charAt(i)))
                        error = true;
        if (error)
            throw new DatoNoValido();
    }
}
