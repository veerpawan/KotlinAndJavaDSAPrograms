package arrays;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,1};
        int k =9;
        k = k%arr.length;
        roateteArray(arr, k);
    }
    static void roateteArray(int[] arr, int k){

        roateteInternal(arr, 0, arr.length-1);
        roateteInternal(arr, 0 ,k-1);
        roateteInternal(arr, k+1, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    static void roateteInternal(int[] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
