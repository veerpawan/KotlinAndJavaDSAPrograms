package string;

public class Palindorome_efficient {
    static boolean checkPalindorome() {
        String name = "n";

        int begin = 0;
        int end = name.length() - 1;
        while (begin < end) {

            if (name.charAt(begin) != name.charAt(end)) {
                return false;
            } else {
                begin++;
                end--;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        // theta n in the worst case and theta 1 in the best case
        System.out.println(checkPalindorome());

    }

}
