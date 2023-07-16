/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10arr;

import practica10arr.services.RandArrServices;
import java.util.Arrays;
/**
 *
 * @author blue_
 */
public class Practica10Arr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RandArrServices a = new RandArrServices();
        a.createArr(50);
        a.fillRandArr();
        //a.printArr();
        double [] aux = Arrays.copyOfRange(a.getArray(), 0, 10);
        //System.out.println(Arrays.toString(aux));
        Arrays.sort(aux);
        System.out.println(Arrays.toString(aux));
        double [] aux2 = new double[10];
        Arrays.fill(aux2, 0.5);
        //System.out.println(Arrays.toString(aux2));
        RandArrServices b = new RandArrServices();
        b.createArr(20);
        //              src,from srcPos, target, starting target pos, qty of elements to be copied
        System.arraycopy(aux, 0, b.getArray(), 0, aux.length);
        System.arraycopy(aux2, 0, b.getArray(), aux.length, b.getArray().length-aux.length);
        System.out.println(Arrays.toString(b.getArray()));
        
        
        
            
        
        
        
        
        
        
        
        
    }
    
}
