package codingninjas.LinkedList;

public class LinkedListUse {


    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void increment(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            temp.data++;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node<Integer> n = new Node<Integer>(10);
        //System.out.println(n.data);
        //System.out.println(n.next);

        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);
        n.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node<Integer> head = n;
        //print(n2);
        //print(head);


        increment(n);
        print(n);

    }
}
