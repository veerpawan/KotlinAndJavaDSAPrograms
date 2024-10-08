package codingninjas.Tree;

import codingninjas.Queue.QueueEmptyException;
import sun.reflect.generics.tree.Tree;

import java.util.Scanner;

public class TreeUse {


    // pre-order traversal always print first left and post order traversal always print the down to top approach
    public static void preorder(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        for (int i = 0; i < root.children.size(); i++) {
            preorder(root.children.get(i));

        }
    }

    public static void postorder(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        //
        for (int i = 0; i < root.children.size(); i++) {
            preorder(root.children.get(i));
        }
        System.out.println(root.data + " ");
    }

    public static int findHeight(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        // Base case: if the root has no children, the height is 1
        if (root.children.isEmpty()) {
            return 1;
        }
        int maxHeight = 0;
        for (int i = 0; i < root.children.size(); i++) {
            int childHeight = findHeight(root.children.get(i));
            if (childHeight > maxHeight) {
                maxHeight = childHeight;
            }

        }
        return 1 + maxHeight;

    }

    //depth of tree
    public static void printAtK(TreeNode<Integer> root, int k) {
        if (k < 0) {
            return;
        }
        if (k == 0) {
            System.out.println(root.data);
            return;
        }
        for (int i = 0; i < root.children.size(); i++) {
            printAtK(root.children.get(i), k - 1);
        }
    }

    public static int largest(TreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int ans = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            int childLargest = largest(root.children.get(i));
            if (childLargest > ans) {
                ans = childLargest;
            }
        }
        return ans;
    }

    public static int numNodes(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < root.children.size(); i++) {
            count += numNodes(root.children.get(i));
        }
        return count;

    }

    public static int sumOfAllNode(TreeNode<Integer> root) {
        // Base case: if the root is null, return 0
        if (root == null) {
            return 0;
        }

        // Initialize sum with the root's data
        int sum = root.data;

        // Use a traditional for loop to iterate over children
        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> child = root.children.get(i);
            sum += sumOfAllNode(child);
        }

        return sum;
    }

    public static TreeNode<Integer> takeInput(Scanner sc) {
        int n;

        System.out.println("Enter next node");
        n = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("Enter number of children for" + n);
        int childCount = sc.nextInt();

        for (int i = 0; i < childCount; i++) {
            TreeNode<Integer> child = takeInput(sc);
            root.children.add(child);
        }
        return root;

    }


    //internally we use queue to take input and print level wise
    public static TreeNode<Integer> takeInputLevelWise() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter root data");
        int rootData = s.nextInt();
        QueueUsingLL<TreeNode<Integer>> pendingNode = new QueueUsingLL<>();
        TreeNode<Integer> root = new TreeNode<>(rootData);
        pendingNode.enqueue(root);
        while (!pendingNode.isEmpty()) {
            try {
                TreeNode<Integer> frontNode = pendingNode.dequeue();
                System.out.println("Enter num of children of " + frontNode.data);
                int numChildren = s.nextInt();

                for (int i = 0; i < numChildren; i++) {
                    System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
                    int child = s.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<>(child);
                    frontNode.children.add(childNode);
                    pendingNode.enqueue(childNode);
                }
            } catch (codingninjas.Tree.QueueEmptyException e) {
                // it shouldnt come here
                return null;

            }
        }
        return root;

    }

    public static void print(TreeNode<Integer> root) {
        String s = root.data + ":";
        for (int i = 0; i < root.children.size(); i++) {
            s = s + root.children.get(i).data + " , ";
        }
        System.out.println(s);

        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }
    }

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);

        //TreeNode<Integer> root = takeInput(sc);

        TreeNode<Integer> root = takeInputLevelWise();
        print(root);
        //System.out.println(largest(root));
        // System.out.println(numNodes(root));
        //System.out.println(sumOfAllNode(root));
        System.out.println(findHeight(root));
        //printAtK(root, 2);
        //preorder(root);
        //System.out.println();
        /*TreeNode<Integer> root = new TreeNode<Integer>(4);
        TreeNode<Integer> node1 = new TreeNode<Integer>(2);
        TreeNode<Integer> node2 = new TreeNode<Integer>(3);
        TreeNode<Integer> node3 = new TreeNode<Integer>(5);
        TreeNode<Integer> node4 = new TreeNode<Integer>(6);
        TreeNode<Integer> node5 = new TreeNode<Integer>(8);
        TreeNode<Integer> node6 = new TreeNode<Integer>(9);
        TreeNode<Integer> node7 = new TreeNode<Integer>(2);
        TreeNode<Integer> node8 = new TreeNode<Integer>(4);


        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);

        node4.children.add(node4);

        System.out.println(root);*/

    }

}
