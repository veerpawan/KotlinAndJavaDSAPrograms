package codingninjas.recursion;

public class RemoveCharFromString {


    public static String remove(String value){


        if(value.length() == 0){
            return value;
        }

        String ans= "";
        if(value.charAt(0)!='r'){
            ans = ans+value.charAt(0);

        }

        String smallestAns =  remove(value.substring(1));

        return ans+smallestAns;

    }


    public static void main(String[] args) {
        String value= "rfsrrrr";
        System.out.println(remove(value));
    }
}
