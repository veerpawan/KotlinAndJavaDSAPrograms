package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    static int[] findPairSum(int[] arr, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int remaining = sum - arr[i];
            if (map.containsKey(remaining)) {
               int[] arr1 = new int[2];
               arr1[0] = i;
               arr1[1] = map.get(remaining);
               return arr1;
            } else {
                map.put(arr[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 3, 7, 8};
        int pairSum = 14;
        System.out.println(Arrays.toString(findPairSum(arr, pairSum)));
    }
}
