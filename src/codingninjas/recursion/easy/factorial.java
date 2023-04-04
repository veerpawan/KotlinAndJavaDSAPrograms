package codingninjas.recursion.easy;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(sum(5));
    }
    static int fact(int num){

        if(num==1){
            return 1;
        }
        return num*fact(num-1);
    }
    static int sum(int num){
        if(num==1){
            return 1;
        }
        return num+sum(num-1);

    }
}
