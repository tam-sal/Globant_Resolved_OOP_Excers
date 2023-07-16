/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica12persona;

import java.time.LocalDate;
import practica12persona.entidades.Persona;
import practica12persona.services.PersonaServices;

/**
 *
 * @author blue_
 */
public class Practica12Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServices ps = new PersonaServices();
        Persona p1 = new Persona("Fulano", 1990, 5, 12);
        Persona p5 = new Persona("Sultano", "2000-05-12");
        Persona p6 = new Persona("Haa", LocalDate.of(2000,05,12));
        
        int edad = ps.calcularEdad(p1);

        System.out.println("persona 1: " + p1 + " edad: " + edad);

        Persona p2 = ps.createPersona();
        int edad2 = ps.calcularEdad(p2);
        System.out.println("P2: " + p2 + " edad: " + edad2);
        boolean esMenor = ps.menorQue(p1, p2);
        System.out.println("Persona 1 es menor que Persona 2 " + esMenor);
        Persona p3 = new Persona("Saul", LocalDate.of(2000,10,12));
        System.out.println("p3: "+p3);

    }

}
