package arrays;

import java.util.Arrays;

public class sort012 {

    static int[] sortNumber(int[] arr){

        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {2,1,0,2,0,1,2};
        System.out.println(Arrays.toString(sortNumber(arr)));
    }
}
