/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10arr.entidades;

import java.util.Arrays;

/**
 *
 * @author blue_
 */
public class RandArr {

    private int len;
    private double[] arr;

    public RandArr() {
    }

    public RandArr(int len, double[] arr) {
        this.len = len;
        this.arr = new double[len];
        this.arr = arr;
    }

    public int getLen() {
        return len;
    }

    public double[] getArr() {
        return arr;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public void setArr(double[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "RandArr{" + "len=" + len + ", arr=" + Arrays.toString(arr) + '}';
    }

}
