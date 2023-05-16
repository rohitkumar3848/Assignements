package Assignment5;

public class pallindromeList {
    public static void traverse(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
    }
    public static Node reverse(Node head){
        Node cur=head;
        Node prev=null;
        Node next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    public static boolean isPal(Node head){
        if(head==null || head.next==null){
            return true;
        }
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        Node rev=reverse(slow.next);
        while(rev!=null){
            if(head.val!=rev.val){
                return false;
            }
            rev=rev.next;
            head=head.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        Node temp3=new Node(30);
        Node temp4=new Node(20);
        Node temp5=new Node(10);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        temp4.next=temp5;
        traverse(head);
        if(isPal(head)){
            System.out.println("Yes");
        }
        else{
            System.out.println("False");
        }
    }
}
