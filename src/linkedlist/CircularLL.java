package linkedlist;

public class CircularLL {

    private Node head;
    private Node tail;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void delete(int value){
        Node temp = head;
        if(temp == null){
            return;
        }

        if(temp.data == value){
            head = head.next;
            tail.next= head;
            return;
        }

        do {
            Node n = temp.next;
            if (n.data == value) {
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        } while (temp != head);

    }

    public void display() {
        Node node = head;

        if (head != null) {
            do {
                System.out.print(node.data + "->");
                if (node.next != null) {
                    node = node.next;
                }
            } while (node != head);
        }
    }

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
