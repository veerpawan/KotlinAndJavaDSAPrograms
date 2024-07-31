package codingblocks.Array;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 6, 7 };
        System.out.println(arr[0] + " " + arr[1]);
        Swap(arr, 0, 1);
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static void Swap(int[] arrr, int i, int j) {
        int temp = arrr[i];
        arrr[i] = arrr[j];
        arrr[j] = temp;

    }

}
