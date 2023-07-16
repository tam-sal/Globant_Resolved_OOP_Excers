/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica08cadena;

import java.util.Scanner;
import practica08cadena.entidades.Cadena;
import practica08cadena.services.CadenaService;

/**
 *
 * @author blue_
 */
public class Practica08Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CadenaService cs = new CadenaService();
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Cadena c = cs.createCadena();
        Cadena c1 = new Cadena("es una casa: ");
        System.out.println(cs.contiene(c1, "a"));
        System.out.println("-----------------------");
        System.out.println("La cadena es: "+c+"\nLength: "+c.getLen());
        int vocals = cs.mostrarVocales(c);
        System.out.println("Vocales count: "+vocals);
        String fraseInvertida = cs.invertirFrase(c);
        System.out.println(fraseInvertida);
        System.out.println("La letra a es repetida: "+cs.vecesRepetido(c, 'a'));
        boolean igualLen = cs.compararLongitud("casa blanca", c);
        System.out.println("Son de igual longitud: "+igualLen);
        
        System.out.println("Ingrese una frase");
        String f = input.next();
        System.out.println("Frase unida: \n"+cs.unirFrase(c1, f));
        System.out.println("Reeplazar a con: ");
        String let = input.next();
        char ch = let.charAt(0);
        System.out.println("Reemplazando: \n"+cs.reemplazar(c1, ch));
        
        
        
    }
    
}
