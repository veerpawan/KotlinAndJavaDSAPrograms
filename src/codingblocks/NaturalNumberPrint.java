package codingblocks;

import java.util.Scanner;

public class NaturalNumberPrint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int printNum = 1;

        while (printNum <= number) {
            System.out.println(printNum);
            printNum++;
        }
    }
}
