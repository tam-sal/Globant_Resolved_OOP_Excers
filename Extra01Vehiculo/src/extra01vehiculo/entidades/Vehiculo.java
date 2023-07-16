/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra01vehiculo.entidades;

import java.util.Scanner;

/**
 *
 * @author blue_
 */
public class Vehiculo {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");
    private String marca;
    private int modelo;
    private int anio;
    private String tipo;
    private int distancia;

    public Vehiculo() {
        this.distancia = 0;
    }

    public Vehiculo(String marca, int modelo, int anio, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        if (tipo.equalsIgnoreCase("auto") || tipo.equalsIgnoreCase("moto") || tipo.equalsIgnoreCase("bici")) {
            this.tipo = tipo;
        }

        this.distancia = 0;
    }

    public Scanner getInput() {
        return input;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getTipo() {
        return tipo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setTipo(String tipo) {
        if (!(tipo.equalsIgnoreCase("moto") || tipo.equalsIgnoreCase("auto") || tipo.equalsIgnoreCase("bici"))) {
            throw new Error("Tipo invalido");
        }
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{ marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", tipo=" + tipo + '}';
    }

}
