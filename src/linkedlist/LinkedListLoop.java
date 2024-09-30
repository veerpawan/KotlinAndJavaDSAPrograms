package linkedlist;

public class LinkedListLoop {


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    // Function to detect a loop in the linked list
    public boolean detectLoop() {
        Node slow = head, fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;          // Move slow pointer by one step
            fast = fast.next.next;     // Move fast pointer by two steps

            // If slow and fast meet at some point, then there's a loop
            if (slow == fast) {
                return true;
            }
        }
        return false;  // No loop found
    }

    // Function to add a new node to the list
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        LinkedListLoop list = new LinkedListLoop();

        list.add(20);
        list.add(4);
        list.add(15);
        list.add(10);

        // Creating a loop for testing
        list.head.next.next.next.next = list.head;

        if (list.detectLoop())
            System.out.println("Loop detected");
        else
            System.out.println("No Loop");
    }

}
