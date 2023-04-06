package arrays;

public class MaximumSubarray {


    public static void main(String[] args) {
        int[] arr= {3,5,6,7,-1,-2};

        System.out.println(maxSubArray(arr));
    }

    static int maxSubArray(int[] arr){
        int sum =0;
        int maxSum = Integer.MIN_VALUE;

        for(int i =0;i<arr.length;i++){
            sum = sum+arr[i];
            maxSum = Math.max(maxSum, sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
}
