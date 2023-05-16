package Assignment5;

class Node{
    int val;
    Node next;
    Node(int x){
        val=x;
        next=null;
    }
}
public class SearchEle {
    public static boolean search(Node head,int x){
        Node cur=head;
        while(cur!=null){
            if(cur.val==x){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    public static void traverse(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        if(search(head, 40)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
