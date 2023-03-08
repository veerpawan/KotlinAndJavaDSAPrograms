package arrays;

public class ArraySum {
    public static void main(String[] args){

        int[] values={1,2,3,4,5,6,7,8,9};

        int length = values.length;

        int sum=0;

        for(int i=0;i<length;i++){
            sum = sum +values[i];
        }
        System.out.println(""+sum);

    }
}
