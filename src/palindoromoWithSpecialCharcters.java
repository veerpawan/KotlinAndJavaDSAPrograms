import java.util.Locale;

public class palindoromoWithSpecialCharcters {


    static boolean checkPalindrome(String name) {

        String specialCharRemove = name.replaceAll(":", "");
        String specialCharRemove1 = specialCharRemove.replaceAll(",", "");

        System.out.println(specialCharRemove1);
        System.out.println(specialCharRemove1.length());

        String reverse = "";
        String original = specialCharRemove1.toLowerCase(Locale.ROOT);
        int length = specialCharRemove1.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + specialCharRemove1.charAt(i);
        }
        if (reverse.equalsIgnoreCase(original))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        String s = "I am :IronnorI Ma, i";
        //String s = "Na man:";

        if (checkPalindrome(s)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
