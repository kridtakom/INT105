
package oop.PEN;


public class TESTPENN {
    public static void main(String[] args) {
        
    
    PENN pen1 = new PENN (1,"001","pentil");
    PENN pen2 = new PENN (2,"075","Wanpen",100);
    PENN pen3 = new PENN (3,"089","Duanpen",100);
    
    System.out.println(pen1.toString()+
                       "\n"+pen2.toString()+
                       "\n"+pen3.toString()+
                       "\n"+
                       "\n"+PENN.getNumOfPen()+"ครั้ง");
    
    
    }
}
