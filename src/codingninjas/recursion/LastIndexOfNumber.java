package codingninjas.recursion;

public class LastIndexOfNumber {
    public static int lastIndex(int[] input, int n) {
        return findLastIndex(input, n, input.length-1);
    }

    static int findLastIndex(int[] array, int num, int lastIndex){
        if(lastIndex == 0){
            return -1;
        }
        if(num == array[lastIndex]){
            return lastIndex;
        }else{
            return findLastIndex(array, num, lastIndex-1);
        }
    }

    public static void main(String[] args) {
        int array[] = {4,3,5,7,6,5,3,4};
        System.out.println(lastIndex(array,3));
        //System.out.println(array.length);
    }
}

