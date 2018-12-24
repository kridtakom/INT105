package array;

public class TestSitStudent {

    public static void main(String[] args) {
        SitStudent[] std = new SitStudent[2];
        std[0] = new SitStudent(60130500001L, "joy");
        std[1] = new SitStudent(60130500004L, "boom");
            
            for(int i = 0 ; i< std.length;i++){
            
                System.out.println( i +" -:- "+std[i].toString());
               
            }
    }

}
