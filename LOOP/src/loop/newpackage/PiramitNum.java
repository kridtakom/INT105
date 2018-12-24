
package loop.newpackage;


public class PiramitNum {
    public static void main(String[] args) {
        int num;
 
        num = 7;
        Ans(num);
    }
    public static void Ans(int num) {
        
        for (int i = 0; i < num; i++) {
            for (int j = 1; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(("+") );
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print(("*") );
            }
            System.out.println("");
        }
    }

}
