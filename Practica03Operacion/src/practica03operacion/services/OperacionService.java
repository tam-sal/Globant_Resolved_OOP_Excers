/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica03operacion.services;

import java.util.Scanner;
import practica03operacion.entidades.Operacion;

/**
 *
 * @author blue_
 */
public class OperacionService {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Operacion crearOperacion() {
        Operacion op = new Operacion();
        System.out.println("Num1: ");
        op.setNum1(input.nextDouble());
        System.out.println("Num2: ");
        op.setNum2(input.nextDouble());
        return op;

    }

    public double sumar(Operacion op) {
        return op.getNum1() + op.getNum2();
    }

    public double restar(Operacion op) {
        return op.getNum1() - op.getNum2();
    }

    public double multiplicar(Operacion op) {
        double num1 = op.getNum1();
        double num2 = op.getNum2();
        if (num1 == 0.0 || num2 == 0.0) {
            System.out.println("Error: multiplicacion por 0");
            return 0;
        }
        return num1 * num2;
    }

    public double dividir(Operacion op) {
        double num1 = op.getNum1();
        double num2 = op.getNum2();
        if (num2 == 0.0) {
            System.out.println("Error: Division por cero");
            return 0;
        }
        return num1 / num2;
    }

}
