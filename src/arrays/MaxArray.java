package arrays;

public class MaxArray {

    public static int findMax(int arr[]) {
        int size = arr.length;


        int temp=0;
        int max=0;
        for (int i = 0; i < size; i++) {


            if(arr[i]>max){
                max = arr[i];
            }

          /*  for (int j = i + 1; j < size; j++) {



              *//*  if(arr[i]>arr[j]){

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }*//*
            }*/
        }


        //return arr[arr.length - 1];
        return max;
    }


    public static int secondLarge(int arr[]) {
        int size = arr.length;


       int temp=0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {

                if(arr[i]>arr[j]){

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }


        return arr[arr.length - 2];
    }


    public static void main(String[] args) {
        int arr[] = {5, 4, 6, 90, 156, 34};
        System.out.println(findMax(arr));
        System.out.println(secondLarge(arr));
    }
}
