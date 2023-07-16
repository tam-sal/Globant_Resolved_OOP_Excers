/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02circunferencia.services;

import practica02circunferencia.entidades.Circunferencia;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author blue_
 */
public class CircunferenciaService {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Circunferencia crearCircunferencia() {
        System.out.println("Radio: ");
        double radio = input.nextDouble();
        return new Circunferencia(radio);
    }

    public double area(Circunferencia c) {
        double radio = c.getRadio();
        return Math.pow(radio, 2) * Math.PI;
    }

    public double perimetro(Circunferencia c) {
        double radio = c.getRadio();
        return 2 * Math.PI * radio;
    }

}
