package codingninjas.Queue;

public class QueueUse {
    public static void main(String[] args) {
        QueueUsingArray queueUsingArray = new QueueUsingArray();
        for(int i=1;i<=5;i++){
            try {
                queueUsingArray.enqueue(i);
            } catch (QueueFullException e) {
                e.printStackTrace();
            }
        }

        while (!queueUsingArray.isEmpty()){
            try {
                System.out.println(queueUsingArray.dequeue());
            } catch (QueueEmptyException e) {
                e.printStackTrace();
            }
        }
    }
}
