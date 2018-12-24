package loop.newpackage;

import java.util.Scanner;

public class ScoreOfStu {

    public static void main(String[] args) {
        int id;
        String name = null ;
        double point = 0 ;
   
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID : ");
        id = sc.nextInt();

        while (id != 0) {
                System.out.print("Enter Name : ");
                name = sc.next();
                System.out.print("Enter Point : ");
                point = sc.nextDouble();
                System.out.println("");
                System.out.print("Enter ID : ");
                 id = sc.nextInt();
                 maxScore(id,name,point);

        }

        System.out.println(maxScore(id,name,point));
    }
    
    public static String maxScore(int id,String name ,double point ){
         int Aid = 0;
         String Aname = null;
         double Apoint = 0;
         String ans;
         if (point > Apoint ) {
                    Aid = id;
                    Aname = name;
                    Apoint = point;
         }
        ans = "Max Score\n"
                + "ID : " + Aid + "\n"
                + "Name : " + Aname + "\n"
                + "Score : " + Apoint;
                 
        return   ans;        
    }
}
