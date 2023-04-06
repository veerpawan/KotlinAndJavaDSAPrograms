package arrays;

import java.util.Arrays;

//tow pointer i for arr1 and j for arr2
public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {3, 3, 4, 5, 6, 8, 9}, arr2 = {1, 4, 6, 8};
        merge(arr1, arr2);
    }

    static void merge(int[] arr1, int[] arr2) {
        int[] fArr = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                fArr[k++] = arr1[i++];
            } else {
                fArr[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            fArr[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            fArr[k++] = arr2[j++];
        }

        System.out.println(Arrays.toString(fArr));


    }


}
