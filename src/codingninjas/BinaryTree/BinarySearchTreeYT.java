package codingninjas.BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;

//time compexity of bst is 0(h) where height is till depth
public class BinarySearchTreeYT {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            //leftSubtree
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrderNodeDisplay(Node root) {
        if (root == null) {
            return;
        }
        inOrderNodeDisplay(root.left);
        System.out.print(root.data + " ");
        inOrderNodeDisplay(root.right);
    }

    // q find in range
    public static void printInRange(Node root, int x, int y) {
        if (root == null) {
            return;
        }
        if (root.data >= x && root.data <= y) {
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);

        } else if (root.data >= y) {
            printInRange(root.left, x, y);
        } else {
            printInRange(root.right, x, y);
        }
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println();
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);

        //leaf
        if (root.left == null && root.right == null) {
            printPath(path);
        } else {//  non leaf
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }
        path.remove(path.size() - 1);

    }

    public static boolean searchInBst(Node root, int val) {
        if (root == null) {
            return false;
        }
        if (root.data > val) {
            return searchInBst(root.left, val);
        } else if (root.data == val) {
            return true;
        } else {
            return searchInBst(root.right, val);
        }
    }

    public static void main(String[] args) {
        int[] values = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inOrderNodeDisplay(root);
        System.out.println(searchInBst(root, 6));
        printInRange(root, 2, 4);
        System.out.println();
        printRootToLeaf(root, new ArrayList<>());
    }
}
