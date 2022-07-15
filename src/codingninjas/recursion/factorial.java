package codingninjas.recursion;

public class factorial {


    static int fact(int n){

        if(n == 0){
            return 1;
        }

        int smallest = fact(n-1);
        return n*smallest;
    }


    public static void main(String[] args){

        int n=5;
        int ans= fact(n);
        System.out.println(ans);

    }

}
