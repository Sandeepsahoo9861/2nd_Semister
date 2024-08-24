
public class DoublyLL_PW {
	public static class Node{
		int val;
		Node next;
		Node prev;
		Node(int val){
			this.val=val;
		}
	} 
	public static void display(Node head) {
		Node temp=head;
		while(temp != null) {
			System.out.print(temp.val + " ");
			temp=temp.next;
		}
	}
	public static void display1(Node tail) {
		Node temp=tail;
		while(temp!=null) {
			System.out.print(temp.val +" ");
			temp=temp.prev;
		}
	}
	public static void display2(Node random) {//it's aim is to display all list if node is 
		Node temp=random;//at any random index
		while(temp.prev !=null) {
			temp=temp.prev;//it will help in move the node from any reandom
			               //index to head so now temp is head as head previous is null
		}
		while (temp!=null) {
			System.out.print(temp.val + " ");
			temp=temp.next;
		}
	}
	public static void insertionAtTail(Node head ) {
		Node temp=head;
		while(temp.next!=null) {//ye head se tail tak le ke chala jayega
			temp=temp.next;
		}
		Node t=new Node(882);
		temp.next=t;
		t.prev=temp;
		 Node tail=t;
	}
	 public static Node insertionAtHead(Node head ) {
		 Node t=new Node(999);//we created a node t
		 t.next=head;
		 head.prev=t;
		 head=t;//head is pointing to t
		 return head;
	 }
	 public static void InsertionAtIdx(Node head,int idx,int x) {
		 Node s=head;
		 for(int i=1;i<=idx-1;i++) {//i start from one as head is in 0 index
			 s=s.next;//s is at position idx-1;
		 }
		 Node r=s.next;//r humara s ke agle wale node hai
		 Node t=new Node(x);//we have created a new node with value x
		 //so s t r//humko t ko r and s ke bich mein lana hai
		 t.prev=s;
		 t.next=r;
		 s.next=t;
		 r.prev=t;
	 }
	 public static void InsertionatIdx(Node head,int idx,int x) {
		 Node temp=head;
		 for(int i=1;i<=idx-1;i++) {
			 temp=temp.next;
		 }
		 Node t=new Node(x);//I made a node with name t and value is t
		 t.next=temp.next;// here node is temp,t,temp.next  I connect t right sight 
		                  //with temp ke age node ke sath
		 t.prev=temp;//I connect t ke prevous node with temp ke sath,yanha tak t
		             //ka sabhi connect kar diya without breaking any other connection
		 temp.next=t;//it means for ex-> a ,b (a.next is  is pointing to b , but a.next= t
		             // means we update a is conect with t and we a to b(forward connection)
		 t.next.prev=t;//here t.next reffers to old temp.next and its old  prevous temp.next is
		              // connect to t;  
		   
				 
		 
	 }
	 public static void deleteidx(Node head, int idx){
		 Node temp=head;
		 for(int i=1;i<=idx-1;i++) {
			 temp=temp.next;
		 }
		 temp.next=temp.next.next;// ex->a b c,a.next.next is c ,so temp.next become c
		 temp.next.prev=temp; // As temp.next is c so temp.next.prev is c.prev connected with temp(a)
	 }
	 public static void deletehead(Node head) {
	  head=head.next;
	  head.prev=null;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a=new Node(4);
		Node b=new Node(10);
		Node c=new Node(2);
		Node d=new Node(99);
		Node e=new Node(13);
		a.prev=null;
		a.next=b;
		b.prev=a;
		b.next=c;
		c.prev=b;
		c.next=d;
		d.prev=c;
		d.next=e;
		e.prev=d;
		e.next=null;
		display(a);
		System.out.println();  
		System.out.print("in reverse order displaying");
	 System.out.println();
		display1(e);
		System.out.println();
		display2(c);//we have any random parameter but it will display whole list
        System.out.println();
        System.out.println("we add node at the head point");
       
        Node newHead=insertionAtHead(a);
        display2(newHead);
        System.out.println();
        System.out.println("we add node at the tail point");
        insertionAtTail(a);
        display(a);
        System.out.println();
        System.out.println("insrting element at any index");
        InsertionAtIdx( a, 3, 76327) ;
        display(a);
        System.out.println();//alternative way to do InsertatIndex
        System.out.println("insrting element at any index alternative way");
        InsertionatIdx( a, 5, 500000);
        display(a);
        System.out.println();
        System.out.println("Delete any position index");
        deleteidx(a, 3);
        display(a);
        System.out.println();
        System.out.println("delete the head");
        deletehead(a);
      //  display(a);
	}

}
