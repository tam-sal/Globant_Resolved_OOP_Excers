/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica04rectangulo.services;

import java.util.Scanner;
import practica04rectangulo.entidades.Rectangulo;

/**
 *
 * @author blue_
 */
public class RectanguloServices {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo createRectangulo() {
        Rectangulo rec = new Rectangulo();
        System.out.println("Base: ");
        rec.setBase(input.nextDouble());
        System.out.println("Altura: ");
        rec.setAltura(input.nextDouble());
        return rec;
    }

    public double superficie(Rectangulo r) {
        return r.getAltura() * r.getBase();
    }

    public double perimetro(Rectangulo r) {
        return 2 * (r.getAltura() + r.getBase());
    }

    public void drawRectalgulo(Rectangulo r) {
        int base = (int) r.getBase();
        int altura = (int) r.getAltura();
        for (int row = 0; row < altura; row++) {
            for (int col = 0; col < base; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
