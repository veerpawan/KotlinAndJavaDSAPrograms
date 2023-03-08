package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReverseCharacterOfString {
    public static void reverseWords(String input){
        String[] arr = input.split(" ");

        String rewersewordFinal= "";
        for(String split: arr){
            System.out.println(split);
            // StringBuilder s = new StringBuilder(split);
            char[] wordArray = split.toCharArray();
            String reverseWord = "";
            for(int i = wordArray.length-1;i>= 0; i--){
                reverseWord =reverseWord+wordArray[i];
            }
            rewersewordFinal = rewersewordFinal+reverseWord+" ";
        }
        System.out.println(rewersewordFinal);
    }

    public static void main(String args[]) {
        //I evol ym yrtnuoc
        String input = "I love my country";
        reverseWords(input);
    }

    public static class CheckPAlindoromoe {


        static boolean checkPalindoromoe(String name){

            String original= name;

            char[] nameChar =name.toCharArray();
            int length=name.length();

            String reverse="";


            for(int i=length-1;i>=0;i--){

                reverse =reverse+name.charAt(i);
                System.out.println(reverse);


            }
            if(reverse.equals(original))
                return true;
            else

          return false;
        }


        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string");
            String name =sc.next();

           System.out.println(checkPalindoromoe(name));
            //System.out.print(name);

        }
    }

    public static class CountDuplicateNumber {

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
}