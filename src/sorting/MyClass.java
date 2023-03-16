package sorting;

import java.util.Arrays;

public class MyClass {


    static int[] sortNum(int[] arr, int target){

        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            if(arr[high]>target){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                high--;
                low++;
            }else if(arr[high]<target){
                high--;
            }
        }

        return arr;
    }
    public static void main(String args[]) {
        int[] arr = {4, 5, 1, 45, 69, 32, 67, 10, 20, 56};
        int target = 20;
        System.out.println(Arrays.toString(sortNum(arr, target)));
    }
}