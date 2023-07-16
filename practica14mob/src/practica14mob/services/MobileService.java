/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica14mob.services;

import java.util.Scanner;
import java.util.regex.Pattern;
import practica14mob.entities.Mobile;

/**
 *
 * @author blue_
 */
public class MobileService {

    private final Mobile _m = new Mobile();
    private final Scanner _input = new Scanner(System.in).useDelimiter("\n");

    public Mobile loadMobile() {
        System.out.println("Enter mobile brand: ");
        String brand = _input.next();
        System.out.println("Enter price: ");
        double price = _input.nextDouble();
        System.out.println("Enter mobile model: ");
        String model = _input.next();
        System.out.println("Enter mobile rams: ");
        int rams = _input.nextInt();
        System.out.println("Enter mobile storage: ");
        int storage = _input.nextInt();
        System.out.println("Enter mobile 7 numeric code: ");
        String code = _input.next();
        while (!isDigits(code) || code.length() != 7) {
            System.out.println("code must be 7 digits");
            code = _input.next();
        }

        String[] codeArr = code.split("");
        int[] codeNumsArr = new int[codeArr.length];
        for (int i = 0; i < codeNumsArr.length; i++) {
            codeNumsArr[i] = Integer.parseInt(codeArr[i]);
        }
        _m.setBrand(brand);
        _m.setPrice(price);
        _m.setRams(rams);
        _m.setModel(model);
        _m.setStorage(storage);
        _m.setCode(codeNumsArr);
        return _m;
    }

    private static boolean isDigits(String string) {
        Pattern pattern = Pattern.compile("[0-9]+");
        return pattern.matcher(string).matches();
    }

}
