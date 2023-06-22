import java.util.ArrayDeque;
import java.util.Queue;

class Node {
    int data;
    Node left, right;
    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
public class CompleteBinaryTree {
    Node root;
    boolean checkCompleteBinaryTree(Node root){
        if(root==null){
            return true;
        }
        Queue<Node> q1=new ArrayDeque<>();
        q1.add(root);
        while(!q1.isEmpty()){
            Node cur=q1.remove();
            if(cur.left==null && cur.right!=null){
                return false;
            }
            else if(cur.right==null && cur.left!=null){
                return false;
            }
            if(cur.left!=null){
                q1.add(cur.left);
            }
            else if(cur.right!=null){
                q1.add(cur.right);
            }
            else{
                return true;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        CompleteBinaryTree tree = new CompleteBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right =new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        if(tree.checkCompleteBinaryTree(tree.root)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
