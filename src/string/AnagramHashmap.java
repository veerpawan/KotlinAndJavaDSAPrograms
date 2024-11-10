package string;

import java.util.HashMap;
import java.util.Map;

public class AnagramHashmap {

    public static boolean areAnagram(String s1, String s2){

        if(s1.length()!=s2.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch:s1.toCharArray()){

            map.put(ch, (map.getOrDefault(ch,0)+1));
        }
        for(char ch:s2.toCharArray()){
            if(!map.containsKey(ch));
            {
                return false;
            }
            //map.put(ch, map.get(ch) - 1);
        }

        return true;

    }
    public static void main(String[] args) {
        String str1 = "abaac";
        String str2 = "aacba";
        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }
}
