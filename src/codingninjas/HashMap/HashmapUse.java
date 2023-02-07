package codingninjas.HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashmapUse {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("abc", 1);
        map.put("def", 2);
        map.put("def", 2);
        map.put("ghi", 3);
        map.put("jkl", 4);
        map.put("mno", 5);

        Set<String> set = map.keySet();
        for(String s: set){
            System.out.println(s);
        }

        //check presets
        if(map.containsKey("def")){
            System.out.println("def available");
        }

        //this function is big o n because we perform operation on value not on key
        if(map.containsValue(4)){
            System.out.println("4 is vailable");
        }

        //remove value
        int value = map.remove("def");
        System.out.println(value);


        //iterate over map
        Set<String> keys = map.keySet();
        for(String str: keys){
            System.out.println(str);
        }
    }
}
