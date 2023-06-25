

import java.util.HashSet;

class Node {
    int key;
    Node left, right;
 
    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class inorderPredecessor{
    Node root;
    inorderPredecessor() {
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
    public Node prdecessor(Node root, Node p) {
        Node pre=null;
        while(root!=null){
            if(p.key>root.key){
                pre=root;
                root=root.right;
            }
            else{
                root=root.left;
            }
        }
        return pre;
    }
    
    public static void main(String[] args) {
        inorderPredecessor tree=new inorderPredecessor();
        tree.root = tree.insert(tree.root, 15);
        tree.insert(tree.root, 10);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 8);
        tree.insert(tree.root, 12);
        tree.insert(tree.root, 16);
        tree.insert(tree.root, 25);
        Node p=new Node(25);
        Node res=tree.prdecessor(tree.root, p);
        System.out.println(res.key);
    }
}
