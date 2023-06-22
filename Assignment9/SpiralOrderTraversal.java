
class Node {
    int data;
    Node left, right;
 
    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
public class SpiralOrderTraversal {
    Node root;
    void printSpiralOrder(Node root){
        if(root==null){
            return ;
        }
        int level=1;
        while(true){
            if(level%2!=0){
                printLeftRight(root, level);
            }
            else{
                 printRightLeft(root, level);
            }
            level++;
        }
    }
    boolean printLeftRight(Node root,int level){
        if(root==null){
            return false;
        }
        if(level==1){
            System.out.print(root.data + " ");
            return true;
        }
        // if(level%2!=0){
        //     boolean left=printLeftRight(root.left, level-1);
        //     boolean right=printLeftRight(root.right, level-1);
        //     return (left||right);
        // }
        // else{
        //     boolean right=printLeftRight(root.right, level-1);
        //     boolean left=printLeftRight(root.left, level-1);
        //     return (left||right);
        // }  
        boolean left=printLeftRight(root.left, level-1);
        boolean right=printLeftRight(root.right, level-1);
        return (left||right);    
    }
    boolean printRightLeft(Node root,int level){
        if(root==null){
            return false;
        }
        if(level==1){
            System.out.print(root.data + " ");
            return true;
        }
        boolean right=printRightLeft(root.right, level-1);
        boolean left=printRightLeft(root.left, level-1);
        return (right||left);
    }
    public static void main(String[] args)
    {
        SpiralOrderTraversal tree = new SpiralOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.right.left.left = new Node(7);
        tree.root.right.left.right = new Node(8);
        System.out.println(
            "Spiral order traversal of Binary Tree is ");
        tree.printSpiralOrder(tree.root);
    }
}
