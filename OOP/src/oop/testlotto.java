
package oop;
import java.util.*;
public class testlotto {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int ran1,ran2,ran3,ran4,ran5,ran6;
        String text;
        ran1=(int)(Math.random()*10);
        ran2=(int)(Math.random()*10);
        ran3=(int)(Math.random()*10);
        ran4=(int)(Math.random()*10);
        ran5=(int)(Math.random()*10);
        ran6=(int)(Math.random()*10);
        String sum = ""+ran1+ran2+ran3+ran4+ran5+ran6;
        System.out.println(sum);
       
        System.out.print("Enter lotto : ");
        text=sc.next();
        
        while(!text.equals("0") ){
            if(text.length()==6){
                
                System.out.println( meaasge(text,sum) );
                System.out.print("Enter lotto : ");
                text=sc.next();
            }else{
                System.out.println("No!!!!");
                break;
            }
            
        }System.out.println("end");
        
        
    }
    public static String meaasge (String text , String sum){
        String ans="";
        if(text.equals(sum)){
            ans="reward1";
        }else if (text.substring(3).equals(sum.substring(3))){
            ans="reward2";
        }else if (text.substring(4).equals(sum.substring(4))){
            ans="reward3";
        }else{
            ans="no reward";
        }
        return ans;
    }
    
}
