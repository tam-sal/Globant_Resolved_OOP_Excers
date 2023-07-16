/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10arr.services;


import java.util.Arrays;
import java.util.Random;
import practica10arr.entidades.RandArr;

/**
 *
 * @author blue_
 */
public class RandArrServices {
    
    public RandArr r = new RandArr();
    private final Random rand = new Random();
    
    public double[] createArr(int len){
        r.setLen(len);
        r.setArr(new double[len]);
        return r.getArr();
    }
    
    public double[] getArray(){
        return r.getArr();
    }
    
    public double[] fillRandArr(){
//        r.setLen(len);
//        r.setArr(new double[len]);
        for (int i = 0; i < r.getLen(); i++) {
            double val = rand.nextDouble()*11+1;
            r.getArr()[i] = val;
        }
        return r.getArr();
    }
    
    public void printArr(){
        System.out.println(Arrays.toString(r.getArr()));
    }
    
}
