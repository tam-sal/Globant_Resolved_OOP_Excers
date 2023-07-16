/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02peli.services;

import extra02peli.entidades.Alquiler;
import extra02peli.entidades.Pelicula;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author blue_
 */
public class AlquilerServices {

    private final Scanner _input = new Scanner(System.in).useDelimiter("\n");
    public Alquiler rent = new Alquiler();
    public PeliculaServices ps;
    public LocalDate rentDate;
    public LocalDate returnDate;
    public int days;
    public double price;
    private Pelicula[] _moviesList;

    public AlquilerServices() {
    }

    public AlquilerServices(PeliculaServices ps) {
        this.ps = ps;
        this._moviesList = ps.listAllMovies();
    }

    public Pelicula[] getMovies() {
        return _moviesList;
    }

    public boolean isMovieExist(String title) {
        return ps.searchByTitle(title);
    }

    public boolean isRented(String title) {
        if (isMovieExist(title)) {
            return getMovies()[ps.getMovieIdx(title)].getAlquilada();
        }
        throw new Error("Movie doesn't exist");
    }

    public LocalDate rentDate(String date) {
        rentDate = LocalDate.parse(date);
        return rentDate;
    }

    public LocalDate returnDate(String date) {
        returnDate = LocalDate.parse(date);
        return returnDate;

    }

    public boolean validDates(LocalDate rentDate, LocalDate returnDate) {
        return returnDate.isAfter(rentDate) || rentDate.isEqual(returnDate);
    }

    public int getDays(LocalDate rentDate, LocalDate returnDate) {
        days = Period.between(rentDate, returnDate).getDays();
        if (days == 0) {
            days = 1;
        }
        return days;
    }

    public double getPrice(int days) {
        if (days <= 3) {
            price = 10;
        } else {
            price = 10 + Math.round(10 * Math.pow(1.1, 3 - days));
        }
        return price;
    }

    public int getMovieIndex(String title) {
        return ps.getMovieIdx(title);
    }

    public void updateMovieState(String title) {
        getMovies()[getMovieIndex(title)].setAlquilada(true);
    }

    public Pelicula getMovieToRent(String title) {
        return getMovies()[getMovieIndex(title)];
    }

    public Alquiler createRent() {
        System.out.println("Movies List:\n" + Arrays.toString(getMovies()));
        System.out.println("Enter movie title to rent:\n");
        String userTitle = _input.next();

        if (isMovieExist(userTitle)) {
            if (!isRented(userTitle)) {
                System.out.println("Enter start & end rent date yyyy-mm-dd:\n");
                LocalDate userStartDate = rentDate(_input.next());
                LocalDate userEndDate = returnDate(_input.next());

                while (!validDates(userStartDate, userEndDate)) {
                    System.out.println("invalid dates");
                    System.out.println("Enter start & end rent date yyyy-mm-dd:\n");
                    userStartDate = rentDate(_input.next());
                    userEndDate = returnDate(_input.next());
                }
                int rentDaysCount = getDays(userStartDate, userEndDate);
                double userPayment = getPrice(rentDaysCount);

                Pelicula p = getMovieToRent(userTitle);

                updateMovieState(userTitle);

                rent.setP(p);

                rent.setRentDate(userStartDate);

                rent.setReturnDate(userEndDate);

                rent.setPrice(userPayment);
                System.out.println("Movies Updated:\n" + Arrays.toString(_moviesList));
                System.out.print("Rented Movie: ");
                return rent;
            } else {
                System.out.println("Movie is already rented");
                return null;
            }
        } else {
            System.out.println("Movie doesn't exist");
            return null;
        }
    }

    public void rental() {
        String[] rentalList = new String[10];
        int idx = 0;
        String userInput = "";

        while (!userInput.equalsIgnoreCase("X")) {
            Alquiler r = createRent();
            if (r != null) {
                System.out.println(r.toString());
                rentalList[idx] = "Movie title: " + r.getP().getTitulo() + ", Start date: " + r.getRentDate() + ", Return date: " + r.getReturnDate() + ", Price: " + r.getPrice() + "\n";
                idx++;
            }
            System.out.println("Actual Rental List:\n" + Arrays.toString(rentalList));
            System.out.println("Do you want to exit? [X]\nOtherwise hit [enter] to rent a new movie!");
            userInput = _input.next();
        }
    }
}
