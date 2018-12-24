package oop.Blog;

import java.util.*;

public class TestBlog {

    public static void main(String[] args) {
        
        int numfunc;
        
        Scanner sc = new Scanner (System.in);
        
        Blog p1 = new Blog ();
        System.out.print("Author name : ");
        p1.setName(sc.next());
        System.out.print("Can visible (yes/no) : ");
        p1.setVisible(sc.next());
        System.out.print("Topic : ");
        p1.setTopic(sc.nextLine());
        sc.nextLine();
        System.out.print("Content : ");
        p1.setContent(sc.nextLine());
      
        System.out.println("-------------------------------------------------------------------------");
        
        Blog p2 = new Blog ();
        System.out.print("Author name : ");
        p2.setName(sc.next());
        System.out.print("Can visible (yes/no) : ");
        p2.setVisible(sc.next());
        System.out.print("Topic : ");
        p2.setTopic(sc.nextLine());
        sc.nextLine();
        System.out.print("Content : ");
        p2.setContent(sc.nextLine());
      
        System.out.println("-------------------------------------------------------------------------");
        
        Blog p3 = new Blog ();
        System.out.print("Author name : ");
        p3.setName(sc.next());
        System.out.print("Can visible (yes/no) : ");
        p3.setVisible(sc.next());
        System.out.print("Topic : ");
        p3.setTopic(sc.nextLine());
        sc.nextLine();
        System.out.print("Content : ");
        p3.setContent(sc.nextLine());
  
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("");
        
        
        System.out.println("+++++ summary info +++++\n"
                            + "press 1 - number of blog\n"
                            + "press 2 - number of number visible blog\n"
                            + "press 3 - number of number visible blog\n"
                            + "press 0 - Exit \n");
        
        System.out.print("Enter function : ");
        numfunc = sc.nextInt();
        while(numfunc != 0){
            if(numfunc == 1){
                System.out.println("Number of blog : "+Blog.getCount()+" blog"+"\n");
                System.out.print("Enter function : ");
                numfunc = sc.nextInt();
            }else if (numfunc == 2){
                System.out.println("number of number visible blog : "+Blog.getNumvisible()+" blog"+"\n" );
                System.out.print("Enter function : ");
                numfunc = sc.nextInt();
            }else if (numfunc == 3){
                System.out.println("number of number invisible blog : "+Blog.getNuminvisible()+" blog"+"\n" );   
                System.out.print("Enter function : ");
                numfunc = sc.nextInt();
            }else{
                System.out.println("ERROR"+"\n" );
                System.out.print("Enter function : ");
                numfunc = sc.nextInt();
            }    
            
        } 
        System.out.println("END");
        
        
        
    }

}
