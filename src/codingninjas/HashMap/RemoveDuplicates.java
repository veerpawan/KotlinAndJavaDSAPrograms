package codingninjas.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {

    public static void removeDuplicate(int arr[]){

        ArrayList<Integer> result = new ArrayList<>();

        HashMap<Integer, Boolean>  map = new HashMap<>();


        for(int i= 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                continue;
            } else{
                result.add(arr[i]);
                map.put(arr[i], true);
            }
        }

        for(Integer s: result){
            System.out.println(s);
        }

    }

    public static void main(String[] args) {
        int arr[] ={4,4,6,45,45,4,6,9,7,9};
        removeDuplicate(arr);
    }
}
