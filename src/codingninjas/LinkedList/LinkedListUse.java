package codingninjas.LinkedList;

import java.util.Scanner;

public class LinkedListUse {


    public static void print(Node<Integer> head) {
        //Node<Integer> temp = head;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node<Integer> takeInput() {
        Node<Integer> head = null;

        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
            } else {
                Node<Integer> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            data = s.nextInt();
            //newNode.next = null;
        }
        return head;


    }

    public static void increment(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            temp.data++;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node<Integer> head = takeInput();
        print(head);

        //Node<Integer> n = new Node<>(10);
        //System.out.println(n.data);
        //System.out.println(n.next);

        /*Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);
        n.next = n2;
        n2.next = n3;
        n3.next = n4;*/
        //System.out.println(n2);
        //System.out.println(n2.next);

        //Node<Integer> head = n;
        //print(n2);
        //print(head);


        //increment(n);
        //print(n);

    }
}
