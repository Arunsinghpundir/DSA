/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	static void deleteMid(Stack<Integer> st){
		int n = st.size();
		Stack<Integer> St1 = new Stack();
		int count = 0;
		while (count < n / 2) {
			int c = st.peek();
			st.pop();
			St1.push(c);
			count++;
		}
		st.pop();
		while (!St1.empty()) {
			st.push(St1.peek());
			St1.pop();
		}
		Stack<Integer> St2 = new Stack();
		
		while (!st.empty()) {
			St2.push(st.pop());
		}
		while(!St2.empty()){
		  int x = St2.peek();
		  St2.pop();
		  System.out.print(x+" ");
		}
	}

	public static void main(String args[])
	{
		Stack<Integer> st = new Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		deleteMid(st);
	
	}
}
