/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02circunferencia;

import practica02circunferencia.entidades.Circunferencia;
import practica02circunferencia.services.CircunferenciaService;

/**
 *
 * @author blue_
 */
public class Practica02Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CircunferenciaService cs = new CircunferenciaService();
        Circunferencia c = cs.crearCircunferencia();
        double ar = cs.area(c);
        System.out.println("area es: "+ar);
        double per = cs.perimetro(c);
        System.out.println("perimetro: "+per);
    }
    
}
