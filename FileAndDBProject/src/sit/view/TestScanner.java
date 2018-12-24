/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import sit.model.Student;

/**
 *
 * @author Kridtakom
 */
public class TestScanner {

    public static void main(String[] args) {

        int numofLines = 0;
        int numofWords = 0;
        int numofChar = 0;
        ArrayList<Student> stdList = new ArrayList<Student>();
        try {
            File file = new File("StudentList.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                numofLines++;
                String line = sc.nextLine();
                numofChar = numofChar+line.length();
                System.out.println(line);
               
                Scanner scStr = new Scanner(line); 
                while (scStr.hasNext()) {
                   
                    int id = scStr.nextInt();
                    String firstname = scStr.next();
                    String lastname = scStr.next();
                    Student std = new Student(id,firstname,lastname);
                    numofWords++;
                    stdList.add(std);
                    
                }
                 System.out.println("---");
            }

        } catch (FileNotFoundException ff) {
            System.out.println(ff);
        }
        for(Student std2:stdList){
            System.out.println(std2);
        }

       /* System.out.println(numofLines);
        System.out.println(numofWords);
        System.out.println(numofChar);*/
    }

}
