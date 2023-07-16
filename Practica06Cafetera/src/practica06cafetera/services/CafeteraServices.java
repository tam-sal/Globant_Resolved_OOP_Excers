/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica06cafetera.services;

import java.util.Scanner;
import practica06cafetera.entidades.Cafetera;

/**
 *
 * @author blue_
 */
public class CafeteraServices {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Cafetera createCafetera() {
        System.out.println("Ingrese Maxima Capacidad");
        int maxCap = input.nextInt();
        System.out.println("Ingrese cantidad actual");
        int cantActual = input.nextInt();
        if (cantActual > maxCap) {
            throw new Error("La cantidad actual no puede ser mayor a la capacidad maxima");
        }
        return new Cafetera(maxCap, cantActual);
    }

    public void llenarCafetera(Cafetera c) {
        c.setCantidadActual(c.getCapacidadMaxima());
    }

    public void servirTaza(int cantidad, Cafetera c) {
        if (c.getCantidadActual() < 1) {
            System.out.println("No hay cafe en la cafetera");
        } else if (c.getCantidadActual() > 0 && c.getCantidadActual() < cantidad) {
            c.setCantidadActual(c.getCantidadActual() - cantidad);
            System.out.println("Solo se sirvió " + c.getCantidadActual() / cantidad * 100 + " % de la taza");
            if (c.getCantidadActual() < 1) {
                c.setCantidadActual(0);
                System.out.println("No hay cafe en la cafetera");
            }
        } else {
            c.setCantidadActual(c.getCantidadActual() - cantidad);
            System.out.println("Se llenó la taza y quedó en la cafetera una cantidad de " + c.getCantidadActual());
        }
    }

    public void vaciarCafetera(Cafetera c) {
        c.setCantidadActual(0);
    }

    public void agregarCafe(int cantidad, Cafetera c) {
        int resto = c.getCapacidadMaxima() - c.getCantidadActual();
        System.out.println("El resto es: " + resto);
        while (resto < cantidad) {
            System.out.println("Qeuda capacidad para "+resto+" La cantidad ingresada va a superar la maxima capacidad \nIngrese otra cantidad:\n");
            cantidad = input.nextInt();
        }
        c.setCantidadActual(c.getCantidadActual() + cantidad);
        System.out.println("Cantidad agregada. La cantidad actual es: " + c.getCantidadActual());
    }

}
