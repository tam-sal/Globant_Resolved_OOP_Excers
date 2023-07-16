/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gextra04.entities;

/**
 *
 * @author blue_
 */
public class FiscalNumber {
    private long _id;
    private String _letter;

    public FiscalNumber() {
    }

    public FiscalNumber(long _id, String _letter) {
        this._id = _id;
        this._letter = _letter;
    }

    public long getId() {
        return _id;
    }

    public String getLetter() {
        return _letter;
    }

    public void setId(long _id) {
        this._id = _id;
    }

    public void setLetter(String _letter) {
        this._letter = _letter;
    }

    @Override
    public String toString() {
        return "FiscalNumber{" + "_id=" + _id + ", _letter=" + _letter + '}';
    }
    
    
    
}
