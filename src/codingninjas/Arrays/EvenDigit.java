package codingninjas.Arrays;

//find even number of digit in whole array and count the numbers occurance
public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {34, 456, 4567, 786, 5768,4567};
        System.out.println(findNumEvenDigit(nums));

    }

    static int findNumEvenDigit(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = checkNumber(arr[i]);
            if(num%2==0){
                count++;
            }

        }
        return count;
    }
    static int checkNumber(int number){
        int count=0;
        while(number!=0){
            number = number/10;
            count++;
        }
        return count;
    }
}
