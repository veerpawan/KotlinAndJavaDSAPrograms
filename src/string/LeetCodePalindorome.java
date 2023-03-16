package string;

public class LeetCodePalindorome {

        public static boolean isPalindrome(String str) {
            String s = str.replaceAll("[-+.^:,]","").replaceAll(" ","").toLowerCase();

            int low = 0;
            int high = s.length() - 1;

            while (low < high) {
                if (s.charAt(low) != s.charAt(high) ){
                    return false;
                } else {
                    low++;
                    high--;
                }
            }
            return true;

        }

    public static void main(String[] args) {
        //System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("ab@a"));
    }
}
