public class numberCount {

    static void getCount(int num) {

        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int number = 123456;
        getCount(number);

    }

}
