package SelfRound3;

public class TestStudent {

    public static void main(String[] args) {
        Student[] std = new Student[4];
        std[0] = new Student("Andrew", 50.0);
        std[1] = new Student("Brad", 70.0);
        std[2] = new Student("Cristiano", 30.0);
        std[3] = new Student("Eric", 80.0);
        
        Student[] ans =scoreOfStd(std) ;
        for (int i = 0; i < ans.length; i++) {
            if (i == 0) {
                System.out.println("MAX = "+ans[i]);
            }else{
                System.out.println("Min = "+ans[i]);
            }
        }
    }
    public static Student [] scoreOfStd (Student [] std){
//        String[] ans = null;
//        ans[0] = std[0].toString();
//        ans[1] = std[0].toString();
          Student[] ans = new Student[2];
          ans[0]=std[0];
          ans[1]=std[0];
        for (int i = 0; i < std.length; i++) {
            if(std[i].getScore()>ans[0].getScore()){
                ans[0] = std[i];
            }else if(std[i].getScore()< ans[1].getScore()){
                ans[1] = std[i];
            }
        }
        return ans;
    
    }  
}
