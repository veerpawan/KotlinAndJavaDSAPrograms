package codingblocks.forloop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;


        if (num <= 1) {
            System.out.println("not");
            return;
        }
        for (int i = 2; i <= num - 1; i++) {

            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count > 0) {
            System.out.println("not prime");
        } else {
            System.out.println("prime");


        }

    }
}
