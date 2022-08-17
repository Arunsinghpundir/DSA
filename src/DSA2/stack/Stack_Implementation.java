package DSA2.stack;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}
class Stack{
    Node head;

    boolean isEmpty(){
        return head == null;
    }

    void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode; return;
        }
        newNode.next = head;
        head = newNode;
    }

    int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
}
public class Stack_Implementation {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(12);
        st.push(45);
        st.push(123);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.isEmpty());
    }
}
