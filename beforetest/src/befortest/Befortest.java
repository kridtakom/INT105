/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package befortest;

/**
 *
 * @author Kridtakom
 */
public class Befortest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] a = new int[4];
        int[] sum = new int[a.length];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            count++;
            a[i] += count;
            System.out.print(a[i] + " ");

        }

        System.out.println("\n");

        for (int i = 0; i < a.length; i++) {
            sum[i] = a[i] + a[i];
            System.out.print(sum[i] + " ");
        }

        System.out.println("");

        int[] num3 = {10, 20, 30, 40};
        int[] num4 = {2, 4};
        int[] sum1 = new int[num3.length];

        if (num3.length > num4.length) {
            for (int i = 0; i < num4.length; i++) {
                sum1[i] = num3[i] + num4[i];

            }
            for (int i = 2; i < num3.length; i++) {
                sum1[i] = num3[i];
            }
        } else if (num3.length == num4.length) {
            for (int i = 0; i < num4.length; i++) {
                sum1[i] = num3.length + num4.length;
            }
        } else {
            for (int i = 0; i < num3.length; i++) {
                sum1[i] = num3[i] + num4[i];

            }
            for (int i = 2; i < num4.length; i++) {
                sum1[i] = num4[i];
            }
        }
        System.out.println("");
        for (int x : sum1) {
            System.out.print(x + " ");
        }

    }

}
