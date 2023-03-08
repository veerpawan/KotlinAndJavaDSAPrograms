package arrays;

import java.util.Arrays;

public class MaxInArray {

    static void checkMaxArray(int[] arr){

        int max=0;
        
        Arrays.sort(arr);
                System.out.println(arr[arr.length-2]);


        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        System.out.println(arr[max]);


    }
    public static void main(String[] args){

    int[] arr ={2,5,6,7,-8};
        checkMaxArray(arr);
    }
}
