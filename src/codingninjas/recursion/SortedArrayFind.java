package codingninjas.recursion;

public class SortedArrayFind {

    public static boolean checkSorted(int[] arr) {

        if (arr.length <= 1) {
            return true;
        }
        if (arr[0] > arr[1]) {
            return false;
        }
        int[] smallest = new int[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {
            smallest[i - 1] = arr[i];
        }
        boolean smallestAns = checkSorted(smallest);
        return smallestAns;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5, 6};
        System.out.println(checkSorted(arr));
    }
}
