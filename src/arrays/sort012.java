package arrays;

import java.util.Arrays;

public class sort012 {

    // Three Way Partitioning function
    public static void sort_3way(int[] A, int n)
    {
        // Declaring 3 pointers
        int low = 0;
        int mid = 0;
        int high = n - 1;

        // Traverse array till completely sorted
        while (mid <= high)
        {
            // If the element is 0
            if (A[mid] == 0)
            {
               // swap(A, low, mid);

                int temp = A[low];
                A[low] = A[mid];
                A[mid] = temp;
                low++;
                mid++;
            }

            // If the element is 1
            else if (A[mid] == 1)
            {
                mid++;
            }

            // If the element is 0
            else {
                //swap(A, mid, high);
                int temp = A[mid];
                A[mid] = A[high];
                A[high] = temp;
                high--;
            }
        }
    }

    // Swapping function
    private static void swap(int[] A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main (String[] args)
    {
        int arr[] = {0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0};
        int n = arr.length;

        // Calling the function
        sort_3way(arr, n);

        // Printing the sorted array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}