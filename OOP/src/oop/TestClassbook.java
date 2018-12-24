package oop;

import static java.lang.Integer.parseInt;
import java.util.*;

public class TestClassbook {

    public static void main(String[] args) {
        int tax  ;
        double price;
        String isbn , title , author ;
        
        Classbook book1 = new Classbook();
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter Tax : ");
        tax = sc.nextInt();
        System.out.print("ISBN : ");
        isbn = sc.next();
        System.out.print("Title : ");
        title = sc.next();
        System.out.print("Author : ");
        author=sc.next();
        System.out.print("Price : ");
        price=sc.nextInt();
        
        book1.setTax(tax);
        book1.setIsbn(isbn);
        book1.setTitle(title);
        book1.setAuthor(author);
        book1.setPrice(price);
        book1.setTotalPriceTax(price+(price*7/100));
        
        System.out.println(book1.toString());
        System.out.println("");
        
       
        //2
        Classbook book2 = new Classbook();
        System.out.print("ISBN : ");
        isbn = sc.next();
        System.out.print("Title : ");
        title = sc.next();
        System.out.print("Author : ");
        author=sc.next();
        System.out.print("Price : ");
        price=sc.nextInt();
       
        book2.setTax(tax);
        book2.setIsbn(isbn);
        book2.setTitle(title);
        book2.setAuthor(author);
        book2.setPrice(price);
        book2.setTotalPriceTax(price+(price*7/100));
        
        
        System.out.println(book2.toString());
        System.out.println("");
        


        System.out.println("Sum Price : " + (book1.getPrice() + book2.getPrice()));
        System.out.println("Included Tax Total : "+(book1.getTotalPriceTax()+book2.getTotalPriceTax()));


        
        
        
        
      
        
        
    }

    
    }


