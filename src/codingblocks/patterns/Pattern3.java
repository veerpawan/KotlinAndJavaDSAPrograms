package codingblocks.patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n;
        int rows = 1;
        while (rows <= n) {
            int i = 1;
            while (i <= nst) {
                System.out.print("*");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
