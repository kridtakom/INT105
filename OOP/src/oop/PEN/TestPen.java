
package oop.PEN;

import java.util.Scanner;

public class TestPen {

    public static void main(String[] args) {
//        Pen pen1 = new Pen(1,"001","pentil",200);
//        Pen pen2 = new Pen(2,"075","WanPen",100);
//        Pen pen3 = new Pen(3,"089","DuanPenb",60);
//        Pen pen4 = new Pen(4);
//        Pen pen5 = new Pen(5,"089");
//        Pen pen6 = new Pen(6,"089","DuanPenb");

        Scanner sc=new Scanner(System.in);
        
        String loop="Yes";
        
        
            while(loop.equalsIgnoreCase("yes")){
            System.out.print("Enter pen Id: ");
            long penId=sc.nextLong();

            System.out.print("Enter pen Model: ");
            String penModel=sc.next();

            System.out.print("Enter pen Brand: ");
            String penBrand=sc.next();

            System.out.print("Enter pen Price: ");
            double penPrice=sc.nextDouble();

            Pen pen = new Pen(penId,penModel,penBrand,penPrice);
                do{
                    System.out.println("You want to key again?(yes/no)");
                    loop=sc.next();
                }while(!loop.equalsIgnoreCase("yes")&&!loop.equalsIgnoreCase("no"));
            }
        
        System.out.println(Pen.allPens()+Pen.numberOfPen()+" pcs");
    }
    

    
}

