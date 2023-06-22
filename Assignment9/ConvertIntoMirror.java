
class Node {
    int data;
    Node left, right;
    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}

public class ConvertIntoMirror {
    Node root;

    void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    void convert(Node root){
        if(root==null){
            return;
        }
        convert(root.left);
        convert(root.right);
        swap(root);
    }
    void swap(Node root){
        if(root==null){
            return ;
        }
        Node cur=root.left;
        root.left=root.right;
        root.right=cur;
    }
    public static void main(String[] args)
    {
        ConvertIntoMirror tree = new ConvertIntoMirror();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right =new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.convert(tree.root);
        tree.preorder(tree.root);
    }
}
