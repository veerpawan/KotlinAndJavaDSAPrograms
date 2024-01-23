package codingblocks.patterns;

import java.util.Scanner;

public class Pattern_q_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nos = n - 1;
        int nst = 1;

        int row = 1;

        int row_val=1;
        while (row <= n) {

            int i = 1;
            while (i <= nos) {
                System.out.print(" " + "\t");
                i++;
            }

            int j = 1;
            int col_val = row_val;
            while (j <= nst) {
                System.out.print(col_val + "\t");
                col_val++;
                j++;
            }
            nos--;
            nst = nst + 2;
            System.out.println();
            row++;
        }
    }
}
