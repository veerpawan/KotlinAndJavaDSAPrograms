package stack;

import java.util.Stack;


class main{
    public static void main(String[] args) {


    }
}

public class QueueUsingStack {
    Stack<Integer> first;
    Stack<Integer> second;
    public QueueUsingStack(){
        first = new Stack<>();
        second = new Stack<>();

    }
    public void push(int item){
        first.push(item);
    }
}
