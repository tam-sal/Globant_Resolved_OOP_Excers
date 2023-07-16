/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gextra06.services;

import gextra06.entities.Hangman;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author blue_
 */
public class HangmanService {

    private final Hangman _hm = new Hangman();
    private final Scanner _input = new Scanner(System.in).useDelimiter("\n");
    public String[] userArray;

    public Hangman createGame() {
        System.out.println("Enter your secret word");
        String word = _input.next();
        _hm.setWord(word.toLowerCase().split(""));
        System.out.println("Enter the max number of trials");
        _hm.setMaxTrials(_input.nextInt());
        _hm.setFoundLetters(0);
        userArray = new String[_hm.getWord().length];
        Arrays.fill(userArray, "_");
        return _hm;
    }

    public int getWordLength() {
        return _hm.getWord().length;
    }

    public boolean findLetter(String letter) {
        int count = 0;
        for (int i = 0; i < getWordLength(); i++) {
            if (_hm.getWord()[i].equalsIgnoreCase(letter)) {
                userArray[i] = letter;
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Letter found in secret word");
        } else {
            System.out.println("Letter was not found");
        }
        return count > 0;
    }

    public void getFoundCount(String letter) {
        int count = 0;
        int correctLettersCount = 0;
        String col = "";
        boolean found = findLetter(letter);
        if (!found) {
            _hm.setMaxTrials(_hm.getMaxTrials() - 1);
        }
        for (String let : userArray) {
            if (let.equals("_")) {
                count++;
            } else {
                if (!col.contains(let)) {
                    correctLettersCount++;
                    col += let;
                }

            }
        }
        int rightGuess = getWordLength() - count;
        System.out.println(
                "You filled: " + rightGuess + " places"
                + "\nStill missing letters: " + count
                + "\nCorrect guessed letters: " + correctLettersCount);
    }

    public int getTrials() {
        return _hm.getMaxTrials();
    }

    boolean compare() {
        return Arrays.equals(
                Arrays.stream(_hm.getWord()).map(String::toLowerCase).toArray(),
                Arrays.stream(userArray).map(String::toLowerCase).toArray()
        );
    }

    public void play() {

        Hangman hm = createGame();
        String inputs = "";
        String userInput;
        System.out.println(Arrays.toString(hm.getWord())
                + "\n" + Arrays.toString(userArray));
        while (hm.getMaxTrials() != 0 && !compare()) {
            System.out.println("Guess a letter of the secret word");
            userInput = _input.next().toLowerCase();
            if (!inputs.contains(userInput)) {
                inputs += userInput;
                getFoundCount(userInput);
                System.out.println("Your trials count is: " + getTrials());
                System.out.println(Arrays.toString(hm.getWord()) + "\n" + Arrays.toString(userArray));
            } else {
                System.out.println("You already entered that letter");
                System.out.println("Your still have " + getTrials() + " trials left!");
            }

        }
        if (compare()) {
            System.out.println("You won!");
        } else {
            System.out.println("You ran out of trials!");
        }
    }
}
