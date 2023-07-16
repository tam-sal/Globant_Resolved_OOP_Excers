/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gextra03;

import gextra03.services.RootsService;

/**
 *
 * @author blue_
 */
public class GExtra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RootsService rs = new RootsService();
        System.out.println("Discriminant: \n"+rs.getDiscriminant(-2, 1.8, 5));
        rs.calculateRoots();
        
        
    }
    
}
