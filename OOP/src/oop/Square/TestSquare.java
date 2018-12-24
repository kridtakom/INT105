package oop.Square;

import java.util.*;

public class TestSquare {

    public static void main(String[] args) {
        
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Square 1 ");
        System.out.print("Enter Width : ");
        Square sq1 = new Square(sc.nextInt());
//        sq1.setWidth(sc.nextInt());
        System.out.println(sq1.toString());
        
        System.out.println("Square 2 ");
        System.out.print("Enter Width : ");
        Square sq2 = new Square(sc.nextInt());
        System.out.println(sq2.toString());
        
        System.out.println("Thank You");
    }
}
//