package string;

public class LeftRepettingChar {

    static String checkRepete(){

        String name = "geeksforgeek";

        for(int i=0; i<name.length();i++){

            for(int j=i+1;j<name.length();j++){
                if(name.charAt(i)==name.charAt(j)){
                    return name.charAt(i)+"";
                }
            }
        }
        return "null";
    }

    public static void main(String[] args){

        System.out.println(checkRepete()+"");
    }
}
