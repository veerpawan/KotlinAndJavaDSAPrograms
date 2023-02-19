package codingninjas.LinkedList;

import java.util.LinkedList;

public class PreDefinedLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(50);
        list.addLast(90);
        System.out.println(list.size());

        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
