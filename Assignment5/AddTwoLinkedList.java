package Assignment5;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        next = null;
    }
}

public class AddTwoLinkedList {
    public static void traverse(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }

    public static Node reverse(Node head) {
        Node cur = head;
        Node prev = null;
        Node next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static Node insertAtTail(Node anshead, Node anstail, int digit) {
        Node temp = new Node(digit);
        if (anshead == null) {
            anshead = temp;
            anstail = temp;
            //System.out.println("Digit now: "+digit);
            return anstail;
        } else {
            //System.out.println("Digit now: "+digit);
            anstail.next = temp;
            temp.next=null;
            anstail = temp;
            return anstail;
        }
    }
    public static Node add(Node head1, Node head2) {
        int carry = 0;
        Node anshead = null;
        Node anstail = null;
        while (head1 != null || head2 != null || carry != 0) {
            int val1 = 0;
            if (head1 != null) {
                val1 = head1.val;
            }
            int val2 = 0;
            if (head2 != null) {
                val2 = head2.val;
            }
            int sum = val1 + val2 + carry;
            int digit = sum % 10;
            anstail=insertAtTail(anshead, anstail, digit);
            carry=sum/10;
            if(head1!=null){
                head1=head1.next;
            }
            if(head2!=null){
                head2=head2.next;
            }
        }
        return anshead;
    }

    public static Node addTwoList(Node head1, Node head2) {
        head1 = reverse(head1);
        head2 = reverse(head2);
        Node ans = add(head1, head2);
        //System.out.println(ans.val);
        ans = reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        Node head1 = new Node(5);
        Node temp1 = new Node(6);
        Node temp2 = new Node(3);
        head1.next = temp1;
        temp1.next = temp2;
        traverse(head1);
        System.out.println("");
        Node head2 = new Node(8);
        Node temp3 = new Node(4);
        Node temp4 = new Node(2);
        head2.next = temp3;
        temp3.next = temp4;
        traverse(head2);
        System.out.println("");
        Node ansNode=addTwoList(head1, head2);
        traverse(ansNode);
    }
}
