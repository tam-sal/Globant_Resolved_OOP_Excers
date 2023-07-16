/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gextra03.entities;

/**
 *
 * @author blue_
 */
public class Roots {
    private double _a;
    private double _b;
    private double _c;

    public Roots() {
    }

    public Roots(double _a, double _b, double _c) {
        this._a = _a;
        this._b = _b;
        this._c = _c;
    }

    public double getA() {
        return _a;
    }

    public double getB() {
        return _b;
    }

    public double getC() {
        return _c;
    }

    public void setA(double _a) {
        this._a = _a;
    }

    public void setB(double _b) {
        this._b = _b;
    }

    public void setC(double _c) {
        this._c = _c;
    }
    
    
    

    @Override
    public String toString() {
        return "Roots{" + "_a=" + _a + ", _b=" + _b + ", _c=" + _c + '}';
    }
    
}
