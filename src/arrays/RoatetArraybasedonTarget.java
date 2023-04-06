package arrays;

import java.util.Arrays;

public class RoatetArraybasedonTarget {

    static void rotate(int[] arr, int target){

        int start = 0 ;
        int last = arr.length-1;

        int[] arr1 = new int[arr.length];

        for(int i = 0;i< arr.length;i++){

                if (arr[i] < target) {
                    arr1[start] = arr[i];
                    start++;
                } else if (arr[i] > target) {
                    arr1[last] = arr[i];
                    last--;
                }
        }
        System.out.println(Arrays.toString(arr1));

    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 45, 69, 32, 67, 10, 20, 56};
        int target = 55;
        rotate(arr, target);

    }

}
