package array.ArrayOOP;

public class Student {

    private String name;
    private int studentId;
    private double scores;
    private char grades;
    private static int counts;

    public Student() {
    }
    

    public Student(String name, double scores) {
        counts++;
        this.name = name;
        this.scores = scores;
        this.studentId = 600+counts;
        this.grades=setGrades();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    public char getGrades() {
        return grades;
    }

    public char setGrades() {
        char grade;
        if (scores >= 80) {
           grade = 'A';
        } else if (scores >= 70) {
           grade = 'B';
        } else if (scores >= 60) {
            grade = 'C';
        } else if (scores >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public static int getCounts() {
        return counts;
    }

    public static void setCounts(int counts) {
        Student.counts = counts;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "ID : "+studentId+" | "+"Name : "+name+" | "+"Score : "+scores+" | "+"Grade : "+grades;
    }
    

}
