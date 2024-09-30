package Revision;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static int[] checkSum(int[] arr, int sum) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = sum - arr[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};

            }
            map.put(arr[i],i );
        }


        return null;
    }


    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 6, 4};
        int sum = 10;
        checkSum(arr, sum);
    }
}



