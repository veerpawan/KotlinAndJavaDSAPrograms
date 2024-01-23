package codingblocks.patterns;

import java.util.Scanner;

public class Pattern_q_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nos = n - 1;
        int nst = 1;
        int a =8;
        //int res= (a++)++;

        int row = 1;
        int number = 1;

        while (row <= n) {

            int i = 1;
            while (i <= nos) {
                System.out.print(" " + "\t");
                i++;
            }

            int j = 1;
            while (j <= nst) {
                System.out.print(number + "\t");
                j++;
            }
            number++;
            nos--;
            nst = nst + 2;
            System.out.println();
            row++;
        }
    }
}
