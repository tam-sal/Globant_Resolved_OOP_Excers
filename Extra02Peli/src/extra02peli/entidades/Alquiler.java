/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02peli.entidades;

import java.time.LocalDate;


/**
 *
 * @author blue_
 */
public class Alquiler {

    private Pelicula p;
    private LocalDate rentDate;
    private LocalDate returnDate;
    private double price;
    public static int count;

    public Alquiler() {
        count++;
    }

    public Alquiler(Pelicula p, LocalDate rentDate, LocalDate returnDate) {
        if (rentDate.isAfter(returnDate)) {
            throw new Error("Fechas invalidas");
        }
        this.p = p;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        count++;
    }

    public Pelicula getP() {
        return p;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public double getPrice() {
        return price;
    }

    public void setP(Pelicula p) {
        this.p = p;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "Movie=" + p + ", rentDate=" + rentDate + ", returnDate=" + returnDate + ", price=" + price + '}';
    }

}
