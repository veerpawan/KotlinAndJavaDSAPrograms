package codingninjas.recursion;

public class NumberOfDigits {

    static int numberDigits(int number) {

        if (number < 10) {
            return 1;
        }
        return 1 + numberDigits(number / 10);
    }


    public static void main(String[] args) {

        int number = 9143543;

        System.out.println(numberDigits(number));

    }
}
