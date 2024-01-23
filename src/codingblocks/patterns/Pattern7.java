package codingblocks.patterns;

import java.util.Scanner;

public class Pattern7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nor = sc.nextInt();
        int row = 1;
        int nos = 0;

        while (row <= nor) {

            int j = 1;
            while (j <= nor) {
                if (row == 1 || row == nor) {
                    System.out.print("*" + " ");

                } else {
                    if (j == 1) {
                        System.out.print("*" + " ");
                    } else if (j == nor) {
                        System.out.print("*" + " ");
                    } else {
                        System.out.print(" " + " ");
                    }
                }
                j++;
            }
            System.out.println();
            row++;
        }

    }
}

