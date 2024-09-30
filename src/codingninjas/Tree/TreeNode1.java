package codingninjas.Tree;

import java.util.ArrayList;

public class TreeNode1<T> {
    T data;
    ArrayList<T> children;

   public TreeNode1(T data){
        this.data = data;
        children = new ArrayList<>();
    }

}
