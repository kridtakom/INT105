package array;

public class MyArray {

    public static void main(String[] args) {
        int[] score = {100, 30, 20, 60, 80};
        int[] ans = findMinMax( score);
        for(int ANS : ans){
            System.out.println(ANS);
        }
    }

    public static int[] findMinMax(int[] score) {
        int[] score2 = {score[0], score[0]};
        for (int i = 0; i < score.length; i++) {
            if (score[i] > 100 || score[i] < 0) {
                return null;
            }else if (score[i] < score2[0]) {
                score2[0] = score[i];
            }else if (score[i] > score2[1]) {
                score2[1] = score[i];
            }
        }
        return score2;
    }
}
