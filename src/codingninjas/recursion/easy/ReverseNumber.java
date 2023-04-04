package codingninjas.recursion.easy;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(count(2403056));
    }


    static int count(int num){
        int count =0;
        return countZeros(num, count);
    }
    static int countZeros(int num, int count){


        if(num==0){
            return count;
        }
        if(num%10==0){
            count++;
            countZeros(num/10, count);
        }else{
            countZeros(num/10,count);
        }
        return count;
    }
}
