package arrays;

import java.util.Arrays;

public class RotateArray {

    static void rotate(int[] arr, int target){


        int idx = 0;
        //int[] newarr = new int[arr.length];
        for(int i =arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
            //arr[idx] = arr[i];
            //idx++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        int target = 3;
        rotate(arr, target);
    }
}
