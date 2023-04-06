package arrays;

public class SmallestInArray {

    public static void smallesElement(int[] arr){

        int smallest = arr[0];
        int secondSmalles = arr[0];
        for(int i = 0;i< arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }

        }
        System.out.println(smallest);

        for(int i = 0;i<arr.length;i++){
            if( secondSmalles>arr[i] && smallest<arr[i]){
                secondSmalles = arr[i];
            }
        }
        System.out.println(secondSmalles);
    }
    public static void main(String[] args) {
        int[] arr= {55,47,3,68,78};
        smallesElement(arr);
    }
}
