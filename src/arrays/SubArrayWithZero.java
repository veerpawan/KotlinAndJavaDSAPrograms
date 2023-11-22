package arrays;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZero {
    public static void main(String[] args) {
        int[] arr = {4, 6, 9, 1, -1, 5, 6};
        //findSubArray(arr);
        findSubArrayBest(arr);
    }



    static void findSubArrayBest(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            
            if (set.contains(sum)) {
                System.out.println(true);
                return;
            } else {
                set.add(sum);
            }
        }
        System.out.println(false);
    }

    static void findSubArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 0) {
                    System.out.println("Index" + i + "  " + j);
                }
            }
        }
    }

}
