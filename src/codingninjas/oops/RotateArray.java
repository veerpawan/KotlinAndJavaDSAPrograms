package codingninjas.oops;

import java.util.Arrays;

public class RotateArray {



    public static int[] rotateBy(int d, int input[]){


        int inputLength = input.length;



        return input;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int output[] = RotateArray.rotateBy(3, arr);
        System.out.println(Arrays.toString(output));
    }
}
