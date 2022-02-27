package string;

import java.util.Arrays;

public class AnagramString {


   static boolean checkAnagram(char[] str1, char[] str2){

       int n1= str1.length;
       int n2 =str2.length;

       Arrays.sort(str1);
       Arrays.sort(str2);
       //System.out.println(str1);
       //System.out.println(str2);

       for(int i= 0; i<n1 ;i++){

           if(str1[i] != str2[i]){
               return  false;
           }

       }
       return true;
    }


    public static void main(String[] args){

        String s1= "pawan";
        String s2 = "apwan";

        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        if(checkAnagram(str1,str2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
