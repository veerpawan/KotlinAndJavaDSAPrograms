package arrays;

import java.util.HashSet;
import java.util.Set;

public class TowPointerDuplicate {



   // Remove Duplicates from Sorted Array
    // 0,1,0,1,1,1,2,3,3

    static int removeDuplicate(int[] arr){

        int k =1;

        for(int i =1;i<arr.length;i++){

            if(arr[i-1]!=arr[i]){
                arr[k] = arr[i];
                k++;
            }

        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr ={0,0,1,1,2,2,2,3,3,4,4,5};
        Set<Integer> set = new HashSet<>();

        for(Integer val: arr){
            set.add(val);
        }
        System.out.println(set.toString());
        System.out.println(set.size());
        System.out.println(removeDuplicate(arr));
    }
}
