package codingninjas.Arrays;

public class FindMissingNumber {

    public static void findMissingNumber(int[] arr){

        int n = arr.length+1;

        int totalNum = n*(n+1)/2;

        int sumOfAllNumbers=0;
        for(int i = 0;i<arr.length;i++){
            sumOfAllNumbers = sumOfAllNumbers+arr[i];
        }
        System.out.println(totalNum- sumOfAllNumbers+"missing number +" );

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9};
        findMissingNumber(arr);
    }
}
