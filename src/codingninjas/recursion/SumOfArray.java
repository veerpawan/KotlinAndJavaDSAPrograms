package codingninjas.recursion;

public class SumOfArray {

    static int sum(int[] array){

        int calculateSum = 0;

        for(int i=0;i<array.length;i++){

            calculateSum = calculateSum+array[i];

        }
        return calculateSum;

    }

    static int sumRecursively(int[] array1){
        return sumiterate(array1, 0);

    }

    static int sumiterate(int[] input, int startIndex){
       if(startIndex == input.length){
           return 0;
       }
       int ans =  input[startIndex]+sumiterate(input, startIndex+1);
       return ans;
    }

    public static void main(String[] args) {

        int arr[]= {5,4,3,1,1,1};
        //System.out.println(sum(arr));
        System.out.println(sumRecursively(arr));
    }
}
