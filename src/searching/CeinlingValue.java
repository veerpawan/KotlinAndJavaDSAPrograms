package searching;

public class CeinlingValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 39, 45};
        int target = 8;
        System.out.println(findCelingValue(arr, target));
    }

    //return the index: smalles number>=target
    static int findCelingValue(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if(arr[mid]>target) {
                end = mid - 1;
            }
        }
        return start;
    }
}
