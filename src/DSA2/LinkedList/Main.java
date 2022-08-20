package DSA2.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);

        ll.insert(4);
        ll.insert(5);
        ll.insert(6);

        System.out.println(" ");

        System.out.print("Middle element is :" + ll.middle().data + " \n" );

        ll.printFromMiddle();
        System.out.println(" ");


        ll.head = ll.ReverseList(ll.head);
        ll.print();
        System.out.println();
        ll.printFromMiddle();
        System.out.println();


        ll.head = ll.reverseList_Recursive(ll.head);

        System.out.println();

        ll.insert(5);
        ll.insert(1000);
        ll.printFromMiddle();
        ll.insert(500);


    }
}
