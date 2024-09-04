
public class LL_apnaCollage {
Node head;
	 class  Node{
		String data;
		Node next;
		
		
		Node(String data){
			this.data=data;
			this.next=null;//// Initialize the next reference to null, indicating the end of the list
		}
		
	}
	public void addfirst( String data) {
		Node newNode=new Node(data);//data will goes to newNode 
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	public void addLast(String data) {
	Node newNode= new Node(data);
	if(head==null) {
		head=newNode;
		return;
	}
	Node currNode=head;
	while(currNode.next!=null) {
		currNode=currNode.next;
		
	}
	currNode.next=newNode;
}
	public void printlist() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode=head;
		while (currNode!= null) {
			System.out.print(currNode.data +"->");
			currNode=currNode.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL_apnaCollage list=new LL_apnaCollage();
		list.addfirst("a");
		list.addfirst("b");
		list.addfirst("Pikun");
		list.addfirst("Sandeep");
		list.printlist();
		

	}

}
