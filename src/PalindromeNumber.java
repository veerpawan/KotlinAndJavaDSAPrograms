public class PalindromeNumber {

    static boolean isPalindorormoe(int n){

        int reverse =0;
        int original = n;

        while(n!=0){
            int reminder = n%10;
            reverse = reverse*10+reminder;
            n=n/10;
        }
        if(reverse == original){
            return true;
        }


        return false;
    }



    public static void main(String[] args) {

        //time complaixity is thita d
        int number = 5665;

        System.out.println(isPalindorormoe(number));

    }
}
