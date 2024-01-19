package codingblocks.patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nor = sc.nextInt();
        int row = 1;
        int n_o_s = 0; //number of space
        int n_s_t = nor;//number of stars
        while (row <= nor) {
            int i = 1;
            while (i <= n_o_s) {
                System.out.print("-");
                i++;
            }

            int j = 1;
            while (j <= n_s_t) {
                System.out.print("*");
                j++;
            }
            n_o_s = n_o_s + 2;
            n_s_t = n_s_t - 1;
            System.out.println();
            row++;

        }
    }
}
