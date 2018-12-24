
package array;


public class SitSchool {
    private String name;
    private int studentId ;
    private double score;
    private char grades ;
    private static int counts;

    public SitSchool(String name, double score) {
        counts++;
        this.name = name;
        this.score = score;
        this.studentId = 600+counts;
        setGrades(score);
        
        
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public char getGrades() {
        return grades;
    }

    private void setGrades(double score) {
        if(score>=80){
            this.grades = 'A';
        }else if(score>=70){
            this.grades = 'B';
        }else if(score>=60){
            this.grades = 'C';
        }else if(score>=50){
            this.grades = 'D';
        }else if(score<50){
            this.grades = 'F';
        }
    }

    public static int getCounts() {
        return counts;
    }

    public static void setCounts(int counts) {
        SitSchool.counts = counts;
    }

    @Override
    public String toString() {
        return "name : "+name+" id : "+studentId+" grade : "+grades;
    }
    
    
}
