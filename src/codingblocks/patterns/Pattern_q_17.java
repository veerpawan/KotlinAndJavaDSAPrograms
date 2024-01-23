package codingblocks.patterns;

import java.util.Scanner;

public class Pattern_q_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int nst = (n - 1) / 2;
        int nos = 1;
        while (row <= n) {
            int i = 1;
            //print left start
            while (i <= nst) {
                System.out.print("*" + " ");
                i++;
            }
            //print space
            int j = 1;
            while (j <= nos) {
                System.out.print(" " + " ");
                j++;
            }

            //print right star
            int k = 1;
            while (k <= nst) {
                System.out.print("*" + " ");
                k++;
            }
            //preparation for next row
            if (row < (n + 1) / 2) {
                nos = nos + 2;
                nst--;
            } else {
                nos = nos - 2;
                nst++;
            }
            System.out.println();
            row++;
        }
    }
}
