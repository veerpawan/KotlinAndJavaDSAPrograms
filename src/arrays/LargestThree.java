package arrays;

public class LargestThree {

    public static void main(String[] args) {
        int[] arr = {4, 11, 9, 7, 6, 2};
        findThreeLargest(arr);
    }

    static void findThreeLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
                //second = arr[i];
                //third = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];

            } else if (arr[i] > third) {
                third = arr[i];
            }
        }
        System.out.println(first + "-> " + second + "->" + third);

    }
}
