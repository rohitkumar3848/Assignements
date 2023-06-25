
class Node {
    int key;
    Node left, right;
 
    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class SearchItreatively{
    Node root;
    SearchItreatively() {
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
    public boolean search(Node root,int key){
        while(root!=null){
            if(root.key<key){
                root=root.right;
            }
            else if(root.key>key){
                root=root.left;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        SearchItreatively tree=new SearchItreatively();
        tree.root = tree.insert(tree.root, 15);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 8);
        tree.insert(tree.root, 12);
        tree.insert(tree.root, 16);
        tree.insert(tree.root, 25);
        if (tree.search(tree.root, 25)){
            System.out.println("Yes");
        }    
        else{
            System.out.println("NO");
        }
    }
}