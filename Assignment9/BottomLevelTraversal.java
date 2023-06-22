import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

class Node {
    int data;
    Node left, right;
    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
public class BottomLevelTraversal {
    Node root;
    void printBottomToUp(Node root){
        if(root==null){
            return ;
        }
        Queue<Node> q1=new ArrayDeque<>();
        Stack<Integer> s1=new Stack<>();
        q1.add(root);
        while(!q1.isEmpty()){
            Node cur=q1.remove();
            s1.push(cur.data);
            if(cur.right!=null){
                q1.add(cur.right);
            }
            if(cur.left!=null){
                q1.add(cur.left);
            }
        }
        while(!s1.empty()){
            System.out.print(s1.pop()+" ");
        }
    }
    public static void main(String[] args)
    {
        BottomLevelTraversal tree = new BottomLevelTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.right.left.left = new Node(7);
        tree.root.right.left.right = new Node(8);
        tree.printBottomToUp(tree.root);
    }
}
