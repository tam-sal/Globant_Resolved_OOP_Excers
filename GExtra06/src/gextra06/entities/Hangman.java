/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gextra06.entities;

import java.util.Arrays;

/**
 *
 * @author blue_
 */
public class Hangman {
    private String [] _word;
    private int _foundLetters;
    private int _maxTrials;

    public Hangman() {
    }

    public Hangman(String[] _word, int _foundLetters, int _maxTrials) {
        this._word = _word;
        this._foundLetters = _foundLetters;
        this._maxTrials = _maxTrials;
    }

    public void setWord(String[] _word) {
        this._word = _word;
    }

    public void setFoundLetters(int _foundLetters) {
        this._foundLetters = _foundLetters;
    }

    public void setMaxTrials(int _maxTrials) {
        this._maxTrials = _maxTrials;
    }

    public String[] getWord() {
        return _word;
    }

    public int getFoundLetters() {
        return _foundLetters;
    }

    public int getMaxTrials() {
        return _maxTrials;
    }

    @Override
    public String toString() {
        return "Hangman{" + "_word=" + Arrays.toString(_word) + ", _foundLetters=" + _foundLetters + ", _maxTrials=" + _maxTrials + '}';
    }
    
    
    
}
