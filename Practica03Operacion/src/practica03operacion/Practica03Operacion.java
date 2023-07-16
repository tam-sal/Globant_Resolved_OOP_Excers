/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica03operacion;

import practica03operacion.entidades.Operacion;
import practica03operacion.services.OperacionService;

/**
 *
 * @author blue_
 */
public class Practica03Operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OperacionService opSer = new OperacionService();
        Operacion op = opSer.crearOperacion();
        double suma = opSer.sumar(op);
        System.out.println("Suma es: " + suma);
        double resta = opSer.restar(op);
        System.out.println("Resta es: " + resta);
        double multi = opSer.multiplicar(op);
        System.out.println("Multiplicacion: "+ multi);
        double div = opSer.dividir(op);
        System.out.println("Division: "+div);
    }

}
