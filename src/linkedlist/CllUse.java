package linkedlist;

public class CllUse {
    public static void main(String[] args) {
        CircularLL cl = new CircularLL();
        cl.insert(10);
        cl.insert(20);
        cl.insert(30);
        cl.insert(40);
        cl.insert(50);
        cl.delete(50);
        cl.display();
    }
}
