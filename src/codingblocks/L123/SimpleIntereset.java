package codingblocks.L123;

import java.util.Scanner;

public class SimpleIntereset {



    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Principle amount");
        int p=sc.nextInt();
        System.out.println("Enter rate");
        int r= sc.nextInt();
        System.out.println("Enter tenure");
        int t=sc.nextInt();
        int calculateInterest =(p*r*t)/100;
        System.out.println(calculateInterest);
    }
}
