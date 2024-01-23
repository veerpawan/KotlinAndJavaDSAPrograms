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
            //print space
            while (i <= nos) {
                System.out.print(" ");
                i++;
            }

            //print stars
            int j = 1;
            while (j <= nst) {
                System.out.print("*");
                j++;
            }
            //prep for the next row
            nos--;
            nst = nst + 2;
            //go for the next row
            System.out.println();
            row++;
        }
    }
}
