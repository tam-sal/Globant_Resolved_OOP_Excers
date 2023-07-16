/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica12persona.entidades;
import java.time.LocalDate;



/**
 *
 * @author blue_
 */
public class Persona {
    private String name;
    private int year;
    private int month;
    private int day;
    private LocalDate birthDate;
    

    public Persona() {
    }

    public Persona(String name,int year, int month, int day) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
        this.birthDate = LocalDate.of(year, month, day);
        
    }
    
    public Persona(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }
    
    public Persona(String name, String birthDate){
        this.name = name;
        String [] date = birthDate.split("-");
        this.year = Integer.parseInt(date[0]);
        this.month = Integer.parseInt(date[1]);
        this.day = Integer.parseInt(date[2]);
        this.birthDate = LocalDate.of(this.year, this.month, this.day);
    }
    


    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", birthDate=" + birthDate + '}';
    }
    
    
}
