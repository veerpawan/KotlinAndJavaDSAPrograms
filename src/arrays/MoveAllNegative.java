package arrays;

import java.util.Arrays;

public class MoveAllNegative {

    public static void main(String[] args) {
        int[] arr = {-12, -13, -5, 6, -7, -9, 76, 87, -56, 89, -56, 55};


        //System.out.println(Arrays.toString(moveAllNegativeRight(arr)));
        System.out.println(Arrays.toString(moveAllNegativeLeft(arr)));
    }

    static int[] moveAllNegativeLeft(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[end] < 0 && arr[start] > 0) {
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start++;
                end--;
            } else if (arr[end] > 0) {
                end--;
            } else {
                start++;
            }
        }
        return arr;
    }

    static int[] moveAllNegativeRight(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] < 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                end--;
            } else {
                start++;
            }
        }
        return arr;
    }
}
