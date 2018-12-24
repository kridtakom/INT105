/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OddNumException;

import java.util.Scanner;

/**
 *
 * @author Kridtakom
 */
public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter even number : ");
            int num = sc.nextInt();
            if(num%2==1){
                    throw new OddNumException("Invalid Input");
            }
            System.out.println("yep!!");
        }catch(OddNumException ex){
            System.out.println(ex);
        }finally{
            System.out.println("final");
        }
        System.out.println("end");
    }
   
}
