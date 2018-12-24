package oop;

import java.util.*;

public class NewClass {

    public static void main(String[] args) {
        String text;
        Scanner sc = new Scanner(System.in);
        System.out.print("ใส่ประโยค : ");
        text = sc.nextLine();
        System.out.println(message(text));
    }

    public static String message(String text) {
        String ans = "";
        text = text.toLowerCase();
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int count = 0; count < text.length(); count++) {
            
            char ch = text.charAt(count);
            switch (ch) {
                case 'a': {
                    a++;
                    break;
                }
                case 'e': {
                    e++;
                    break;
                }
                case 'i': {
                    i++;
                    break;
                }
                case 'o': {
                    o++;
                    break;
                }
                case 'u': {
                    u++;
                    break;
                }

            }
        }
        ans = "" + "a " + a + "\ne " + e + "\ni " + i + "\no " + o + "\nu " + u;
        return ans;
    }
}
