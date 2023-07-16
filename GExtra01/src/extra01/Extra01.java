/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra01;

import extra01.entities.Song;

/**
 *
 * @author blue_
 */
public class Extra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Song s1 = new Song();
        s1.setAuthro("a2");
        s1.setTitle("t2");
        Song s2 = new Song("t1", "a1");
        System.out.println(s1 + "\n" + s2);

    }

}
