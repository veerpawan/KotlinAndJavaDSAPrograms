package arrays;

import java.util.Arrays;

public class NonRepeatingElements {

    static int[] printNonRepeating(int[] arr){

        int[] newArr = new int[arr.length];
        int index = 0;
        for(int i =0;i<arr.length;i++){
            int flag = 0;
            for(int j =i;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j){
                flag = 1;
                break;
                }
            }
            if(flag ==0){
                newArr[index] =arr[i];
                index++;
            }

        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = {-1,2,-1,3,2};
        System.out.println(Arrays.toString(printNonRepeating(arr)));
    }
}
