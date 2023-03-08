package geeksforgeeks;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        for(Integer value : set){
            System.out.println(value);
        }
        if(set.contains(10)){
            System.out.println("set contain 10");
        }
        set.remove(10);
        System.out.println(set.size());
        System.out.println(set);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
