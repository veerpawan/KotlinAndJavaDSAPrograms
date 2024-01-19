package codingblocks.patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nor= sc.nextInt();
        int rows=1;
        int nst= 1;
        while(rows<=nor){
            int i=1;
            while(i<=nst){
                System.out.print("*");
                i++;
            }
            nst++;
            System.out.println();
            rows++;
        }
    }
}
