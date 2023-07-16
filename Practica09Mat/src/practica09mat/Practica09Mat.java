/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica09mat;
import java.util.Random;
import practica09mat.entidades.Mat;
import practica09mat.services.MatServices;

/**
 *
 * @author blue_
 */
public class Practica09Mat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        double num1 = rand.nextDouble() * 10;
        double num2 = rand.nextDouble() * 10;
        MatServices ms = new MatServices();
        System.out.println("num1 "+num1 + "num2 "+ num2);
        Mat m1 = ms.m;
        m1.setNum1(num1);
        m1.setNum2(num2);
        System.out.println(m1);
        double mayor = ms.devolverMayor();
        System.out.println("Mayor es: "+mayor);
        double pot = ms.calcularPotencia();
        System.out.println("Potencia: "+pot);
        System.out.println("Raiz del menor: "+ms.calculaRaiz());
        System.out.println("Math Service Print "+ms);
    }
    
}
