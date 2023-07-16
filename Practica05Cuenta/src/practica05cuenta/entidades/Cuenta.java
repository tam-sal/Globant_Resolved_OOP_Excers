/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica05cuenta.entidades;

/**
 *
 * @author blue_
 */
public class Cuenta {

    private int nroCuenta;
    private long dni;
    private int saldoActual;

    public Cuenta() {
    }

    public Cuenta(int nroCuenta, long dni, int saldoActual) {
        this.nroCuenta = nroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    //*Setters
    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = (int) saldoActual;
    }

    //* Getters
    public int getNroCuenta() {
        return nroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    //* Logger
    @Override
    public String toString() {
        return "Cuenta{" + "nroCuenta=" + nroCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + '}';
    }

}
