package codingninjas.recursion;

public class RemoveDuplicateChar {


    static String removeConsecutiveDuplicates(String s){

        if(s.length() == 0){
            return s;
        }

        for(int i = 0; i<=s.length();i++){
            if(s.charAt(i) == s.charAt(i+1)){

                s.replace(s.charAt(i)+"","");
            }
        }


       /* if(s.charAt(0) == s.charAt(1)){
            return removeConsecutiveDuplicates(s.substring(1));
        }else{
            return s.charAt(0)+removeConsecutiveDuplicates(s.substring(1));
        }*/
return s;
    }

    public static void main(String[] args) {
        String s ="xxxyyyzwwzzz";
        System.out.println(removeConsecutiveDuplicates(s));
        //System.out.println(s.substring(1));
    }
}
