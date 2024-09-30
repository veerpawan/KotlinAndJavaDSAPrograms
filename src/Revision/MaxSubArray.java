package Revision;

public class MaxSubArray {


    static int maxSubArray(int[] arr) {

        int current = arr[0];
        int max = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {

            if (current < 0) {
                current = 0;
            }
            current = current+arr[i];
            max = Math.max(max, current);
        }


        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-4, 8, 7, -5, 6, -20};
        System.out.println(maxSubArray(arr));
    }
}
