package codingninjas.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeYT {

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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void preorder(Node root) {

        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }



    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currentnode = q.remove();
            if (currentnode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currentnode.data + " ");
                if (currentnode.left != null) {
                    q.add(currentnode.left);
                }
                if (currentnode.right != null) {
                    q.add(currentnode.right);
                }
            }

        }
    }

    //Q1 Count total number of nodes
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = countNodes(root.left);
        int rightNode = countNodes(root.right);

        return leftNode + rightNode + 1;
    }

    //Q2 height of a tree
    public static int heightOfTree(Node root) {

        if (root == null) {
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return Math.max(leftHeight, rightHeight) + 1;

    }

    //q3 sum of Tree
    public static int sumOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfTree(root.left);
        int rightSum = sumOfTree(root.right);

        return leftSum + rightSum + root.data;
    }

    //q4 diameter of tree using n^2
    public static int diameterOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = heightOfTree(root.left) + heightOfTree(root.right) + 1;
        int diam2 = diameterOfTree(root.left);
        int diam3 = diameterOfTree(root.right);
        return Math.max(diam1, Math.max(diam2, diam3));
    }

    //is subtree of a tree
/*
    public boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if (subRoot == null && root == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.val == subRoot.val) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (isIdentical(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
*/


    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, 5, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelOrder(root);
        System.out.println(countNodes(root));
        System.out.println(heightOfTree(root));
        System.out.println(sumOfTree(root));
    }
}
