package searching;

public class FloorValue {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9};
        int target = 7;
        System.out.println(findLargest(arr, target));

    }

    //find largest element but smaller then target
    static int findLargest(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;

            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return end;
    }
}
