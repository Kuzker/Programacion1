package Modelo;

import java.util.ArrayList;

public class Libro extends Obra{
    //Atributos
    private String editorial;
    private int numeroPaginas;

    //Constructores
    public Libro() {
    }

    public Libro(String editorial, int numeroPaginas, String titulo, int anoEdicion) {
        super(titulo, anoEdicion);
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
    }

    //Getters and Setters
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
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
        return "Libro{" + "editorial=" + editorial + ", numeroPaginas=" + numeroPaginas + '}';
    }

    
    
    
    
}
