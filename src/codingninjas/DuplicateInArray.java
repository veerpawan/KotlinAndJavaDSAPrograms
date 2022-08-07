package codingninjas;

public class DuplicateInArray {

    public static int duplicateArr(int arr[]){

        int num=0;

        for(int i =0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){
                   num=arr[i];
                }
            }

        }
        return num;

    }

    public static void main(String[] args) {
        int arr[] ={0, 3, 1, 5, 4, 3, 2};
        System.out.println(duplicateArr(arr));
    }
}
