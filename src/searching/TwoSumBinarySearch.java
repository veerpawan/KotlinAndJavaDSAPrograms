package searching;

import java.util.Arrays;

public class TwoSumBinarySearch {
    static int[] finsSum(int[] arr, int num) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int result = arr[start] + arr[end];
            if (result == num) {
                return new int[]{start, end};
            } else if (result > num) {
                end--;

            } else {
                start++;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 9};
        int num = 7;
        System.out.println(Arrays.toString(finsSum(arr, num)));
    }
}
