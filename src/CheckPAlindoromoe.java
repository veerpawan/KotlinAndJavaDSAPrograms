import java.util.Scanner;

public class CheckPAlindoromoe {


    static boolean checkPalindoromoe(String name){

        String original= name;

        char[] nameChar =name.toCharArray();
        int length=name.length();

        String reverse="";


        for(int i=length-1;i>=0;i--){

            reverse =reverse+name.charAt(i);
            System.out.println(reverse);


        }
        if(reverse.equals(original))
            return true;
        else

      return false;
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String name =sc.next();

       System.out.println(checkPalindoromoe(name));
        //System.out.print(name);

    }
}

