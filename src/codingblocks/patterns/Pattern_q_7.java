package codingblocks.patterns;

import java.util.Scanner;

public class Pattern_q_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int nst = 9;
        int nos = 0;
        while (row <= nst) {

            int i = 1;
            while (i <= nst) {
                System.out.print("*");
                i++;
            }
            int j = 1;
            while (j <= nos && j==n) {
                System.out.print(" ");
                j++;
            }
            nos++;
            nst = nst - 2;
            System.out.println();
            row++;
        }
    }
}
