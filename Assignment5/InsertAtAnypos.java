package Assignment5;

class Node{
    int val;
    Node next;
    Node(int x){
        val=x;
        next=null;
    }
}
public class InsertAtAnypos {
    public static Node insertAtPos(Node head,int pos,int x){
        Node temp=new Node(x);
        if(pos==1 ||pos==0){
            temp.next=head;
            head=temp;
            return head;
        }
        Node cur=head;
        for(int i=1;i<pos-1 && cur!=null;i++){
            cur=cur.next;
        }
        if(cur==null){
            return head;
        }
        else{
            temp.next=cur.next;
            cur.next=temp;
            return head;
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
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        head=insertAtPos(head, 0, 1);
        traverse(head);

    }
}
