package DSA2.Queue.UsingStack;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> A;
    Stack<Integer> B;
    public MyQueue(){
        A = new Stack<>();
        B = new Stack<>();
    }

    public void pu(int data){
        while(!A.isEmpty()){
            B.push(A.pop());
        }
        A.push(data);
        while(!B.isEmpty()){
            A.push(B.pop());
        }
    }

    public int po(){
        return A.pop();
    }

    public int pe(){
        return A.peek();
    }

    public boolean empty(){
        return A.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.pu(1);
        q.pu(2);
        q.pu(3);
        q.pu(4);
        q.pu(5);
        System.out.println(q.po());
        System.out.println(q.pe());
        System.out.println(q.po());
        System.out.println(q.po());
        System.out.println(q.po());
        System.out.println(q.po());
        System.out.println(q.empty());
    }
}
