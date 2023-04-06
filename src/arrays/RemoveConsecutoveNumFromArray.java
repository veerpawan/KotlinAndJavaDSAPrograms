package arrays;

import java.util.ArrayList;

public class RemoveConsecutoveNumFromArray {

    public static ArrayList<Integer> checkConseDup(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]){
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 20, 20, 30, 40, 10};
        ArrayList<Integer> result = checkConseDup(arr);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
