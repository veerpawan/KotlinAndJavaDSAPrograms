package searching;

import java.util.Arrays;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] arr= {5,7,7,8,8,10};
        int target =8;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

        public static int[] searchRange(int[] nums, int target) {

            if(nums.length == 0 ){
                return new int[]{-1,-1};
            }
            if(nums.length == 1){
                return new int[]{-1, -1};
            }

            int[] arr = new int[2];

            int low = 0;
            int high = nums.length-1;
            while(low<high){

                int mid = low+(high-low)/2;
                if(nums[mid] == target){
                    if(nums[mid] == nums[mid-1] && nums[mid]!=nums[mid+1]){
                        arr[0] = mid-1;
                        arr[1] = mid;
                        return arr;

                    }
                    else if(nums[mid]== nums[mid+1] && nums[mid]!=nums[mid-1]){
                        arr[0] = mid;
                        arr[1] = mid+1;
                        return arr;
                    }
                }

                if(nums[mid]>target){
                    high = mid-1;
                }else if(nums[mid]<target){
                    low = mid+1;
                }
            }
            return new int[]{-1,-1};

        }

}
