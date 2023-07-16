/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica08cadena.services;

import java.util.Scanner;
import practica08cadena.entidades.Cadena;

/**
 *
 * @author blue_
 */
public class CadenaService {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");
    //public Cadena c = new Cadena();

    public Cadena createCadena() {
        Cadena c = new Cadena();
        System.out.println("Ingrese el texto");
        String frase = input.next();
        c.setFrase(frase);
        c.setLen(frase.length());
        return c;
    }

    public int mostrarVocales(Cadena c) {
        int countVoc = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < c.getLen(); i++) {
            char letter = c.getFrase().charAt(i);
            if (vowels.contains(String.valueOf(letter))) {
                countVoc += 1;
            }
        }
        return countVoc;
    }

    public String invertirFrase(Cadena c) {
        String invertida = "";
        for (int i = c.getLen() - 1; i >= 0; i--) {
            char letra = c.getFrase().charAt(i);
            invertida += letra;
        }
        return invertida;
    }

    public int vecesRepetido(Cadena c, char s) {
        int repeated = 0;
        for (int i = 0; i < c.getLen(); i++) {
            char letra = c.getFrase().charAt(i);
            if (letra == s) {
                repeated++;
            }
        }
        return repeated;
    }

    public boolean compararLongitud(String frase, Cadena c) {
        return frase.length() == c.getLen();
    }

    public String unirFrase(Cadena c, String f) {
        return c.getFrase().concat(f);
    }

    public String reemplazar(Cadena c, char let) {
        String output = "";
        for (int i = 0; i < c.getLen(); i++) {
            char letEnCadena = c.getFrase().charAt(i);
            if(letEnCadena == 'a'){
               letEnCadena = let;
            }
            output += letEnCadena;
        }
        return output;
    }
    
    public boolean contiene(Cadena c, CharSequence let){
        return c.getFrase().contains(let);
    }

}
