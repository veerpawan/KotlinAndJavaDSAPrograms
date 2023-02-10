package string;

import java.util.Arrays;

public class CheckAnagram {
    public static boolean isAnagram(char[] s1, char[] s2) {
        if (s1.length != s2.length) {
            return false;
        }

        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != s2[i]) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        String s1 = "pawan";
        String s2 = "awnpp";

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(isAnagram(c1, c2));
    }
}
