
import java.util.HashSet;

class Node {
    int key;
    Node left, right;
 
    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class LowestCommonAncestor{
    Node root;
    LowestCommonAncestor() {
        root = null;
    }
    public Node insert(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(root.key<key){
            root.right=insert(root.right, key);
        }
        else  if(root.key>key){
            root.left=insert(root.left, key);
        }
        return root;
    }
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root==null){
            return null;
        }
        if(root.key<p.key && root.key<q.key){
            return lowestCommonAncestor(root.right,p,q);
        }
        if(root.key>p.key && root.key>q.key){
            return lowestCommonAncestor(root.left,p,q);
        }
        return root;
    }
    
    public static void main(String[] args) {
        LowestCommonAncestor tree=new LowestCommonAncestor();
        tree.root = tree.insert(tree.root, 15);
        tree.insert(tree.root, 10);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 8);
        tree.insert(tree.root, 12);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 6);
        tree.insert(tree.root, 9);
        tree.insert(tree.root, 8);
        tree.insert(tree.root, 22);
        Node p=new Node(10);
        Node q=new Node(12);
        Node res=tree.lowestCommonAncestor(tree.root, p, q);
        System.out.println(res.key);
    }
}