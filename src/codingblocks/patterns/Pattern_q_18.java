package codingblocks.patterns;

import java.util.Scanner;

public class Pattern_q_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int nos = 3;
        int nst = 1;

        while (row <= n) {

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
            if (row > n / 2) {
                nos++;
                nst = nst - 2;
            } else {
                nos--;
                nst = nst + 2;
            }

            System.out.println();
            row++;
        }
    }
}
