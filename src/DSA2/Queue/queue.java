package DSA2.Queue;

public class queue {

    static Node head = null, rear = null;

    public void add(String data){

        Node temp = new Node(data);
        if (rear == null) {
            head = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
        }

    void remove() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        head = head.next;

        if (head == null) {
            rear = null;
        }
        System.out.println(temp.data + " Dequeued");

    }

    void print()
    {
        Node curr = head;
        while(curr !=null)
        {
            System.out.println(curr.data  + " ");
            curr = curr.next;
        }
        System.out.println("null ");
    }
    void peek(){
        if(head == null)return;
        System.out.println(head.data );
    }

}
