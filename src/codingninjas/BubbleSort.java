package codingninjas;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length ; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 4, 0, 1, 2, 11, 1,0,0};
        bubbleSort(arr);
    }
}
