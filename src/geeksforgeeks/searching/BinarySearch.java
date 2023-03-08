package geeksforgeeks.searching;

public class BinarySearch {

    public static int binarySearch(int[] arr, int num) {

        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low+high)/2;
            if(arr[mid] == num){
                return mid;
            } else if(arr[mid]> num){
                high = mid-1;
            } else if(arr[mid]<num){
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println(binarySearch(arr, 20));
    }
}
