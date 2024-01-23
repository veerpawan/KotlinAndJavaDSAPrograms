package codingblocks.patterns;

import java.util.Scanner;

public class Pattern_q_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;

        int nst = 1;
        int nos = 2*n-3;

        while (row <= n) {


            int i=1;
            while(i<=nst){
                System.out.print("*"+" ");
                i++;
            }

            int j =1;
            while(j<=nos){
                System.out.print(" "+" ");
                j++;
            }

            int k =1;
            if(row==n){
                k=2;
            }
            while(k<=nst){
                System.out.print("*"+" ");
                k++;
            }
            nst++;
            nos = nos-2;
            System.out.println();
            row++;
        }
    }
}
