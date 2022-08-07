package codingninjas.recursion;

public class ReplaceStringChar {

    public static String replaceCharacter(String input, char c1, char c2){

        if(input.length() == 0){
            return input;
        }
        String ans= "";
        if(input.charAt(0)==c1)
            return c2+replaceCharacter(input.substring(1),c1,c2);
        else
            return input.charAt(0)+replaceCharacter(input.substring(1),c1,c2);

    }

    public static void main(String[] args) {
        String value = "gjskeyghgk";
        System.out.println(replaceCharacter(value, 'k', 't'));
    }
}
