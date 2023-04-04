package codingninjas.recursion.easy;

public class productOfDigit {

    public static void main(String[] args) {
        System.out.println(printProduct(1344567));
    }
    static int printProduct(int num){
        if(num%10==num){
            return num;
        }
        return (num%10)*printProduct(num/10);
    }
}
