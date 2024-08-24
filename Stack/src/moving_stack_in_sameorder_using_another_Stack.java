import java.util.Stack;//util is the package and stack is the class inside util
import java.util.Scanner;
public class moving_stack_in_sameorder_using_another_Stack{
	

	public static void main(String[] args) {
	//	Scanner sc=new Scanner(System.in);
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		Stack<Integer> rt=new Stack();//using rt stack we are reversing the stack
		while(st.size()>0) {
		rt.push(st.pop());
		// or int x=st.peek();
		//	rt.push(x);
		//	st.pop();
		}
		while(rt.size()>0) {
		
		st.push(rt.pop());
		}
		System.out.println(st);
	}

}
