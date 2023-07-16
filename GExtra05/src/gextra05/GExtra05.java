/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gextra05;

import java.util.Scanner;

/**
 *
 * @author blue_
 */
public class GExtra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final Scanner _input = new Scanner(System.in).useDelimiter("\n");
        String [] months = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
        String secretMonth = months[3];
        System.out.println("Guess the secret month");
        String res = _input.next();
        while(!res.equalsIgnoreCase(secretMonth)){
            System.out.println("Wrong month! Try again.\nEnter a different month!");
            res = _input.next();
        }
        System.out.println("Correct month: "+res);
        
    }
    
}
