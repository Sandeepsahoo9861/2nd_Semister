
public class Linkedlist_pw {
	public static void displayrecursion(Node head) {//by recursion
		if (head == null) return;
		System.out.print(head.data + " ");
		display(head.next);
		
	}
	
	
	
	public static void display(Node head) {//initially head pointing to a.
		while(head !=null) {
			System.out.print(head.data + " ");//first it will print a value
			head=head.next;//now head to b;
		}
		
	}
	public static int Length(Node head) {
		int count =0;
		while (head != null) {
			count=count +1;
			head=head.next;
			
		}
		return count;
		
	}
	public static class Node{
		int data;
		Node next;//we use Node as datatype(class name) to for address of next node
		Node(int data){//Node constructor it is the same as the class name
			this.data=data;//data is the value stored in each node of the linked list.
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a=new Node(3);//a is a reference to the first node in the linked list.
		Node b=new Node(2);//a, you can traverse the linked list to access each node and its data.
		Node c=new Node(9);
		Node d=new Node(8);
		Node e=new Node(16);
		a.next=b;//it is used to established the connection
		b.next=c;//it address of c came to b;
		c.next=d;//it address of d came to c;
		d.next=e;//5->2->9->8->16
		displayrecursion(a);
		System.out.println();
		display(a);
		System.out.println();
		System.out.println("Length of Linked List");
		System.out.print(Length(a));
		System.out.println(); 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.print(a.data +" ");//o/p->3
		System.out.print(a.next.data+ " ");////a.next=b and a.next.data=b.data=2
		System.out.print(a.next.next.data+" ");//a.next.next=c..... 
		System.out.print(a.next.next.next.data +" ");
		//Or(alternative way)
		System.out.println();
		
		Node temp=a;//Node temp=a means temp is indicating to a first
		for(int i=1;i<=5;i++) {
			System.out.print(temp.data +" ");//o/p-3 2 9 8 
			temp=temp.next;//intially it indicates a,then b,then c..,this line is used for traversing
		}
		
		

	}

}
