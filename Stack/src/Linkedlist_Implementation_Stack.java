
public class Linkedlist_Implementation_Stack {
	public static class Node{//user defined data structure
		Node head=null;
		int val;
		Node next;
		Node (int val){
			this.val=val;
		}
		 
	}
	public class LLStack{// user defined data structure
		Node head=null;
		int size=0;
		void push(int x) {
			Node temp=new Node(x);
			temp.next=head;//we want to add the element in front of head
			head=temp;
			size++;
			
			
		}
		int pop() {
			if (head==null) {
				System.out.println("Stack is empty");
				return -1;
			}
			int x=head.val;//we want to store the value of head
			head=head.next;
			size --;
			return x;
		}
		int peek() {
			if (head==null){
				System.out.println("Stack is empty");
				return -1;// else statement is not necessary because the function exits early with
			}// a return statement if the if condition is true.  
			return head.val;//if head is not null it will show that head value
		}
		void displayrec(Node h) {
			if (h==null) return;
			displayrec(h.next);
			System.out.println(h.val + " ");
		}
		void display() {
			displayrec(head);
			System.out.println();
		}
		void displayRev() {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.val + " ");
				
			}
			System.out.println();
			
		}
		int size() {
			return size;
		}
		
	}

	public static void main(String[] args) {
		LLStack st= new LLStack();
		st.push(4);
		st.display();
		st.push(5);
		st.display();
		st.push(1);
		st.display();
		System.out.println(st.size());
		st.pop();
		st.display();
		System.out.println(st.size());
		st.push(7);
		st.push(0);

	}

}
