package codingninjas.BinaryTree;

import java.util.Scanner;

public class BinaryTreeUse {

    //mostly questions come from the binary tree
    // every node have maximum two children's
    //in trees mostly we use recursion.in some cases we don't use recursion like level vise tree

    public static void printTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        String toBePrinted = root.data + "";
        if (root.left != null) {
            toBePrinted += "L:" + root.left.data + ",";
        }
        if (root.right != null) {
            toBePrinted += "R:" + root.right.data;
        }
        System.out.println(toBePrinted);
        printTree(root.left);
        printTree(root.right);
    }

    public static int countNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int ans = 1;
        ans += countNodes(root.left);
        ans += countNodes(root.right);
        return ans;
    }

    static public BinaryTreeNode<Integer> takeInput(Scanner s) {
        int rootData;
        System.out.println("Enter root data");
        rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left = takeInput(s);
        root.right = takeInput(s);
        return root;
    }

    //for level wise we need queue
    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        Scanner s = new Scanner(System.in);

        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        System.out.println("Enter root data");
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> front;
            try {
                front = pendingNodes.dequeue();
            } catch (QueueEmptyException e) {
                return null;
            }
            System.out.println("Enter left child of " + front.data);
            int leftChild = s.nextInt();
            if (leftChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.enqueue(child);
                front.left = child;
            }

            System.out.println("Enter right child of " + front.data);
            int rightChild = s.nextInt();
            if (rightChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.enqueue(child);
                front.right = child;
            }
        }
        return root;
    }

    public static int numNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftNodeCount = numNodes(root.left);
        int rightNumNodes = numNodes(root.right);
        return 1 + leftNodeCount + rightNumNodes;
    }

    public static int largestNode(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }
        int largestLeft = largestNode(root.left);
        int largestRight = largestNode(root.right);

        return Math.max(root.data, Math.max(largestLeft, largestRight));

    }

    public static int numOfLeafNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return numOfLeafNodes(root.left) + numOfLeafNodes(root.right);
    }

    public static void printAtDeptK(BinaryTreeNode<Integer> root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.println(root.data);
        }
        printAtDeptK(root.left, k - 1);
        printAtDeptK(root.right, k - 1);
    }

    public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return null;
        }
        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;
    }

    public static BalancedTreeReturn isBalancedBatter(BinaryTreeNode<Integer> root){
        if(root == null){
            int height = 0;
            boolean isBal  = true;
            BalancedTreeReturn ans = new BalancedTreeReturn();
            ans.height = height;
            ans.isBalanced = isBal;
            return ans;
        }

        BalancedTreeReturn leftOutput  = isBalancedBatter(root.left);
        BalancedTreeReturn rightOutput = isBalancedBatter(root.right);
        boolean isBal = true;
        int height = 1+Math.max(leftOutput.height , rightOutput.height);
        if(Math.abs(leftOutput.height - rightOutput.height)>1){
            isBal = false;

        }
        if(!leftOutput.isBalanced || !rightOutput.isBalanced){
            isBal = false;
        }
        BalancedTreeReturn ans = new BalancedTreeReturn();
        ans.height = height;
        ans.isBalanced = isBal;
        return ans;
    }

    public static boolean isBalanced(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.left);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);
        return isLeftBalanced && isRightBalanced;
    }


    public void inorder(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+ " ");
        inorder(root.right);
    }

    //height will be defined based on how deep is tree
    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);

    }

    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
        if(root == null){
            return false;
        }
        if(root.data .equals(x)){
            return true;
        }
        boolean isPresentAtLeft = 	isNodePresent(root.left, x);
        if(isPresentAtLeft){
            return true;
        }


        return isNodePresent(root.right, x);
    }



    public static void main(String[] args) {

         /*BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);

        root.left = node1;
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
        root.right = node2;*/

        //Scanner s = new Scanner(System.in);
        //BinaryTreeNode<Integer> root = takeInput(s);
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        printTree(root);
        System.out.println("Number of nodes" + countNodes(root));
        System.out.println("Largest if " + largestNode(root));
        System.out.println("number of leaves " + numOfLeafNodes(root));
        System.out.println("print AT DEPTH K ");
        printAtDeptK(root, 2);
        System.out.println("is nodeavailable "+ isNodePresent(root, 5));
        //BinaryTreeNode<Integer> newRoot = removeLeaves(root);
        //printTree(newRoot);
        System.out.println("Is balanced"+ isBalanced(root));
        //s.close();




    }
}
