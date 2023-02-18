package codingninjas.LinkedList;

import java.util.Scanner;

public class InertNodeILinkedList {

    public static Node<Integer> takeInput(){
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
    public static void print(Node<Integer> head) {
        //Node<Integer> temp = head;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node<Integer> insert(Node<Integer> head, int data, int pos){

        Node<Integer> newNode = new Node<>(data);
        if(pos ==0){
            newNode.next = head;
            return newNode;
        }
        int i =0;
        Node<Integer> temp = head;
        while(i< pos-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
       head =  insert(head, 80,3 );
       print(head);
    }
}
