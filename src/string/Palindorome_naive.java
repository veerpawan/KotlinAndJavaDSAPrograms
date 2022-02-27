package string;

public class Palindorome_naive {

    static boolean isPalindorome(){
        String name = "naman";

        StringBuilder sc =new StringBuilder(name);
        sc.reverse();
        if(name.equals(sc.toString())){
            return  true;
        }


       return false;
    }

    public static void main(String[] args){

        System.out.println(isPalindorome());
    }
}
