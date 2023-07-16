/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02peli.services;

import extra02peli.entidades.Pelicula;
import java.util.Arrays;

/**
 *
 * @author blue_
 */
public class PeliculaServices {

    private static int _counter = -1;
    private int _length = 0;
    private Pelicula[] _movieList;

    public PeliculaServices(int length) {
        _length = length;
        _movieList = new Pelicula[_length];
    }

    public Pelicula createPelicula(String titulo, String genero, int anio, int duracion, boolean alquilada) {
        Pelicula p = new Pelicula(titulo, genero, anio, duracion, alquilada);
        _counter++;

        if (_counter == _length) {
            // Expand size
            int newSize = _length * 2;
            Pelicula[] newMovieArr = new Pelicula[newSize];
            for (int i = 0; i < _length; i++) {
                newMovieArr[i] = _movieList[i];
            }
            _movieList[_counter] = p;
            _movieList = newMovieArr;
        } else {
            _movieList[_counter] = p;
        }
        return p;
    }

    public Pelicula[] listAllMovies() {
        return _movieList;
    }

    public String displayMovies() {
        Pelicula[] allMovies = listAllMovies();
        return "Movies List: \n" + Arrays.toString(allMovies);
    }

    public Pelicula[] listAvailableMovies() {
        int count = 0;
        Pelicula[] allMovies = listAllMovies();
        for (Pelicula p : allMovies) {
            if (!p.getAlquilada()) {
                count++;
            }
        }
        Pelicula[] avaiableMovies = new Pelicula[count];
        if (count > 0) {
            int idx = 0;
            for (int i = 0; i < _length; i++) {
                if (!allMovies[i].getAlquilada()) {
                    avaiableMovies[idx] = allMovies[i];
                    idx++;
                }
            }
        }
        System.out.println(count + " Peliculas no alquiladas\n" + Arrays.toString(avaiableMovies));
        return avaiableMovies;
    }

    public Pelicula[] rentedList() {
        int count = 0;
        Pelicula[] allMovies = listAllMovies();
        for (Pelicula p : allMovies) {
            if (p.getAlquilada()) {
                count++;
            }
        }
        Pelicula[] rented = new Pelicula[count];

        int idx = 0;

        for (int i = 0; i < _length; i++) {
            if (allMovies[i].getAlquilada()) {
                rented[idx] = allMovies[i];
                idx++;
            }
        }
        System.out.println(count + " Peliculas Alquiladas: \n" + Arrays.toString(rented));
        return rented;

    }

    public boolean searchByTitle(String titulo) {
        for (Pelicula p : _movieList) {
            if (p == null) {
                System.out.println("Doesn't exist");
                return false;
            }

            if (p.getTitulo().equalsIgnoreCase(titulo)) {
                return true;
            }
        }
        System.out.println(titulo.toLowerCase() + ": Pelicula no encontrada");
        return false;
    }

    public int getMovieIdx(String title) {
        for (int i = 0; i < _movieList.length; i++) {
            String movTitle = _movieList[i].getTitulo();
            if (movTitle.equalsIgnoreCase(title)) {
                return i;
            }
        }
        return -1;
    }

    public boolean searchByGenre(String genero) {
        Pelicula[] allMovies = listAllMovies();
        for (Pelicula p : allMovies) {
            if (p.getGenero().equalsIgnoreCase(genero)) {
                System.out.println("Genero " + genero.toLowerCase() + " encontrado");
                return true;
            }
        }
        System.out.println("Genero " + genero.toLowerCase() + " no encontrado");
        return false;
    }

}
