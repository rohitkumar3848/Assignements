import java.util.HashSet;

class Node {
    int key;
    Node left, right;
 
    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class PairedSum{
    Node root;
    PairedSum() {
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
    public void findPairSum(Node root,int sum){
        HashSet<Integer> h1=new HashSet<>();
        if(!isPair(root,sum,h1)){
            System.out.println("The sum is not exits..!!");
        }
    }
    public boolean isPair(Node root,int sum,HashSet<Integer> h1){
        if(root==null){
            return false;
        }
        if(isPair(root.left, sum, h1)){
            return true;
        }
        if(h1.contains(sum-root.key)){
            int ans=sum-root.key;
            System.out.println("The sum is equal to the sum of :"+root.key+" "+ans);
            return true;
        }
        else{
            h1.add(root.key);
        }
        return isPair(root.right, sum, h1);
    }
    public static void main(String[] args) {
        PairedSum tree=new PairedSum();
        tree.root = tree.insert(tree.root, 15);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 8);
        tree.insert(tree.root, 12);
        tree.insert(tree.root, 16);
        tree.insert(tree.root, 25);
        tree.findPairSum(tree.root, 35);
    }
}