package array;

public class NewClass {

    public static void main(String[] args) {

        char[] stdAnswer = {'A', 'B', 'C'};
        char[] solAnswer = {'B', 'B', 'C', 'A', 'B'};;
        System.out.println(examChecking(stdAnswer, solAnswer));
    }

    public static int examChecking(char[] stdAnswer, char[] solAnswer) {

        int ans = 0;

        if (stdAnswer.length == solAnswer.length) {

            for (int i = 0; i < solAnswer.length; i++) {
                if (solAnswer[i] == stdAnswer[i]) {
                    ans = ans+2;
                }else if(solAnswer[i] != stdAnswer[i]){
                    ans--;
                }

            }
        } else  {
            for (int stdAns = 0; stdAns < stdAnswer.length; stdAns++) {
                if (solAnswer[stdAns] == stdAnswer[stdAns]) {
                    ans = ans+2;
                }else if(solAnswer[stdAns] != stdAnswer[stdAns]){
                    ans--;
                }
            }
            for (int x = stdAnswer.length  ; x<solAnswer.length ; x++){
                if(solAnswer.length != stdAnswer.length ){
                    ans--;
                }
            }

        }
        return ans;
    }
}
