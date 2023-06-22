import java.util.HashMap;
import java.util.Map;

import javax.swing.text.View;

class Node {
    int data;
    Node left, right;
    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
public class LeftView {
    Node root;
    void View(Node root,int level,Map<Integer,Integer> m1){
        if(root==null){
            return;
        }
        m1.putIfAbsent(level, root.data);
        View(root.left, level+1, m1);
        View(root.right, level+1, m1);
    }
    void leftView(Node root){
        Map<Integer,Integer> m1=new HashMap<>();
        View(root,1,m1);
        for(int i=1;i<=m1.size();i++){
            System.out.println(m1.get(i)+" ");
        }
    }
    public static void main(String[] args)
    {
        LeftView tree = new LeftView();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right =new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.leftView(tree.root);
    }
}
