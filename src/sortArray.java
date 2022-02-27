public class sortArray {

    static void sortArray(int[] arr) {
        int size = arr.length;


        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++)    //length is the property of the array
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {

        int[] arr = {48, 7, 5, 75, 35, 4, 50};
        sortArray(arr);
    }
}
