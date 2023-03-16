package arrays;

public class TowPointerDuplicate {

    //0,1,0,1,1,1,2,3,3

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
        System.out.println(removeDuplicate(arr));
    }
}
