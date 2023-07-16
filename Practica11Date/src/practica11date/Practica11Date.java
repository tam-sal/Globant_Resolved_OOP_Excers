/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11date;

import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;


/**
 *
 * @author blue_
 */
public class Practica11Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate currentDate = LocalDate.now();
        int currentYr = currentDate.getYear();
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Day: ");
        int day = input.nextInt();
        System.out.println("Month: ");
        int month = input.nextInt();
        System.out.println("Year: ");
        int year = input.nextInt();
        LocalDate inptDate = LocalDate.of(year, month, day);
        System.out.println("Input date: "+inptDate);
        Period dateDiff = Period.between(inptDate, currentDate);
        System.out.println("Date diff: "+dateDiff);
        int yearDiff = dateDiff.getYears();
        System.out.println("Diff in years: "+yearDiff);
        int daysDiff = dateDiff.getDays();
        System.out.println("Diff in days: "+daysDiff);
    }
    
}
