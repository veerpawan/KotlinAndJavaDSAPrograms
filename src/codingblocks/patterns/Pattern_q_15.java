package codingblocks.patterns;

import java.util.Scanner;

public class Pattern_q_15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nor = s.nextInt();

        int row = 1;
        int nst = 5;
        int nos = 0;
        while (row <= 2 * nor - 1) {
            int j = 1;
            while (j <= nos) {
                System.out.print(" " + " ");
                j++;
            }


            int i = 1;
            while (i <= nst) {
                System.out.print("*" + " ");
                i++;
            }
            if (row < nor) {
                nst--;
                nos = nos + 2;
            } else {
                nst++;
                nos = nos - 2;
            }
            System.out.println();
            row++;
        }
    }
}
