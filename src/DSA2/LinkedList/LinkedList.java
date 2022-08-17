package DSA2.LinkedList;

public class LinkedList {
    static Node head;

    void insert(int data)
    {
        Node N1 = new Node(data);
        if(head==null){
            head = N1;
        }else{
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = N1;
        }
    }

    static Node middle()
    {
        Node p1 =head;
        Node p2 = head;
        while(p2!=null && p2.next !=null)
        {
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return p1;
    }

    void printFromMiddle()
    {
        Node ans = middle();
        while( ans !=null)
        {
            System.out.print(ans.data + " ");
            ans = ans.next;
        }
    }
    void print()
    {
        Node curr = head;
        while(curr !=null)
        {
            System.out.print(curr.data + "--->" + " ");
            curr = curr.next;
        }
        System.out.print(null + " ");
    }

    public Node reverseList_Recursive(Node head) {
        if(head==null || head.next == null) return head; // base

        Node newhead = reverseList_Recursive(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }
    public Node ReverseList(Node head) {
        Node prev = null;
        Node next = null;
        Node curr = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
