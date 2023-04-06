package arrays;

import java.sql.Array;

public class ReverseArray {

    public static void reverse(int[] arr){

        int [] reverseArrayResult = new int[arr.length];

        for(int i =arr.length-1; i>=0; i--){
            reverseArrayResult[i] = arr[i];
            System.out.println(reverseArrayResult[i]);

        }
        /*for(int i = 0;i<reverseArrayResult.length;i++){
            System.out.println(reverseArrayResult[i]);
        }*/
    }

    public static void main(String[] args) {
        int[] array ={5,6,8,7,3,4,8,6};
        reverse(array);
    }
}
