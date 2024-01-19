package codingblocks.patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nor = sc.nextInt();
        int row = 1;
        int n_o_d = nor - 1;
        int n_o_s = 1;
        while (row <= nor) {
            int i = 1;
            while (i <= n_o_d) {
                System.out.print("_");
                i++;
            }
            int j = 1;
            while (j <= n_o_s) {
                System.out.print("*");
                j++;
            }
            //preparation for next row
            n_o_d--;
            n_o_s++;
            System.out.println();
            row++;
        }
    }
}
