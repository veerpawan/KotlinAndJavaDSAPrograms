public class SumOfNaturalNubers {

    public static int sum(int n){

        if(n==1){
            return 1;
        }

        return n+sum(n-1);

    }

    public static void main(String[] args){

        int n=6;
        System.out.println(sum(n));

    }
}
