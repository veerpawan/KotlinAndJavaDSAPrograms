package codingblocks.L123;

import java.util.Scanner;

public class SumOfNNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int naturalNum = sc.nextInt();
        int sum = 0;
        int num = 1;


        while (num <= naturalNum) {
            sum = sum + num;
            num++;
        }
        System.out.println(sum);

        /*for (int i = 0; i <= naturalNum; i++) {
            sum = sum + i;
        }
        System.out.println(sum);*/
    }
}
