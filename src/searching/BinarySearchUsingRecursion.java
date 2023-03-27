package searching;

public class BinarySearchUsingRecursion {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 9};
        int target = 4;
        int ans = findElement(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

    static int findElement(int[] arr, int target, int low, int high) {

        if (low > high) {
            return -1;
        }
        int mid = (low+high) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return findElement(arr, target, mid + 1, high);
        } else {
            return findElement(arr, target, low, mid - 1);
        }
    }
}
