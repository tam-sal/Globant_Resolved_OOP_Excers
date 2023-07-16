/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02peli;


import extra02peli.services.AlquilerServices;
import extra02peli.services.PeliculaServices;


/**
 *
 * @author blue_
 */
public class Extra02Peli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PeliculaServices ps = new PeliculaServices(10);
        ps.createPelicula("XY1", "terror", 2000, 90, true);
        ps.createPelicula("XY2", "terror", 2000, 90, false);
        ps.createPelicula("XY3", "comedy", 2000, 90, true);
        ps.createPelicula("XY4", "comedy", 2000, 90, false);
        ps.createPelicula("XY5", "documentary", 2000, 90, true);
        ps.createPelicula("XY6", "suspense", 2000, 90, false);
        ps.createPelicula("XY7", "romance", 2000, 90, true);
        ps.createPelicula("XY8", "terror", 2000, 90, false);
        ps.createPelicula("XY9", "terror", 2000, 90, true);
        ps.createPelicula("XY10", "comedy", 2000, 90, false);

                
        
        AlquilerServices as = new AlquilerServices(ps);
        as.rental();
        
    }
    
}
