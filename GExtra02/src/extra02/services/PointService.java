/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02.services;

import extra02.entities.Point;
import java.util.Scanner;

/**
 *
 * @author blue_
 */
public class PointService {

    private final Scanner _input = new Scanner(System.in).useDelimiter("\n");
    

    public Point generatePoint() {
        Point p = new Point();
        System.out.println("Enter coordinate x");
        p.setX(_input.nextDouble());
        System.out.println("Enter coordinate y");
        p.setY(_input.nextDouble());
        return p;
    }

    public double getDistance(Point p1, Point p2) {
        System.out.print("Distance between: "+p1+" and "+p2+" is: ");
        return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
    }

}
