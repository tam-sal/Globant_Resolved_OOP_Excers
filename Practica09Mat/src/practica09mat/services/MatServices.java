/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica09mat.services;

import java.util.Scanner;
import java.lang.Math;
import practica09mat.entidades.Mat;

/**
 *
 * @author blue_
 */
public class MatServices {

    public Mat m = new Mat();
    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public double devolverMayor() {
        if (m.getNum1() > m.getNum2()) {
            return m.getNum1();
        }
        return m.getNum2();
    }

    public double calcularPotencia() {
        double mayor = devolverMayor();
        if (mayor == m.getNum1()) {
            return Math.pow(Math.round(mayor), Math.round(m.getNum2()));
        }
        return Math.pow(Math.round(m.getNum2()), Math.round(m.getNum1()));
    }

    public double calculaRaiz() {
        double mayor = devolverMayor();
        double menor;
        if (mayor != m.getNum1()) {
            menor = m.getNum1();
        } else {
            menor = m.getNum2();
        }
        return Math.round(Math.sqrt(Math.abs(menor)));
    }

    @Override
    public String toString() {
        return "Mat{ num1=" + m.getNum1() + ", num2=" + m.getNum2() + "}";
    }

}
