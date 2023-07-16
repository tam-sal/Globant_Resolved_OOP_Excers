/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica04rectangulo;

import practica04rectangulo.entidades.Rectangulo;
import practica04rectangulo.services.RectanguloServices;

/**
 *
 * @author blue_
 */
public class Practica04Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RectanguloServices rs = new RectanguloServices();
        Rectangulo rec = rs.createRectangulo();
        System.out.println("Rectangulo Object: \n"+rec);
        double superficie = rs.superficie(rec);
        System.out.println("Superficie: "+superficie);
        double perimetro = rs.perimetro(rec);
        System.out.println("Perimetro: "+perimetro);
        rs.drawRectalgulo(rec);
    }
    
}
