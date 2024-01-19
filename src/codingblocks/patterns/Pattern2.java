package codingblocks.patterns;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int starToPrint = sc.nextInt();
        int row=1;

        while(row<=3){

           int j=1;
            while(j<=starToPrint){
                System.out.print("*");
                j++;
            }
            System.out.println();
            row++;
        }
    }
}
