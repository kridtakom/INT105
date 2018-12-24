package array.ArrayOOP;

import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student : ");
        int input = sc.nextInt();
        Student[] std = new Student[input];
        for (int i = 0; i < input; i++) {
            int num = i + 1;
            String name;
            double scores;
            System.out.println("Student " + num);
            System.out.print("Name : ");
            name = sc.next();
            System.out.print("Scores : ");
            scores = sc.nextDouble();
            std[i] = new Student(name, scores);

        }

        for (Student std1 : std) {
            System.out.println(std1);
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        
        maxScore(std);
       
       

    }
    public static void maxScore (Student[] std){
        String ans = std[0].toString();
        double max = std[0].getScores();
        for (int i = 0; i < std.length; i++) {
            if(std[i].getScores()>max){
                ans = std[i].toString();
            }
        }
        System.out.println("MAX : "+ans);
    }

}
