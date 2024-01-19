package codingblocks.patterns;

import java.util.Scanner;

public class Pattern1 {


    /*-observer first row
      -work for first row
      -preparation for next row*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;

        while (i < num) {
            System.out.print("*");
            i++;
        }
    }
}
