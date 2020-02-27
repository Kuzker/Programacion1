package Modelo;

public class Producto {
    
    //Atributos
    private String nombre;
    private double precio;
    private int unidades;

    //Constructores
    public Producto() {
    }

    public Producto(String nombre, double precio, int unidades) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = unidades;
    }
    
    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    //Otros Metodos
    @Override
    public String toString(){
        return nombre + "  " + precio + "  " + unidades + "\n";
    }
}
