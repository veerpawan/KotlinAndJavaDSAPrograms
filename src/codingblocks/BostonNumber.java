package codingblocks;

import java.util.Scanner;

public class BostonNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isBostom(num));

    }

    public static int isBostom(int num){
        int digit = sumOfDigit(num);
        int pf = 0;
        int div = 2;
        while (div <= num) {
            int rem = num % div;
            if (rem == 0) {
                pf = pf + sumOfDigit(div);
                num = num / div;
            } else {
                div++;
            }

        }
        if (pf == digit) {
            return 1;
        } else {
            return 0;
        }
    }

    static int sumOfDigit(int n) {

        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }

        return sum;
    }
}
