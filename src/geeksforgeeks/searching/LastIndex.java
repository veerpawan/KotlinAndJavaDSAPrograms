package geeksforgeeks.searching;

public class LastIndex {

    public static void lastElement(int[] arr, int num){

       int lastIndex =0;
        for(int i = 0;i< arr.length;i++){

            if(arr[i] == num){
                lastIndex = i;
                break;
            }
        }
        System.out.println(lastIndex);

    }

    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 10};
        lastElement(arr, 10);
    }
}
