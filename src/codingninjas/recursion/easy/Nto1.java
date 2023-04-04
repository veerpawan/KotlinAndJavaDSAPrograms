package codingninjas.recursion.easy;

public class Nto1 {
    public static void main(String[] args) {
        funBoth(5);
    }

    static void fun(int num) {
        if (num <= 0) {
            return;
        }
        System.out.println(num);
        fun(num - 1);
    }

    static void funBoth(int num) {

        if (num == 0) {
            return;
        }
        System.out.println(num);
        funBoth(num - 1);
        System.out.println(num);

    }
}
