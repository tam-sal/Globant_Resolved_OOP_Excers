/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra01vehiculo;

import extra01vehiculo.entidades.Vehiculo;
import extra01vehiculo.services.VehiculoService;

/**
 *
 * @author blue_
 */
public class Extra01Vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VehiculoService vc = new VehiculoService();
        Vehiculo auto = new Vehiculo("BMW", 2000, 2001, "auto");
        Vehiculo moto = new Vehiculo("Kawa", 2000, 2020, "moto");
        Vehiculo bici = new Vehiculo("Rali", 2000, 2002, "biCi");
        int seg = 300;
        

        System.out.print("Auto: ");
        vc.mover(auto, seg);
        vc.frenar(auto);
        System.out.println();
        System.out.print("Moto: ");
        vc.mover(moto, seg);
        vc.frenar(moto);
        System.out.println();
        System.out.print("Bici: ");
        vc.mover(bici, seg);
        vc.frenar(bici);
        System.out.println();
        if(auto.getDistancia() > moto.getDistancia() && moto.getDistancia() > bici.getDistancia()){
            System.out.println("El auto llego mas lejos");
        }
        else if(auto.getDistancia() < moto.getDistancia() && moto.getDistancia() > bici.getDistancia()){
            System.out.println("La moto llegó a mas distancia");
        }
        else{
            System.out.println("La bici llego mas lejos");
        }
        System.out.println("Distancias:\nAuto: "+auto.getDistancia()+"\nMoto: "+moto.getDistancia()+"\nBici: "+bici.getDistancia());

    }

}
