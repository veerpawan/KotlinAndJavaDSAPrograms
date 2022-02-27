import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountDuplicateNumber {

    public static void main(String[] args) {
        printCountOfDuplicateCharacterUsingHashMap("bbbcccccddddddaaaa");
        printCountOfDuplicateCharacterUsingHashMap("##^$!%^$!^%@!$^@!kds");

    }

    // Using hashmap : print count of each character in a given string.
    private static void printCountOfDuplicateCharacterUsingHashMap(String input) {
        Map<Character, Integer> output = new HashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if(output.containsKey(ch)){

                output.put(ch, output.get(ch)+1);

            }else{

                output.put(ch, 1);
            }

        }

        System.out.println(output);

    }
}
