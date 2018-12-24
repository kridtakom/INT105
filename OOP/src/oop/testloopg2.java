package oop;

import java.util.Scanner;

public class testloopg2 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter Sentense : ");
        String sentense = sn.nextLine();
        String numVowel = isVowel(sentense);
        System.out.print(numVowel);
    }

    public static String isVowel(String char1) {
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;
        String sentense = "";
        int num = 0; //ใช้ตอนwhile
//        for (int num = 0; num < char1.length(); num++) {
        while (num < char1.length()) {
            if ((char1.charAt(num) + "").equalsIgnoreCase("a")) {
                countA++;
            } else if ((char1.charAt(num) + "").equalsIgnoreCase("e")) {
                countE++;
            } else if ((char1.charAt(num) + "").equalsIgnoreCase("i")) {
                countI++;
            } else if ((char1.charAt(num) + "").equalsIgnoreCase("o")) {
                countO++;
            } else if ((char1.charAt(num) + "").equalsIgnoreCase("u")) {
                countU++;
            }
            num++;
        }
       sentense = ("a = " + countA + "\n" + "e = " + countE + "\n" + "i = " + countI + "\n" + "o = " + countO + "\n" + "u = " + countU + "\n");
        return sentense;
    }

}
