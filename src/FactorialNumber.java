public class FactorialNumber {


    static void factorial(int n) {
        int factorial = 1;
        while (n != 0) {
            factorial = factorial * n;
            n--;
        }
        System.out.println(factorial);
    }

    static int factorialbyLoop(int n) {
        int fact = 1;

        if (n == 0) {
            return 1;
        } else {
            return n * factorialbyLoop(n - 1);
        }


    }

    public static void main(String[] args) {
        int n = 10;
        factorial(n);
        //System.out.println(factorialbyLoop(n));

    }
}
