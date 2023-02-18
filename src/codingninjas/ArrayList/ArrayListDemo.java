package codingninjas.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(12);
        list.add(13);
        list.add(6);
        list.add(8);
        for(int i = 0;i<list.size();i++){
            //System.out.print(list.get(i)+" ");
        }
        list.remove(1);
        list.set(1,100);
        for(int i = 0;i<list.size();i++){
            //System.out.print(list.get(i)+" ");
        }

        for(int ele: list){
            System.out.print(ele+" ");
        }

    }
}
