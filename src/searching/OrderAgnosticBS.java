package searching;

public class OrderAgnosticBS {
    public static int binarySearch(int[] arr, int num) {
        int low = 0, high = arr.length - 1;

        //find weather array is sorted in ascending or descending order
        boolean isAsc = (arr[0]<arr[arr.length - 1]);

        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (arr[mid] == num) {
                return mid;
            }
            if(isAsc){
                if (arr[mid] > num) {
                    high = mid - 1;
                } else if (arr[mid] < num) {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] > num) {
                    low = mid + 1;
                } else if (arr[mid] < num) {

                    high = mid - 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {60, 50, 40,30,20,10};
        System.out.println(binarySearch(arr, 10));
    }
}
