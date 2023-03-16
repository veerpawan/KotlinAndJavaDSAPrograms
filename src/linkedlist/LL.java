package linkedlist;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insetAtIndex(int data, int index) {

        if (index == 0) {
            insertFirst(data);
            return;
        }
        if (index == size) {
            insertAtLast(data);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(data, temp.next);
        temp.next = node;
        size++;
    }

    public void insertFirst(int data) {

        Node node = new Node(data);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertAtLast(int data) {
        if (tail == null) {
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    public int removeAtFirst(){
        int val = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }

        size--;
        return val;
    }

    public Node find(int value){
        Node temp = head;
        while(temp!=null){
            if(temp.data == value){
                return temp;
            }
            temp = temp.next;
        }
        return temp;
    }

    public Node get(int index){
        Node temp = head;
        for(int i =1;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("End");
    }

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

}
