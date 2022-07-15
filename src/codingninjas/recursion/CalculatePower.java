package codingninjas.recursion;

public class CalculatePower {

    static int power(int x, int y){

        if(y == 0){
            return 1;
        }


        int smallest = power(x, y-1);

        return x*smallest;


    }



    public static void main(String[] args){

        System.out.println(power(3,4));
    }
}
