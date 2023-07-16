/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica14mob.entities;

import java.util.Arrays;

/**
 *
 * @author blue_
 */
public class Mobile {

    private String _brand;
    private double _price;
    private String _model;
    private int _rams;
    private int _storage;
    private int[] _code;
    
    public Mobile() {
    }
    
    public Mobile(String _brand, double _price, String _model, int _rams, int _storage, int[] _code) {
        this._brand = _brand;
        this._price = _price;
        this._model = _model;
        this._rams = _rams;
        this._storage = _storage;
        _code = new int[7];
        this._code = _code;
    }
    
    public String getBrand() {
        return _brand;
    }
    
    public double getPrice() {
        return _price;
    }
    
    public String getModel() {
        return _model;
    }
    
    public int getRams() {
        return _rams;
    }
    
    public int getStorage() {
        return _storage;
    }
    
    public int[] getCode() {
        return _code;
    }
    
    public void setBrand(String _brand) {
        this._brand = _brand;
    }
    
    public void setPrice(double _price) {
        this._price = _price;
    }
    
    public void setModel(String _model) {
        this._model = _model;
    }
    
    public void setRams(int _rams) {
        this._rams = _rams;
    }
    
    public void setStorage(int _storage) {
        this._storage = _storage;
    }
    
    public void setCode(int[] _code) {
        this._code = _code;
    }
    
    @Override
    public String toString() {
        return "Mobile{" + "_brand=" + _brand + ", _price=" + _price + ", _model=" + _model + ", _rams=" + _rams + ", _storage=" + _storage + ", _code=" + Arrays.toString(_code) + '}';
    }
    
}
