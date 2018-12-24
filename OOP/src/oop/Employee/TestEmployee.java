package oop.Employee;

import java.util.*;
import java.text.*;

public class TestEmployee {

    public static void main(String[] args) {
        String name = null , type = null;
        double salary =0.0;
        
        Scanner sc = new Scanner(System.in);
        
        Employee em1 = new Employee();
        System.out.print("Name : ");
        em1.setName(sc.next());
        System.out.println("");
        
        Employee em2 = new Employee();
         System.out.print("Name : ");
         em2.setName(sc.next());
         System.out.print("Salary : ");
         em2.setSalary(sc.nextDouble());
         System.out.print("Type : ");
         em2.setType(sc.next());
         System.out.println("");
         
         Employee em3 = new Employee();
         System.out.print("Name : ");
         em3.setName(sc.next());
         System.out.print("Salary : ");
         em3.setSalary(sc.nextDouble());
         System.out.print("Type : ");
         em3.setType(sc.next());
         System.out.println("");
         
         Employee em4 = new Employee();
         System.out.print("Name : ");
         em4.setName(sc.next());
         System.out.print("Salary : ");
         em4.setSalary(sc.nextDouble());
         System.out.print("Type : ");
         em4.setType(sc.next());
         System.out.println("");
        
         Employee em5 = new Employee();
         System.out.print("Name : ");
         em5.setName(sc.next());
         System.out.print("Salary : ");
         em5.setSalary(sc.nextDouble());
         System.out.print("Type : ");
         em5.setType(sc.next());
         System.out.println("");
         
         System.out.println(em5.toString());
    }

}
