
package array;

import java.util.Scanner;

public class Array001 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        int firstArray , lastArray ;
        int [] num = new int [] {12,85,96,78,12};
//        System.out.print("{ ");
//        for(int number:num){
//            System.out.print(number + " , ");
//        }
//        System.out.print("\b\b");
//        System.out.print("} ");

        System.out.print("Start Array : ");
        firstArray=sc.nextInt();
       
        System.out.print("End Array : ");
        lastArray=sc.nextInt();
        sumOfArray(num,firstArray,lastArray);
        reverseArray(num);
        
        
    }
    public static void sumOfArray (int [] num,int firstArray,int lastArray){
        int sum = 0;
        for(int count = firstArray ; count<=lastArray ; count++){
            
            sum  = sum + num[count];
        }
        System.out.println("Ans = "+sum);
        
    }
    public static void reverseArray(int []num){
        int reverse = 0;
        for(int array = num.length-1 ; array >= 0; array-- ){
            System.out.print(num[array]+" "); 
        }
         for(int array = num.length-1 ; array >= 0; array-- ){
            reverse += num[array];
             
        }
         System.out.println("\n"+reverse);
    }
}
