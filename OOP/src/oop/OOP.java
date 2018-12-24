package oop;

import java.util.*;

public class OOP {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int choice = -1;

        Random lottoGen = new Random();
        int rewardLottoNo = lottoGen.nextInt(1000000) + 100000;
        System.out.println(rewardLottoNo);
        while (choice != 0) {

            System.out.print("Enter Lotto: ");

            choice = scan.nextInt();

            if (choice == 0) {
                System.out.println("End Program");
                continue;
            }

            String rewardLast3 = String.valueOf(rewardLottoNo).substring(3);

            String choiceLast3 = String.valueOf(choice).substring(3);

            String rewardLast2 = String.valueOf(rewardLottoNo).substring(4);

            String choiceLast2 = String.valueOf(choice).substring(4);

            System.out.println(message(rewardLast3, choiceLast3, rewardLast2, choiceLast2, choice, rewardLottoNo));
        }

    }

    public static String message(String rewardLast3, String choiceLast3, String rewardLast2, String choiceLast2, int choice, int rewardLottoNo) {
        String text = "";
        if (choice == rewardLottoNo) {
            text = "Reward 1";
        } else if (choiceLast3.equals(rewardLast3)) {
            text = "Reward 2";
        } else if (choiceLast2.equals(rewardLast2)) {
            text = "Reward 3";
        } else {
            text = "No Reward";
        }
        return text;
    }
}
