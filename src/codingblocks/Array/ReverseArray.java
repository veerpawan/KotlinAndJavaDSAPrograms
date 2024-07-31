package codingblocks.Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9};

        revesre(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void revesre(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
