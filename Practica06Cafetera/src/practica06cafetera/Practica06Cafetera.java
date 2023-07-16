/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica06cafetera;

import practica06cafetera.entidades.Cafetera;
import practica06cafetera.services.CafeteraServices;

/**
 *
 * @author blue_
 */
public class Practica06Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CafeteraServices cafSer = new CafeteraServices();
        Cafetera c = cafSer.createCafetera();
        System.out.println("1- Cafereta estado inicial");
        System.out.println(c);
        
        
        
        cafSer.llenarCafetera(c);
        System.out.println("2- llenar cafe");
        System.out.println(c);
        
        cafSer.servirTaza(10, c);
        System.out.println("3- servir taza 10");
        System.out.println(c);
        
        cafSer.servirTaza(20, c);
        System.out.println("4- servir taza 20");
        System.out.println(c);
        
        cafSer.servirTaza(40, c);
        System.out.println("5- servir taza 40");
        System.out.println(c);
        
        cafSer.agregarCafe(60, c);
        System.out.println("6- agregar cafe 60");
        System.out.println(c);
        
        cafSer.vaciarCafetera(c);
        System.out.println("7- vaciar");
        System.out.println(c);
        
    }

}
