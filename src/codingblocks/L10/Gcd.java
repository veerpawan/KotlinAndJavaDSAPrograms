package codingblocks.L10;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor = 60;
        int dividend = 36;
        while (dividend % divisor != 0) {
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        System.out.println(divisor);
    }
}
