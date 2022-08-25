package DSA2.LinkedList;

public class LinkedList {
    static Node head;
    public Node  insert(int data)
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
        return head;
    }

    static Node middle()
    {
        Node fast =head;
        Node slow = head;
        while(fast!=null && fast.next !=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public Node  printFromMiddle()
    {
        Node curr = middle();
        while( curr !=null)
        {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        curr = head;
        return curr;
    }
    void print()
    {
        Node curr = head;
        while(curr !=null)
        {
            System.out.print(curr.data + " ");
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
    public Node  removeNthFromEnd(int data){
        if(head==null){
            return null;
        }
        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }

        if(data==size){
            return head.next;
        }

        int indexToRemove = size-data;
        int i = 1;
        Node prev = head;
        while(i<indexToRemove){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;
    }
    public void removeDuplicate() {
        Node current = head, index = null, temp = null;
        if(head == null) {
            return;
        }
        else {
            while(current != null){
                temp = current;
                index = current.next;

                while(index != null){
                    if(current.data == index.data) {
                        temp.next = index.next;
                    }
                    else{
                        temp = index;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

}
