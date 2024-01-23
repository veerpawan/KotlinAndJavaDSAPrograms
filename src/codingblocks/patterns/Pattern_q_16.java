package codingblocks.patterns;

import java.util.Scanner;

public class Pattern_q_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nos = 4;
        int nst = n;
        while (row <= 2 * n - 1) {


            int i = 1;
            while (i <= nos) {
                System.out.print(" " + " ");
                i++;
            }

            int j = 1;
            while (j <= nst) {
                System.out.print("*" + " ");
                j++;
            }
            if (row < n) {
                nos--;
                nst--;
            } else {
                nos++;
                nst++;
            }

            System.out.println();
            row++;
        }

    }
}
