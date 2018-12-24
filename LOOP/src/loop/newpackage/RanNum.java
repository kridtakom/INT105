
package loop.newpackage;


public class RanNum {
    public static void main(String[] args) {
        int temp;
        int n1 = (int)(Math.random()*(10));
        int n2 = (int)(Math.random()*(10));
        int n3 = (int)(Math.random()*(10));
        while(n1==n2 || n1==n3 || n2==n3){
         n1 = (int)(Math.random()*(10));
         n2 = (int)(Math.random()*(10));
         n3 = (int)(Math.random()*(10));
        
        }
        System.out.println(""+n1+n2+n3);
        
        if(n1>n2){
            
            temp = n1;
            n1=n2;
            n2 = temp;
        }else if (n2>n3){
            temp = n2;
            n2=n3;
            n3 = temp;
        }else if(n1>n3){
            temp = n1;
            n1=n3;
            n3 = temp;
        }
        System.out.println(""+n1+n2+n3);
    }
    
}
