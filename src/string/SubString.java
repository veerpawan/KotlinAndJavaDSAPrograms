package string;

public class SubString {

    static boolean checkSubsequence() {

        String s1 = "ABCDEF";
        String s2 = "ABD";

        int j = 0;

        for (int i = 0; i < s1.length() && j < s2.length(); i++) {
            if (s1.charAt(i) == s2.charAt(j))
                j++;
        }


        return j == s2.length();
    }

    public static void main(String[] args) {
        System.out.println(checkSubsequence());
    }

}
