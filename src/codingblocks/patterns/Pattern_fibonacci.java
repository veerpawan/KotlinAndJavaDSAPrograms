package codingblocks.patterns;

import java.util.Scanner;

public class Pattern_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        int number=0;

        while (row <= n) {
            int i = 0;
            while (i < nst) {
                System.out.print(number + " ");
                i++;
            }
            nst++;
            number++;
            System.out.println();
            row++;
        }
    }
}
