package codingninjas.Tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;

public class TreeNode<T> {
    T data;
    public ArrayList<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        children = new ArrayList<>();
    }
}
