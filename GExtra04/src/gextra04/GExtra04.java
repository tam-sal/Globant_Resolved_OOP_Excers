/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gextra04;

import gextra04.services.FiscalNumberService;

/**
 *
 * @author blue_
 */
public class GExtra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FiscalNumberService fns = new FiscalNumberService();
        System.out.println(fns.createFiscalNumber());
        System.out.println(fns.displayID());
        
    }
    
}
