package Modelo;

import java.util.ArrayList;


public class Pelicula  extends Obra{

    //Atributos
    private String productora;
    private int duracion;

    //Constructores
    public Pelicula(String titulo, int anoEdicion) {
        super(titulo, anoEdicion);
    }

    public Pelicula(String productora, int duracion, String titulo, int anoEdicion) {
        super(titulo, anoEdicion);
        this.productora = productora;
        this.duracion = duracion;
    }

    //Getters and Setters
    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Artista> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(ArrayList<Artista> listaArtistas) {
        this.listaArtistas = listaArtistas;
    }

    //Otros Metodos
    @Override
    public String toString() {
        return "Pelicula{" + "productora=" + productora + ", duracion=" + duracion + '}';
    }
    
    
    
    
    
}
