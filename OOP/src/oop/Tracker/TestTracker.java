package oop.Tracker;

import java.util.*;
import java.text.*;

public class TestTracker {

    public static void main(String[] args) {
        String type;
        double x1, x2, y1, y2;
        Scanner sc = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.print("Select type of warning (A,B): ");
        type = sc.next();
        System.out.print("Enter referance position (x,y): ");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        System.out.print("Enter partient position (x,y): ");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        Tracker t1 = new Tracker(x1, y1);
        System.out.println("Distance is : "+df.format(t1.getDistance(x2, y2)) + " , " + " Device type " + type.toUpperCase().charAt(0));
        System.out.println(t1.toString());

    }
}
