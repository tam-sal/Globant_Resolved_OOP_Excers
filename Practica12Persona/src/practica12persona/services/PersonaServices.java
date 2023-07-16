/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica12persona.services;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import practica12persona.entidades.Persona;

/**
 *
 * @author blue_
 */
public class PersonaServices {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");
    Persona p = new Persona();
    public Persona createPersona() {
        Persona p = new Persona();
        System.out.println("Person name: ");
        p.setName(input.nextLine());
        System.out.println("birth year: ");
        p.setYear(input.nextInt());
        System.out.println("birth month: ");
        p.setMonth(input.nextInt());
        System.out.println("birth day: ");
        p.setDay(input.nextInt());
        LocalDate birthdate = LocalDate.of(p.getYear(), p.getMonth(), p.getDay());
        p.setBirthDate(birthdate);
        return p;
    }

    public int calcularEdad(Persona p) {
        LocalDate today = LocalDate.now();
        LocalDate personBirth = p.getBirthDate();
        Period dateDiff = Period.between(personBirth, today);
        int age = dateDiff.getYears();
        return age;
    }
    
    public boolean menorQue(Persona p, Persona p1){
        int edadP = calcularEdad(p);
        int edadP1 = calcularEdad(p1);
        return edadP < edadP1;
    }

}
