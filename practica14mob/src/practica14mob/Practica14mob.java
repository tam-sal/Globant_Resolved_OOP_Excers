/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica14mob;

import practica14mob.services.MobileService;

/**
 *
 * @author blue_
 */
public class Practica14mob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MobileService ms = new MobileService();
        System.out.println(ms.loadMobile());
        
    }
    
}
