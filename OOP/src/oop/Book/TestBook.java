
package oop.Book;

import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        Book b1 = new Book("english 101" ,"language");
        Book b2 = new Book("thai 101" ,"language");
        Book b3 = new Book("com 101" ,"science");
        Book b4 = new Book("nuclear" ,"science");
        System.out.println(Book.numOfBookByCategory("language"));
        System.out.println(Book.numOfBookByCategory("science"));
        
        
    }
    
}
