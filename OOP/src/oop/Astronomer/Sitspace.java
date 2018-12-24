
package oop.Astronomer;

import java.util.Scanner;

public class Sitspace {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String name ;
        long id ;
        int heigh;
        double weight1,weight2,weight3;
        String nationallity;
        String lostplanet1,lostplanet2,lostplanet3;
        int func;
        String pla; 
        
        System.out.println("Astromer 1");
        System.out.print("Name : ");
        name = sc.next();
        System.out.print("ID : ");
        id=sc.nextLong();
        System.out.print("Height : ");
        heigh = sc.nextInt();
        System.out.print("Weight : ");
        weight1 = sc.nextDouble();
        System.out.print("Nationallity : ");
        nationallity = sc.next();
        System.out.print("Planet (1-Mecury,2-Venus.3-Jupiter,4-Saturn) : ");
        lostplanet1 = sc.next();
        Astronomer a1 = new Astronomer (name,id,heigh,weight1,nationallity,lostplanet1);
        System.out.println("------------------------------------------------------------------------");
        
        
        System.out.println("Astromer 2");
        System.out.print("Name : ");
        name = sc.next();
        System.out.print("ID : ");
        id=sc.nextLong();
        System.out.print("Height : ");
        heigh = sc.nextInt();
        System.out.print("Weight : ");
        weight2 = sc.nextDouble();
        System.out.print("Nationallity : ");
        nationallity = sc.next();
        System.out.print("Planet (1-Mecury,2-Venus.3-Jupiter,4-Saturn) : ");
        lostplanet2 = sc.next();
        Astronomer a2 = new Astronomer (name,id,heigh,weight2,nationallity,lostplanet2);
        System.out.println("------------------------------------------------------------------------");
    
    
        System.out.println("Astromer 3");
        System.out.print("Name : ");
        name = sc.next();
        System.out.print("ID : ");
        id=sc.nextLong();
        System.out.print("Height : ");
        heigh = sc.nextInt();
        System.out.print("Weight : ");
        weight3 = sc.nextDouble();
        System.out.print("Nationallity : ");
        nationallity = sc.next();
        System.out.print("Planet (1-Mecury,2-Venus.3-Jupiter,4-Saturn) : ");
        lostplanet3 = sc.next();
        Astronomer a3 = new Astronomer (name,id,heigh,weight3,nationallity,lostplanet3);
        System.out.println("------------------------------------------------------------------------");
    
//      
//        System.out.println("Astromer 4");
//        System.out.print("Name : ");
//        name = sc.next();
//        System.out.print("ID : ");
//        id=sc.nextLong();
//        System.out.print("Height : ");
//        heigh = sc.nextInt();
//        System.out.print("Weight : ");
//        weight = sc.nextDouble();
//        System.out.print("Nationallity : ");
//        nationallity = sc.next();
//        System.out.print("Planet (1-Mecury,2-Venus.3-Jupiter,4-Saturn) : ");
//        lostplanet = sc.next();
//        Astronomer a4 = new Astronomer (name,id,heigh,weight,nationallity,lostplanet);
//        System.out.println("------------------------------------------------------------------------");
//    
//        
//        System.out.println("Astromer 5");
//        System.out.print("Name : ");
//        name = sc.next();
//        System.out.print("ID : ");
//        id=sc.nextLong();
//        System.out.print("Height : ");
//        heigh = sc.nextInt();
//        System.out.print("Weight : ");
//        weight = sc.nextDouble();
//        System.out.print("Nationallity : ");
//        nationallity = sc.next();
//        System.out.print("Planet (1-Mecury,2-Venus.3-Jupiter,4-Saturn) : ");
//        lostplanet = sc.next();
//        Astronomer a5 = new Astronomer (name,id,heigh,weight,nationallity,lostplanet);
//        System.out.println("------------------------------------------------------------------------");  
    
        System.out.println("Welcome to SITSPACE \n"
                + "Press1 - number of astronmers \n"
                + "Press2 - number of THSI people \n"
                + "Press3 - number of astronomers in each planets \n"
                + "press0 - EXIT and get all information");
        System.out.println("");
        System.out.print("Enter function : ");
        func = sc.nextInt();
        while(func != 0){
            if(func == 1){
                System.out.println("number of astronmers : "+Astronomer.getCount() );
                System.out.print("Enter function : ");
                func = sc.nextInt();
            }else if (func == 2 ){
                System.out.println("number of THSI people : "+Astronomer.getCountThai());
                System.out.print("Enter function : ");
                func = sc.nextInt();
            }else if (func == 3){
                System.out.print("Choose Planet (m,v,j,s) :");
                pla=sc.next();
                if(pla.equalsIgnoreCase("m")){
                    System.out.println("number of astronomers in Mercury : "+Astronomer.getM());
                }else if(pla.equalsIgnoreCase("v")){
                    System.out.println("number of astronomers in Venus : "+Astronomer.getV());
                }else if(pla.equalsIgnoreCase("j")){
                    System.out.println("number of astronomers in Jupiter : "+Astronomer.getJ());
                } else if(pla.equalsIgnoreCase("S")){
                    System.out.println("number of astronomers in Saturn : "+Astronomer.getS());
                }
                System.out.print("Enter function : ");
                func = sc.nextInt();
            }
        }
        
        System.out.println(a1+a1.weightConverter(lostplanet1, weight1));
        System.out.println(a2+a2.weightConverter(lostplanet2, weight2));
        System.out.println(a3+a3.weightConverter(lostplanet3, weight3));
//        System.out.println(a4+a4.weightConverter(lostplanet, weight));
//        System.out.println(a5+a5.weightConverter(lostplanet, weight));

    
    
    
    }
}
