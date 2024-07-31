package codingblocks.L10;

public class PalindromeNumber {

    public static void main(String[] args) {
        int number = -6578;
        int rev = 0;
        int rem = 0;

        while (number != 0) {
            rem = number % 10;

            rev = rev * 10 + rem;

            number = number / 10;
        }
        System.out.println(rev);
    }
}
