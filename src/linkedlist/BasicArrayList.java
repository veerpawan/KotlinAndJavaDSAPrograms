package linkedlist;

import java.util.ArrayList;

public class BasicArrayList {


    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        al.set(1, 100);


        for(int i =0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        System.out.println();

        for(int element: al){
            System.out.println(element);
        }
    }
}
