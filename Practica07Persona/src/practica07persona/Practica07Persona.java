/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica07persona;

import practica07persona.entidades.Persona;
import practica07persona.services.PersonaServices;

/**
 *
 * @author blue_
 */
public class Practica07Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServices ps = new PersonaServices();

        int pesoIdeal = 0;
        int bajoPeso = 0;
        int sobrePeso = 0;
        int mayorDeEdad = 0;
        double porcentajeMayorDeEdad = 0.0;
        double porcentajePesoIdeal = 0.0;
        double porcentajePesoBajo = 0.0;
        double porcentajePesoAlto = 0.0;
        String collector = "";
        
        //Persona p5 = new Persona("fulano", 454, 454 , 545, "j");

        for (int i = 1; i <= 4; i++) {

            Persona p = ps.createPersona();
            int imc = ps.calcularIMC(p);
            boolean mayor = ps.esMayorDeEdad(p);

            if (imc == 1) {
                sobrePeso += 1;
            } else if (imc == 0) {
                pesoIdeal += 1;
            } else {
                bajoPeso += 1;
            }
            if (mayor) {
                mayorDeEdad += 1;
            }
            collector += "\n Persona "+String.valueOf(i)+": \n"+p+"\n----------------------";

        }
        porcentajeMayorDeEdad = (double) mayorDeEdad / 4 * 100;
        porcentajePesoIdeal = (double) pesoIdeal / 4 * 100;
        porcentajePesoBajo = (double) bajoPeso / 4 * 100;
        porcentajePesoAlto = (double) sobrePeso / 4 * 100;
        System.out.println("Reporte");
        System.out.println(collector+"\n");
        System.out.println("% Mayor de edad: "+porcentajeMayorDeEdad);
        System.out.println("% Peso ideal: "+porcentajePesoIdeal);
        System.out.println("% Peso bajo: "+porcentajePesoBajo);
        System.out.println("% Peso alto: "+porcentajePesoAlto);

    }

}
