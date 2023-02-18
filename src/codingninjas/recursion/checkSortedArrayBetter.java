package codingninjas.recursion;

public class checkSortedArrayBetter {

    public static boolean checkSortedArray(int[] arr, int startIndex){
        if(startIndex == arr.length-1){
            return true;
        }
        if(arr[startIndex]>arr[startIndex+1]){
            return false;
        }

        boolean smallAns = checkSortedArray(arr, startIndex+1);
        return smallAns;
    }

    public static boolean checkSortedArray(int[] arr){

        return checkSortedArray(arr, 0);

    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,8,9};
        System.out.println(checkSortedArray(arr));
    }
}
