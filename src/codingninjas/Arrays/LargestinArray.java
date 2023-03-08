package codingninjas.Arrays;

public class LargestinArray {

    public static void largest(int[] arr){

        int max =0;
        int secondLargest = 0;
        for(int i =0;i< arr.length;i++){

            if(arr[i]> max){
                max= arr[i];
            }
        }

        for(int i =0;i< arr.length;i++){

            if(arr[i]>secondLargest && arr[i]<max){
                secondLargest= arr[i];
            }
        }


        System.out.println(secondLargest);

    }

    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 10};
        largest(arr);
    }
}
