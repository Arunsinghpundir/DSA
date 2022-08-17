package DSA2;


public class Main {
    Node head;
    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFir(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLas(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
        }

        Node currNode = head;
        while(currNode.next!=null){
            System.out.println(currNode+" --> ");
            currNode = currNode.next;
        }
        System.out.println("Null");

    }
 //Driver Code
    public static void main(String[] args) {
        Main list = new Main();
        list.addFir("this is");
        list.addLas("DSA");
        System.out.println(list);

    }
}
