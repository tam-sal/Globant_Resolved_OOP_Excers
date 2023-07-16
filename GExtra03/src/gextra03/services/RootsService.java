/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gextra03.services;

import gextra03.entities.Roots;
import java.util.Arrays;

/**
 *
 * @author blue_
 */
public class RootsService {

    Roots r = new Roots();

    public double getDiscriminant(double a, double b, double c) {
        r.setA(a);
        r.setB(b);
        r.setC(c);
        return (Math.pow(b, 2)) - (4 * a * c);
    }

    public boolean hasTwoRoots() {
        return getDiscriminant(r.getA(), r.getB(), r.getC()) > 0;
    }

    public boolean hasOneRoot() {
        return getDiscriminant(r.getA(), r.getB(), r.getC()) == 0;
    }

    public double[] getRoots() {
        if (hasTwoRoots()) {
            double[] roots = new double[2];
            double dis = getDiscriminant(r.getA(), r.getB(), r.getC());
            dis = Math.sqrt(dis);
            roots[0] = (-1 * r.getB() + dis) / (2 * r.getA());
            roots[1] = (-1 * r.getB() - dis) / (2 * r.getA());
            return roots;
        }
        System.out.println("Unable to calculate 2 roots");
        return null;
    }

    public double getUniqueRoot() {
        if (hasOneRoot()) {
            return (r.getB() * -1) / (2 * r.getA());
        }
        throw new Error("Unable to calculate a single root");
    }

    public void calculateRoots() {
        if (hasTwoRoots()) {
            System.out.println("Has two roots");
            System.out.println(Arrays.toString(getRoots()));
        } else if (hasOneRoot()) {
            System.out.println("Has one root");
            System.out.println(getUniqueRoot());
        } else {
            System.out.println("Unable to calculate real roots");
        }
    }

}
