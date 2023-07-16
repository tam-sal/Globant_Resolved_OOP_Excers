/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02.entities;

/**
 *
 * @author blue_
 */
public class Point {
    private double _x;
    private double _y;

    public Point() {
    }

    public Point(double _x, double _y) {
        this._x = _x;
        this._y = _y;
    }

    public double getX() {
        return _x;
    }

    public double getY() {
        return _y;
    }

    public void setX(double _x) {
        this._x = _x;
    }

    public void setY(double _y) {
        this._y = _y;
    }
    
    

    @Override
    public String toString() {
        return "Point{" + "_x=" + _x + ", _y=" + _y + '}';
    }
    
    
    
}
