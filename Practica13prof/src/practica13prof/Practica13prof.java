/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica13prof;

import practica13prof.services.CourseServices;

/**
 *
 * @author blue_
 */
public class Practica13prof {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CourseServices cs = new CourseServices();
        System.out.println(cs.createCourse());
        System.out.println("Weekly earnings: "+cs.getWeeklyEarnings());
        
    }
    
}
