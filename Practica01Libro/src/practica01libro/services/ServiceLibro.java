/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica01libro.services;

import java.util.Scanner;
import practica01libro.entidades.Libro;

/**
 *
 * @author blue_
 */
public class ServiceLibro {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Libro createLibro() {
        Libro book = new Libro();
        System.out.println("ISBN: ");
        book.setISBN(input.nextInt());
        System.out.println("Title: ");
        book.setTitle(input.next());
        System.out.println("Author: ");
        book.setAuthor(input.next());
        System.out.println("Pages in book: ");
        book.setPagesNum(input.nextInt());
        return book;
    }

}
