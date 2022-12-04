package codingninjas.stack;

public class StackUse {

    public static void main(String[] args) throws StackFullException {

        StackUsingArray stack = new StackUsingArray();
        for(int i=0;i<=5;i++){
            stack.push(i);
        }


        while(!stack.isEmpty()){
            try {
                System.out.println(stack.pop());
            } catch (StackEmptyException e) {
                //never reach here
            }
        }


    }
}
