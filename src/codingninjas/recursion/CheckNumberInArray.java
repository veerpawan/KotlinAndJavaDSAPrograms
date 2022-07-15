package codingninjas.recursion;

public class CheckNumberInArray {

    static boolean isNumberPresent(int[] array, int n){

       return checkNum(array, n, 0);
    }

    static boolean checkNum(int[] array, int num, int startIndex){
        if(startIndex == array.length){
            return false;
        }

        if(num ==  array[startIndex]){
            return true;
        }else{
           return checkNum(array, num, startIndex+1);
        }

    }


    public static void main(String[] args) {
        int [] array ={4,5,3,2,1};

        System.out.println(isNumberPresent(array,11));
    }
}
