import java.sql.Array;
import java.util.ArrayList;

public class FibonacciSeries {


    static void series(int n) {
        ArrayList values = new ArrayList();

        int a = 0, b = 1, c = 1;

        for (int i = 0; i <= n; i++) {
            //System.out.print(a + ", ");
            values.add(a);
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }


        for(int i=0;i<=5;i++){

            System.out.println(values.get(i));

        }

    }

    public static void main(String[] args) {
        int n = 11;

        series(n);
    }

}
