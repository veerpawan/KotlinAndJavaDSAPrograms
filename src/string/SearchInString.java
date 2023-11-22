package string;

public class SearchInString {

    public static void main(String[] args) {
        String name = "pawan";
        char target = 'w';
        System.out.println(findChar(name, target));

        for(char ch: name.toCharArray()){
            System.out.print(ch);
        }
    }

    public static boolean findChar(String value, char target){
        for(int i = 0;i<value.length();i++){
            if(value.charAt(i) == target){
                System.out.println(value.charAt(i));
                return true;
            }

        }
        return false;
    }
}
