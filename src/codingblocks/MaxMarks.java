package codingblocks;

import java.util.Scanner;

public class MaxMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks > 90) {
            System.out.println("E");
        } else if (marks <= 90 && marks > 80) {
            System.out.println("A+");
        } else if (marks <= 80 && marks > 70) {
            System.out.println("A");
        } else if (marks <= 70 && marks > 50) {
            System.out.println("P");
        } else {
            System.out.println("fail");
        }
    }
}
