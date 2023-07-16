/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra01vehiculo.services;

import extra01vehiculo.entidades.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author blue_
 */
public class VehiculoService {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Vehiculo createVehiculo() {
        System.out.println("Marca: ");
        String marca = input.next();
        System.out.println("Modelo: ");
        int modelo = input.nextInt();
        System.out.println("Año: ");
        int anio = input.nextInt();
        System.out.println("Tipo: ");
        String tipo = input.next();
        while (!(tipo.equalsIgnoreCase("auto") || tipo.equals("moto") || tipo.equalsIgnoreCase("bici"))) {
            System.out.println("El tipo debe ser: auto | moto | bici");
            tipo = input.next();
        }
        Vehiculo v = new Vehiculo(marca, modelo, anio, tipo);
        v.setDistancia(0);
        return v;
    }

    public void mover(Vehiculo v, int segundos) {
        System.out.println("Distancia anterior: " + v.getDistancia());
        if (segundos < 1) {
            throw new Error("Segundos debe ser positivo");
        }
        int metros;
        if (v.getTipo().equalsIgnoreCase("auto")) {
            metros = 3;
        } else if (v.getTipo().equalsIgnoreCase("moto")) {
            metros = 2;
        } else {
            metros = 1;
        }
        v.setDistancia(v.getDistancia() + metros * segundos);
        System.out.println("Distancia actual: " + v.getDistancia());
    }

    public void frenar(Vehiculo v) {
        System.out.println("Freno - Distancia Actual: " + v.getDistancia());
        if (v.getTipo().equalsIgnoreCase("auto") || v.getTipo().equalsIgnoreCase("moto")) {
            v.setDistancia(v.getDistancia() + 2);
            System.out.println("Distancia luego de frenar: " + v.getDistancia());
        } else {
            System.out.println("La bici se freno y esta en distancia: " + v.getDistancia());
        }
    }

}
