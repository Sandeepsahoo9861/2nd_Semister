import java.util.Stack;//util is the package and stack is the class inside util
import java.util.Scanner;
public class moving_stack_in_sameorder {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> st=new Stack<>();
		int n;
		System.out.println("enter the no of elements you want to insert");
		n=sc.nextInt();
		System.out.println("enter the elements");
		for(int i=1;i<=n;i++) {
			int x=sc.nextInt();
			st.push(x);
		}
		System.out.println(st);

	}

}
