package sorting;


//time complexity worst case 0(n^2) and avg case (nlogn)
//merge sort time complexity in worst case is (nlogn) and avg case if also (nlogn)
// worst case occurs when pivot is th largest or smallest element

import java.util.Arrays;

//pivot and partition technique used
//pivot is a central point where everything roam around
// mostly used last element as pivot
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 6, 5, 7};
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(arr));

        int size = arr.length;

        // call quicksort() on array data
        quickSort(arr, 0, size - 1);

        System.out.println("Sorted Array in Ascending Order ");
        System.out.println(Arrays.toString(arr));
    }

    // method to find the partition position
    static int partition(int array[], int low, int high) {

        // choose the rightmost element as pivot
        int pivot = array[high];

        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;

                // swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        // swapt the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the position from where partition is done
        return (i + 1);
    }

    static void quickSort(int array[], int low, int high) {
        if (low < high) {

            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition(array, low, high);

            // recursive call on the left of pivot
            quickSort(array, low, pi - 1);

            // recursive call on the right of pivot
            quickSort(array, pi + 1, high);
        }
    }
}

