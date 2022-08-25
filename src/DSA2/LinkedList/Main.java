package DSA2.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.removeNthFromEnd(3);
        ll.print();
        ll.removeNthFromEnd(4);
        ll.removeDuplicate();
        ll.print();
    }
}
