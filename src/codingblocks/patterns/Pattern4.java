package codingblocks.patterns;

import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// number of rows need to print
        int nst = n; //number of star in rowth
        int rows = 1;
        while (rows <= n) {
            //work
            //print the stars
            int i = 1;
            while (i <= nst) {
                System.out.print("*");
                i++;
            }
            //preparation for next row
            nst= nst-1;
            System.out.println();
            rows++;

        }
    }
}
