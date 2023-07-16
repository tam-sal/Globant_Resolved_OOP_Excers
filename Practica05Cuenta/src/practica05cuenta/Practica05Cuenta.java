/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica05cuenta;

import practica05cuenta.entidades.Cuenta;
import practica05cuenta.services.CuentaService;

/**
 *
 * @author blue_
 */
public class Practica05Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaService cs = new CuentaService();
        Cuenta c = cs.createCuenta();
        cs.consultarDatos(c);
        cs.ingresar(1000.9, c);
        cs.consultarDatos(c);
        cs.extraccionRapida(c, 2001);
        cs.consultarDatos(c);
        cs.extraccionRapida(c, 1000);
        cs.consultarDatos(c);
        cs.retirar(2500, c);
        cs.consultarDatos(c);

    }

}
