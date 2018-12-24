
package SelfRound3;


public class Student {
    private static int count ;
    private String name;
    private int stdId ;
    private double score ;

    public Student() {
        this("unknow",0);
    }

    public Student(String name, double score) {
        count++;
        this.name = name;
        this.score = score;
        this.stdId= 600+count;
        
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    

    @Override
    public String toString(){
        
        return name+" "+"ID : " +stdId+" score : "+score;
    }
    
    
}
