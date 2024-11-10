package codingninjas.recursion.easy;

public class Print1toN {

    static void printoneton(int n){
        if(n <=0){
            return;
        }
        printoneton(n-1);
        System.out.println(n);


    }
    public static void main(String[] args) {
        printoneton(156);
    }
}
