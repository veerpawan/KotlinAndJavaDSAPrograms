package codingninjas.recursion;

public class MultiplicationWithoutMultipl {

   /* public static int Multiply(int x, int y){




        return mul(x,y,0);
    }
    static int mul(int x, int y, int startIndex){

        if(y == startIndex){
            return 0;
        }else {

            int ans = 0;
           return ans + mul(x, y, startIndex + 1);
        }
    }*/

    public static int multiply(int x, int y){
        int[] array = new int[5];

        int sum = 0;

        for(int i = 0;i<array.length;i++){
            sum =sum+x;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(multiply(8,5));
    }
}
