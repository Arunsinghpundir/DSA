import java.util.*;
class Node {
    Node next;

    //}
//class stack{
//
//    void pop() {
//        char ch = st.pop();
//    }
//    void size(){
//        int siz = st.size();
//    }
//
//    boolean isEmpty() {
//        String reverse = "";
//        while (!st.isEmpty()) {
//            char ch = st.pop();
//            reverse = reverse + ch;
//        }
//
//    }
//
//}
    public class StackQueue {

        public static void main(String[] args) {
            Stack<Character> st = new Stack<Character>();
            String s = "ArunRana";
            for (int i = 0; i < s.length(); i++) {
                st.push(s.charAt(i));
            }


            String reverse = "";
            int siz = st.size();
            while (!st.isEmpty()) {
                char ch = st.pop();
                reverse = reverse + ch;

            }
            System.out.println(reverse + "  " + siz);
        }
    }
}




