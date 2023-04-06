package arrays;

import java.util.Arrays;

public class ReverseArrayTwoPointer {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 6, 7};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    static int[] reverseArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
