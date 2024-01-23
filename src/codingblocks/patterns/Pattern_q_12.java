package codingblocks.patterns;

import java.util.Scanner;

public class Pattern_q_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int nos = n - 1;
        int nst = 1;
        while (row <= n) {
            int i = 1;
            while (i <= nos) {
                System.out.print(" ");
                i++;
            }
            int j = 1;
            while (j <= nst) {
                if (j % 2 == 0) {
                    System.out.print("!");
                } else {
                    System.out.print("*");
                }
                j++;
            }
            nst = nst + 2;
            nos--;
            System.out.println();
            row++;
        }
    }
}
