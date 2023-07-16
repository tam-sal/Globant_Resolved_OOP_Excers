/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica01libro.entidades;

/**
 *
 * @author blue_
 */
public class Libro {

    private int ISBN;
    private String title;
    private String author;
    private int pagesNum;

    public Libro() {

    }

    public Libro(int ISBN, String title, String author, int pagesNum) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.pagesNum = pagesNum;
    }

    //*Getters
    public int getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagesNum() {
        return pagesNum;
    }
    
    //* Setters
    
    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPagesNum(int pagesNum) {
        this.pagesNum = pagesNum;
    }

    //* Log Object
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", pagesNum=" + pagesNum + '}';
    }

}
