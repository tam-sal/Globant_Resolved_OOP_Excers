/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica07persona.services;

import java.util.Scanner;
import practica07persona.entidades.Persona;

/**
 *
 * @author blue_
 */
public class PersonaServices {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Persona createPersona() {

        System.out.println("Nombre: ");
        String nombre = input.next();

        System.out.println("Edad: ");
        int edad = input.nextInt();

        System.out.println("Peso: ");
        double peso = input.nextDouble();

        System.out.println("Altura: ");
        double altura = input.nextDouble();

        System.out.println("Sexo: m-h-o ");
        String sexo = input.next();
        while (!(sexo.equalsIgnoreCase("h") || sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("o"))) {
            System.out.println("El sexo debe ser M / H / O");
            sexo = input.next();
        }

        return new Persona(nombre, edad, peso, altura, sexo);

    }

    public int calcularIMC(Persona p) {
        double imc = p.getPeso() / (p.getAltura() * p.getAltura());
        if (imc < 20) {
            System.out.println("IMC bajo peso: "+imc);
            return -1;
        }
        if (imc >= 20 && imc <= 25) {
            System.out.println("IMC peso ideal: "+imc);
            return 0;
        }
        System.out.println("IMC sobre peso: "+imc);
        return 1;
    }
    
    public boolean esMayorDeEdad(Persona p){
        return p.getEdad() >= 18;
    }

}
