import javax.swing.plaf.synth.SynthDesktopIconUI;

class Node {
    int key;
    Node left, right;
 
    public Node(int item) {
        key = item;
        left = right = null;
    }
}
class kthLargest {
    int ans=0;
    int count=0;
    Node root;
    kthLargest(){
        root=null;
    }
    public void inorder(Node root,int k){
        if(root==null){
            return ;
        }
        inorder(root.right,k);
        count++;
        if(count==k){
            ans=root.key;
            return ;
        }
        inorder(root.left,k);

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
    public int kthLargest(Node root, int k){
        inorder(root,k);
        return ans;
    }
    public static void main(String[] args) {
        kthLargest tree=new kthLargest();
        tree.root = tree.insert(tree.root, 15);
        tree.insert(tree.root, 10);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 8);
        tree.insert(tree.root, 12);
        tree.insert(tree.root, 16);
        tree.insert(tree.root, 25);
        System.out.println();
        System.out.println(tree.kthLargest(tree.root,2));
    }
}
