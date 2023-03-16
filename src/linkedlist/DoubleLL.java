package linkedlist;

public class DoubleLL {

    Node head;

    public void insertFirst(int value) {

        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertAtLast(int value) {
        Node node = new Node(value);

        Node last = head;
        node.next = null;
        if (head == null) {
            head = node;
            node.prev = null;
            return;

        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }


    public void insert(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.data == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.data + "->");
            last = temp;
            temp = temp.next;

        }
        System.out.println("end");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.data + "<-");
            last = last.prev;
        }
        System.out.println("END REVERSE");
    }

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
