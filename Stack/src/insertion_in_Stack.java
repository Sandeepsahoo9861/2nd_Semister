import java.util.*;
public class insertion_in_Stack {//inseting an element at any index

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println("original stack"+"  " +st);
		Stack<Integer> pk=new Stack<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the index no where to insert the element");
		int idx=sc.nextInt();
		System.out.println("enter the element to be inserted");
		int element=sc.nextInt();
		while (st.size()>idx) {
			pk.push(st.pop());
			
		}
		st.push(element);
		while (pk.size()>0) {
			st.push(pk.pop());
		}
		System.out.print(st);

	}

}
