package codingninjas.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaximumFrequencyNumber {

    public static void checkFrequency(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }


        int max = 0; int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){

            if(max< entry.getValue()){
                result = entry.getKey();
                max = entry.getValue();
            }
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        int arr[] = {2, 12, 12, 11, 12, 2, 1, 2, 12, 11, 12, 12, 6};
        checkFrequency(arr);
    }
}
