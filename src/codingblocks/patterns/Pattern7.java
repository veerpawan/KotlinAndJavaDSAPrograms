package codingblocks.patterns;

import java.util.Scanner;

public class Pattern7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nor = sc.nextInt();
        int row = 1;
        int n_o_space = nor - 1;
        int n_o_s = 1;
        while (row <= nor) {
            int i = 1;
            while (i <= n_o_space) {
                System.out.print(" ");
                i++;
            }
            int j = 1;
            while (j <= n_o_s) {
                System.out.print("*");
                j++;
            }
            //preparation for next row
            n_o_space--;
            n_o_s++;
            System.out.println();
            row++;
        }
    }
}
