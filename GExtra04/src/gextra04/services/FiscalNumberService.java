/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gextra04.services;

import gextra04.entities.FiscalNumber;
import java.util.Scanner;

/**
 *
 * @author blue_
 */
public class FiscalNumberService {

    private final FiscalNumber _fn = new FiscalNumber();
    private final Scanner _input = new Scanner(System.in).useDelimiter("\n");
    private final String[] _letters = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B",
        "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    public FiscalNumber createFiscalNumber() {
        System.out.println("Enter the person ID:");
        long id = _input.nextLong();
        String letter = calculateLetter(id);
        if (letter != null) {
            _fn.setLetter(letter);
        }
        _fn.setId(id);
        return _fn;
    }
    
    public String displayID(){
        return _fn.getId()+"-"+_fn.getLetter();
    }

    private String calculateLetter(long id) {
        int idx = (int) id % 23;
        if (idx > 22) {
            return null;
        }
        return _letters[idx];
    }

}
