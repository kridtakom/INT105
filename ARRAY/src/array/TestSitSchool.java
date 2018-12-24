
package array;

import java.util.Scanner;
import java.text.*;
public class TestSitSchool {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
//      DecimalFormat df = new DecimalFormat ("####");//ขำๆ
        
        int countsutdent = 0 ;
        System.out.print("Number of Student : ");
        countsutdent = sc.nextInt();
        studentData(countsutdent);
        
    }
    public static void studentData (int countsutdent){
        Scanner sc= new Scanner (System.in);
        SitSchool []student;
        student = new SitSchool [countsutdent];
        String name;
        double score ;
        for(int countt = 0 ; countt<=countsutdent-1;countt++){
            System.out.print("name : ");
            name = sc.next();
            System.out.print("score : ");
            score = sc.nextDouble();
            student[countt] = new SitSchool (name,score);
        }
        for(int i = 0 ; i <=countsutdent-1 ; i++){
            System.out.println(student[i]);
        }
        System.out.println("count student = "+SitSchool.getCounts());
    }
}
