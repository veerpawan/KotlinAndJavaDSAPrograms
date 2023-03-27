package string;

import java.util.Arrays;

public class DetectCapital {

    public static boolean detectCapitalUse(String word) {

        boolean isPass = false;
        char[] ch = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            ch[i] = word.charAt(i);
        }

        for(int i = 1;i<ch.length;i++){
            if(Character.isUpperCase(ch[0]) && Character.isUpperCase(ch[i] )){
                isPass = true;
            }

            if(!Character.isUpperCase(ch[0]) && !Character.isUpperCase(ch[i] )){
                isPass = true;
            }
            if(Character.isUpperCase(ch[0]) && !Character.isUpperCase(ch[i]) ){
                isPass = true;
            }else{
                isPass = false;
            }

        }

        return isPass;


    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("FlaG"));

    }
}
