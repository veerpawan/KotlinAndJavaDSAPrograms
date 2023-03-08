package string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReverseWordsString {

    static void reverseWords() {

        String name = "welcome to coding";
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {

        reverseWords();
    }

    public static class CountDplicateChrcters {

        public static void main(String[] args){
            String s= "pppaaawwnwnwnn";
            Map<Character, Integer> hm=new HashMap<Character, Integer>();

            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(hm.containsKey(ch)){
                    hm.put(ch,hm.get(ch)+1);
                }else{
                    hm.put(ch,1);
                }

            }
            System.out.println(hm);


            // using iterators
            Iterator<Map.Entry<Character, Integer>> itr = hm.entrySet().iterator();

            while(itr.hasNext())
            {
                Map.Entry<Character, Integer> entry = itr.next();
                System.out.println("Key = " + entry.getKey() +
                        ", Value = " + entry.getValue());
            }
        }
    }
}
