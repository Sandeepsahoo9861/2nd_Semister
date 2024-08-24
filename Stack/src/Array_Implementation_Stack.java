
public class Array_Implementation_Stack {
	public static class Stack{
		private int[] arr= new int[4];
		int idx=0;
		void push(int x) {
			if(isfull()) {
				System.out.print ("stack is full");
				return;
				
			}
			arr[idx]=x;//HERE WE STORE VALUE 
			idx ++;// INDEX WILL UPDATE ->1
		}
		int peek(){
			if(idx==0) {//idx is initialized to 0, there are no elements in the stack initially.
				System.out.print("Stack is empty");
				return -1;
				
			}
			return arr[idx-1]; //as in line 1 we updated the index so (idx-1) value 
		}
		int pop() {
			if (idx==0) {//agar humara first index khali hai ya rray khali hai(khali matlab
				System.out.print("stack is empty");  //bydefult 0 hai)
				return -1;
			}
			int top=arr[idx-1];//arr = [4, 5, 1, 0].actually during push operation idx updated to
			                    // one more index ahead that's why we do idx-1
			arr[idx-1]=0;//element ko humne nikal diya so us index pe humane 0 store kar diya
			idx --;
			return top;//for ex->2,4,5,6 we want remove 6(3rd idx) but our index is at 4 th index
		}          //due to push operation now idx-1 indicate 3rd idx and in 3rd idx  we  put  0
		           //but out pointer representing to 4 so we have to bring to 3rd ind by idx-- 
		void display() {
			for (int i=0;i<=idx-1;i++) {
				System.out.print(arr[i]+ "");
			}
			System.out.println();
		}
		boolean isEmpty() {
			if (idx==0)return true;
			else return false;
		}
		boolean isfull() {
			if(idx==arr.length) return true;
			else return false;
		}
		int size() {
			return idx;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st=new Stack();
		System.out.print("we pushed" + " ");
		System.out.println();
		st.push(4);
		st.display();//4
		System.out.print("we pushed" + " ");
		System.out.println();
		st.push(5);
		st.display();//4 5
		System.out.print("we pushed" + " ");
		System.out.println();
		st.push(1);
		st.display();//4 5 1
		System.out.print("size is" + " ");
		System.out.print(st.size());
		System.out.println();
		System.out.print("we poped" + " ");
		System.out.println();
		st.pop(); 
		st.display();
		System.out.print("size is" +" ");
		System.out.print(st.size());
		System.out.println();
		System.out.print("we pushed" + " ");
		System.out.println();
		st.push(7);
		st.display();
		System.out.print("we pushed" + " ");
		System.out.println();
		st.push(0);
		st.display();
		System.out.println("size is full" + " ");
		System.out.println(st.isfull());

	}

}
