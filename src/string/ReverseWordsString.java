package string;

public class ReverseWordsString {

    static void reverseWords() {

        String name = "welcome to gfg";
        String reverse = "";
        for (int i = name.length() - 1; i > 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {

        reverseWords();
    }
}
