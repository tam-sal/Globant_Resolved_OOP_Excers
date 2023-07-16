/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica07persona.entidades;

/**
 *
 * @author blue_
 */
public class Persona {

    private String nombre;
    private int edad;
    private double peso;
    private double altura;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre, int edad, double peso, double altura, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        if (sexo.equalsIgnoreCase("h") || sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("o")) {
            this.sexo = sexo;
        }
        else{
            throw new Error("Sexo invalido");
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setSexo(String sexo) {
        if (sexo.equalsIgnoreCase("h") || sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("o")) {
            this.sexo = sexo;
        }
        else{
            throw new Error("Sexo invalido");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + ", sexo=" + sexo + '}';
    }

}
