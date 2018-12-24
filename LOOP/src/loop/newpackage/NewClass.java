
package loop.newpackage;

import java . util.Scanner;
public class NewClass {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int num ;
        System.out.print("Enter num : ");
        num = sc.nextInt();
        ans(num);
        
    }
    public static void ans (int num){
        String Ans = null;
        int devisible = 2 ;
        System.out.print("1x");
        while(num != 1){
            if(num%devisible==0){
                num = num/devisible;
                System.out.print(devisible + "x");
            }else{
                devisible++;
            }
            
        }
        System.out.println("\b");
        
        
    }

}
