package linkedlist;


public class MainLL {

    public static void main(String[] args) {
        LL l = new LL();
        l.insertFirst(10);
        l.insertFirst(20);
        l.insertFirst(30);
        l.insertFirst(40);
        l.insertAtLast(99);
        l.insetAtIndex(100, 3);
        l.display();
        l.removeAtFirst();
        l.display();
    }
}
