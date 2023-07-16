/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02peli.entidades;

/**
 *
 * @author blue_
 */
public class Pelicula {
    
    private String titulo;
    private String genero;
    private int anio;
    private int duracion;
    private boolean alquilada;
    
    
    public Pelicula() {
        
    }

    public Pelicula(String titulo, String genero, int anio, int duracion, boolean alquilada) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.duracion = duracion;
        this.alquilada = alquilada;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnio() {
        return anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public boolean getAlquilada() {
        return alquilada;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setAlquilada(boolean alquilada) {
        this.alquilada = alquilada;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", genero=" + genero + ", anio=" + anio + ", duracion=" + duracion + ", alquilada=" + alquilada + '}';
    }
    
    
}
