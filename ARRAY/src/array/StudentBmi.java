package array;

public class StudentBmi {

    public static String[] bmiStudent(Student std[]) {
        String[] bmiStudent = new String[std.length];
        for (int i = 0; i < std.length; i++) {
            bmiStudent[i] = bmiCategory(std[i]);
        }
        return bmiStudent;
    }

    public static String bmiCategory(Student std) {
        String bmiCategory;
        double bmi;
        if (std.getWeight() < 0 || std.getHeight() < 0) {
            bmi = -1;
        } else if (std.getHeight() == 0) {
            bmi = -2;
        } else {
            bmi = std.getWeight() / Math.pow(std.getWeight(), 2);
        }
        if (bmi < 0) {
            bmiCategory = "none";
        } else if (bmi < 18.5) {
            bmiCategory = "under weight";
        } else if (bmi < 25) {
            bmiCategory = "normal weight";
        } else if (bmi < 30) {
            bmiCategory = "over weight";
        } else {
            bmiCategory = "obesity";
        }

        return bmiCategory;

    }
}
