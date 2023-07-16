/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica06cafetera.entidades;

/**
 *
 * @author blue_
 */
public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        if (this.cantidadActual > capacidadMaxima) {
            throw new Error("La cantidad maxima debe ser mayor a la actaul");
        }
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        if (this.capacidadMaxima < cantidadActual) {
            throw new Error("Cantidad actual no puede ser mayor a la maxima");
        }
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }

}
