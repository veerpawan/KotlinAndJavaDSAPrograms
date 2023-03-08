package arrays;

import java.util.ArrayList;

public class ArrayListExample {
    static void printArray() {
        ArrayList<String> name = new ArrayList();
        name.add("pawan");
        name.add("sourabh");
        System.out.println(name.toString());

    }

    static void findIndexOfArray() {

        int[] values = {5, 4, 9, 6, 7};

        for(int i= 0;i<values.length;i++) {

            if (values[i] == 6) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {

        //printArray();
        findIndexOfArray();

    }
}
