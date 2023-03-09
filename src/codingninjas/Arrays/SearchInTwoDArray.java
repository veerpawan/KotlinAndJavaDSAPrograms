package codingninjas.Arrays;

import java.util.Arrays;

public class SearchInTwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{23,1,2}, {45,6,4,5}, {4,5,7,9}, {5,87,45,4}, {3,5,0,7}};
        int target = 45;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr, int target){
        for(int row = 0;row< arr.length;row++){

            for(int col = 0;col<arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1, -1};
    }

}
