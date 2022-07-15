package codingninjas.recursion;

public class FirstIndexInNumber {

    public static int firstIndex(int[] input, int n) {


      return findFirstIndex(input, n, 0);

       /* if(n>input.length-1){
            return -1;
        }
        if(input[n]==n) { // current index is the first index that contains x
            return n;
        } else { // make a recursive call to find the first index of x in the rest of the array
            return firstIndex(input,n+1);
        }*/
    }

    static int findFirstIndex(int[] array, int num, int startIndex){


        if(startIndex == array.length){
            return -1;
        }



        if(num == array[startIndex]){
            return startIndex;
        }else{
           return findFirstIndex(array, num, startIndex+1);
        }
    }



    public static void main(String[] args) {
        int array[] = {4,3,5,7,6,5,3,4};
        System.out.println(firstIndex(array,11));
    }
}
