package codingninjas.Tree;

import java.util.Scanner;

public class TreeUse1 {


    public static TreeNode<Integer> takeInput(Scanner s) {
        int data;

        System.out.println("Enter next node data-");
        data = s.nextInt();

        TreeNode<Integer> root = new TreeNode<>(data);
        System.out.println("Enter number of children for " + data);
        int childrenCount = s.nextInt();
        for (int i = 0; i < childrenCount; i++) {

            TreeNode<Integer> child = takeInput(s);
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root) {
        String s = root.data + ":";
        for (int i = 0; i < root.children.size(); i++) {
            s = s + root.children.get(i).data + ",";


        }
        System.out.println(s);

        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }

    }


    public static TreeNode<Integer> takeInputLevelWise() {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter root data");
        int data = s.nextInt();
        TreeNode<Integer> root = new TreeNode<>(data);
        QueueUsingLL<TreeNode<Integer>> queueUsingLL = new QueueUsingLL<>();
        queueUsingLL.enqueue(root);
        while (!queueUsingLL.isEmpty()) {
            try {
                TreeNode<Integer> frontNode = queueUsingLL.dequeue();

                System.out.println("Enter number of children of" + frontNode.data);
                int count = s.nextInt();
                for (int i = 0; i < count; i++) {
                    System.out.println("Enter " + (i + 1) + "children of " + frontNode.data);
                    int child = s.nextInt();
                    TreeNode<Integer> childData = new TreeNode<>(child);
                    frontNode.children.add(childData);
                    queueUsingLL.enqueue(childData);
                }
            } catch (QueueEmptyException e) {
                throw new RuntimeException(e);
            }
        }


        return root;
    }

    public static void printLevelWise(TreeNode<Integer> root) {
        //int rootData = root.data;
        //System.out.println(rootData);
        if (root == null) {
            return;
        }
        try {
            QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
            pendingNodes.enqueue(root);
            while (!pendingNodes.isEmpty()) {

                int levelSize = pendingNodes.size();


                for (int i = 0; i < levelSize; i++) {
                    TreeNode<Integer> currentNode = pendingNodes.dequeue();
                    System.out.print(currentNode.data + " ");

                    // Add all children of the current node to the queue
                    for (TreeNode<Integer> child : currentNode.children) {
                        pendingNodes.enqueue(child);
                    }
                }
            }
        } catch (Exception ex) {

        }


    }

    public static void main(String[] args) {

        //Scanner s = new Scanner(System.in);
        TreeNode<Integer> root = takeInputLevelWise();
        // TreeNode<Integer> root = takeInput(s);
        //print(root);
        printLevelWise(root);
       /* TreeNode<Integer> root = new TreeNode<>(4);
        TreeNode<Integer> node1 = new TreeNode<>(2);
        TreeNode<Integer> node2 = new TreeNode<>(1);
        TreeNode<Integer> node3 = new TreeNode<>(3);
        TreeNode<Integer> node4 = new TreeNode<>(4);
        TreeNode<Integer> node5 = new TreeNode<>(5);
        TreeNode<Integer> node6 = new TreeNode<>(9);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);
        node2.children.add(node5);
        node3.children.add(node6);

        System.out.println(node2.data);*/
    }
}
