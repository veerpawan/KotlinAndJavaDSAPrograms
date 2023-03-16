package stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.print(s.pop()+"peek item ");

        for(Integer items: s){
            System.out.print(items+" ");
            System.out.println();

            System.out.println();
            System.out.print(items+" ");
        }
    }
}
