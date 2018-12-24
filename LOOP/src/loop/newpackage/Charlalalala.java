
package loop.newpackage;

import java.util.Scanner;


public class Charlalalala {
    public static void main(String[] args) {
        String sentence;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter sentence : ");
        
        sentence = sc.nextLine();
        while( !sentence.equals("0")){
        
        int x =countSen(sentence);
        System.out.println(Ans(x));
        System.out.print("Enter sentence : ");
        
        sentence = sc.nextLine();
        }
        System.out.println("END");
    }
    public static int countSen(String sentence){

        int countUp=0 ;
        
        for(int i=0;i<=sentence.length()-1;i++){
            char charlala = sentence.charAt(i);
            if((charlala>='A')&&(charlala<='Z')){
                countUp++;
        }
          
      }
        return countUp;
    }
    public static String Ans (int x){
        String ans = ""; int count=0;
        do{
        ans = "Character Up = "+ x ;
        count++;
        }while(count<1);
    return ans ;
    }
}
 

