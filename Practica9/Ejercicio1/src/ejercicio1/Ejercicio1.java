package ejercicio1;

import Modelo.*;
import Vista.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    
    private static VPrincipal vp;
    private static VMostrar vm;
    private static BaseDatos dbcon;
    private static TablaPersonas persona;
    private static ArrayList<Personas> lista;
    private static int posicion;

    public static void main(String[] args) {
            dbcon = new BaseDatos();
            dbcon.conectar();
            persona = new TablaPersonas(dbcon.getCon());
            vp = new VPrincipal();
            vp.setVisible(true);
    }
    
    public static void buscar(String nombre) throws Exception{
        Personas p = persona.consultar(nombre);
        ver(p);
    }
    
    public static void ver(Personas p){
        JOptionPane.showMessageDialog(null, "Datos de la persona:"+"\n"+"\n"+
                                                "1)Nombre: "+p.getNombre()+"\n"+
                                                "2)Edad: "+p.getEdad()+"\n"+
                                                "3)Profesión: "+p.getProfesion()+"\n"+
                                                "4)Teléfono: "+p.getTelefono());
    }
    
    public static void altaPersonas(){
        vp.setVisible(false);
        vm = new VMostrar();
        vm.setVisible(true);
    }
    
    public static void obtenerDatos() throws Exception {
        lista = persona.listaPersonas();
        if (lista.size()>0) {
            posicion = 0;
            vm = new VMostrar(lista.get(posicion).getNombre(),lista.get(posicion).getEdad(),lista.get(posicion).getProfesion(),lista.get(posicion).getTelefono());
            vm.setVisible(true);
        } else {
            throw new Exception("No hay personas registradas.");
        }
    }
    
    public static boolean isAnterior(){
        if (posicion!=0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean isSiguiente(){
        if (posicion!=lista.size()-1) {
            return true;
        } else {
            return false;
        }
    }
    
    public static String getSiguienteNombre(){
        posicion += 1;
        return lista.get(posicion).getNombre();
    }
    
    public static String getAnteriorNombre(){
        posicion -= 1;
        return lista.get(posicion).getNombre();
    }
    
    public static Integer getEdad(){
        return lista.get(posicion).getEdad();
    }
    
    public static String getProfesion(){
        return lista.get(posicion).getProfesion();
    }
    
    public static String getTelefono(){
        return lista.get(posicion).getTelefono();
    }
    
    public static void insertar(String nombre, Integer edad, String profesion, String telefono) throws Exception {
        Personas p = new Personas();
        p.setNombre(nombre);
        p.setEdad(edad);
        p.setProfesion(profesion);
        p.setTelefono(telefono);
        persona.insertar(p);
    }
    
    public static void fin(){
        dbcon.desconectar();
        System.exit(0);
    }
    
    public static void salir() throws Exception {
        vm.dispose();
        vp.setVisible(true);
    }
}
