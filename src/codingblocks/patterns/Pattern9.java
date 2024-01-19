package codingblocks.patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nos = n - 1;
        int nst = 1;
        int row = 1;
        while (row <= n) {
            int i = 1;
            while (i <= nos) {
                System.out.print(" ");
                i++;
            }

            int j = 1;
            while (j <= nst) {
                System.out.print("*");
                j++;
            }
            nos--;
            nst = nst + 2;
            System.out.println();
            row++;
        }
    }
}
