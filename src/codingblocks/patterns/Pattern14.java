package codingblocks.patterns;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int nst = 1;
        int nsp=n-1;

        while (row <= 2 * n - 1) {
            int i = 1;
            while (i <=nsp) {
                System.out.print(" ");
                i++;
            }
            int j = 1;
            while (j <= nst) {
                System.out.print("*");
                j++;
            }
//preparation for the mirror row
            if (row < n) {
                nst++;
                nsp--;
            } else {
                nst--;
                nsp++;
            }
            System.out.println();
            row++;
        }
    }
}
