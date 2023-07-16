/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica01libro;

import practica01libro.entidades.Libro;
import practica01libro.services.ServiceLibro;

/**
 *
 * @author blue_
 */
public class Practica01Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiceLibro sl = new ServiceLibro();
        Libro book = sl.createLibro();
        System.out.println("created book:\n"+book);
        
    }
    
}
