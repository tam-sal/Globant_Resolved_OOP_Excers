/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02;

import extra02.entities.Point;
import extra02.services.PointService;

/**
 *
 * @author blue_
 */
public class Extra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PointService ps = new PointService();
        Point p1 = ps.generatePoint();
        Point p2 = ps.generatePoint();
        System.out.println(ps.getDistance(p1, p2));
        
    }
    
}
