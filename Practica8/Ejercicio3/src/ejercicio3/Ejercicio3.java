package ejercicio3;

import Modelo.*;
import Vista.*;
import java.util.ArrayList;

public class Ejercicio3 {
    
    private static V_Principal v1;
    private static V_Compra v2;
    private static V_Venta v3;
    private static ArrayList<Producto> listaProductos;
    private static Producto p;
    
    public static void main(String[] args) {
        datos();
        v1 = new V_Principal();
        v1.setVisible(true);
    }
 
    public static void datos(){
        listaProductos = new ArrayList<Producto>();
        p = new Producto("Patatas",2.5,300);
        listaProductos.add(p);
         p = new Producto ("Tomates",15,100);
        listaProductos.add(p);
         p = new Producto ("Lechuga",3.5,50);
        listaProductos.add(p);
         p = new Producto ("Manzanas",5.3,1000);
        listaProductos.add(p);
         p = new Producto ("Peras",2.5,10);
        listaProductos.add(p);
         p = new Producto ("Cerezas",4.6,76);
        listaProductos.add(p);
         p = new Producto ("Brocoli",5,25);
        listaProductos.add(p);
    }
    public static void salir(){
        v1.dispose();
        System.exit(0);
    }

    public static void visualizarCompra() {
        v1.setVisible(false);
        v2 = new V_Compra();
        v2.setVisible(true);
    }

    public static void visualizarVenta() {
        v1.setVisible(false);
        v3 = new V_Venta();
        v3.setVisible(true);
    }
    
    public static void volver (javax.swing.JFrame v){
        v.dispose();
        v1.setVisible(true);
    }

    public static boolean validar(String nombre){
        int i;
        for (i = 0; i < listaProductos.size() && listaProductos.get(i).getNombre().compareToIgnoreCase(nombre)!=0; i++) {
        }
        if (i==listaProductos.size())
            return false;
        p = listaProductos.get(i);
        return true;
    }
    
    public static Object listado() {
        String datos="";
        for(int i = 0; i < listaProductos.size(); i++)
            datos += listaProductos.get(i).toString();
        return datos;
    }

    public static boolean validarCompra(int unidades, double precio) {
        try
        {
            double nuevoPrecio = (p.getUnidades()*p.getPrecio()+ unidades * precio)/(p.getUnidades()+ unidades);
            p.setUnidades(p.getUnidades() + unidades);
            p.setPrecio(nuevoPrecio);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public static boolean validarVenta(int unidades){
        try {
            p.setUnidades(p.getUnidades()-unidades);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static double getPrecio(){
        return p.getPrecio();
    }
    
    public static int getUnidades(){
        return p.getUnidades();
    }
}
