/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica08cadena.entidades;

/**
 *
 * @author blue_
 */
public class Cadena {
    private String frase;
    private int len;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.len = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public int getLen() {
        return len;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLen(int len) {
        this.len = len;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", len=" + len + '}';
    }
    
    
}
