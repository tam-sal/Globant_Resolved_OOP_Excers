/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica04rectangulo.entidades;

/**
 *
 * @author blue_
 */
public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {

    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //*Getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    //* Setters
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //* Log
    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

}
