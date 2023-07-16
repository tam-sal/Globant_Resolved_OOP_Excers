/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica05cuenta.services;

import java.util.Scanner;
import practica05cuenta.entidades.Cuenta;

/**
 *
 * @author blue_
 */
public class CuentaService {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Cuenta createCuenta() {
        Cuenta c = new Cuenta();
        System.out.println("nro de cuenta");
        c.setNroCuenta(input.nextInt());
        System.out.println("DNI: ");
        c.setDni(input.nextLong());
        System.out.println("Saldo: ");
        c.setSaldoActual(input.nextInt());
        return c;
    }

    public void ingresar(double ingreso, Cuenta c) {
        c.setSaldoActual(ingreso + c.getSaldoActual());
    }

    public void retirar(double retiro, Cuenta c) {
        c.setSaldoActual(c.getSaldoActual() - retiro);
    }

    public void extraccionRapida(Cuenta c, double retiroRapido) {
        if (retiroRapido > 0.2 * c.getSaldoActual()) {
            System.out.println("El retiro no puedo ser mayor a " + 0.2 * c.getSaldoActual());
        }
        c.setSaldoActual(c.getSaldoActual() - retiroRapido);
    }

    public void consultarSaldo(Cuenta c) {
        System.out.println("Su saldo actual es: " + c.getSaldoActual());
    }

    public void consultarDatos(Cuenta c) {
        System.out.println("Datos de cuenta: \n" + c);
    }

}
