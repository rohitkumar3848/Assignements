
package Assignment5;

class Node{
    int val;
    Node next;
    Node(int x){
        val=x;
        next=null;
    }
}
public class RemoveDuplicates {
    public static void removeDup(Node head){
        Node cur=head;
        while(cur!=null && cur.next!=null){
            if(cur.val==cur.next.val){
                cur.next=cur.next.next;
            }
            else{
                cur=cur.next;
            }
        }
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
        Node temp1=new Node(10);
        Node temp2=new Node(20);
        Node temp3=new Node(30);
        Node temp4=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        traverse(head);
        removeDup(head);
        System.out.println("");
        traverse(head);
    }
}
