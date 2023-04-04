package codingninjas.recursion.easy;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumofdigits(12345));

    }

    static int sumofdigits(int num) {

        if(num==0){
            return 0;
        }



        return (num%10)+sumofdigits(num/10);
        //sum = sum + rem;


    }
}
