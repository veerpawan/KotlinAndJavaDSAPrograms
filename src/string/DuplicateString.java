package string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

    public static void reultArr(String[] arr) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                //map.put(arr[i], 1);
            } else {
                map.put(arr[i], i + 1);

            }

        }

        for (Map.Entry<String,Integer> entry : map.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }

    public static void main(String[] args) {
        String[] arr = {"test", "test1", "test", "test1", "test2", "iy"};
        reultArr(arr);
    }
}
