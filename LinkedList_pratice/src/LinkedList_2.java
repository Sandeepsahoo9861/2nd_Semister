import java.util.Scanner;
public class LinkedList_2 {
    public static class Node {
        int data;
        Node next;
        Node(int data) {//from val the data will transfer to here it will store permanent value
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAtend(int val) {
            Node temp = new Node(val);//this val is transfered to data
                           //data value store in node and temp is creating the refference to that node  

            if (head == null) {
                head = temp; 
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }    
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);//You are creating a new node that contains the value val.
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;//we connected with temp with head;
                head = temp;//we made temp is head
            }
        }
        void insertAtanIndex(int idx ,int val) {
        	Node t=new Node(val);//here we made a new node t where we insert at any index
        	Node temp=head; 
        	if (idx ==size()) {// ***Important
        		insertAtend(val);//t.next=temp.next;->1 and  temp.next=t;->2
        		return;//in 1 temp.next is written after equal sign temp ke dusre node indicate Kar
        		       //raha hai but in 2 temp.next is wriiten before equal to sign which means
        	}           // temp ke agle node nehi temp ke aage connection kar raha hai
        	else if(idx ==0) {
        		insertAtHead(val);
        		return;
        	}
        	else if (idx<0 || idx> size()){//here we are providing the condition so we have to use 
        		System.out.println("wrong index");//else if other wise we use else only
        	}
        	for (int i=1;i<=idx-1;i++) {//from this it is used to add val at any index
        		temp=temp.next;//initially temp was pointing head means 0 index so temp is
        	}                  // is here 1 index first so (temp=temp.next)temp is idx-1 position
        	                   //we are traversing
        	t.next=temp.next;// t ka next node ko temp ke agle node ke sath jod diye
        	temp.next=t;// jo temp ka node tha usko t ke sath connect kiye
        }

        void display() {
            Node temp = head;//You initialize a temporary variable temp to the head of the list. 
            while (temp != null) {
                System.out.print(temp.data + " ->");
                temp = temp.next;
            }
           
        }
        void deleteAt(int idx) {
        	if (idx==0) {
        		head=head.next;
        		return;
        	}
        	Node temp=head;
        	for (int i=1;i<idx-1;i++) {//suppose we have link list 10->3->4->5->6->8,hum
        		                // 3 index ko delete karna hai so 
        		temp=temp.next;//temp 2 idx tak traverse karega(idx-1),idhar 2 idex 4 hai kyun ki
        	}                    // 0 index pe head already hai 
        	 temp.next=temp.next.next;// temp.next matlab 2 idx ko temp.next.next (4 index ke 
        	                           //sath connect kar diye ,it means 4 connects to 6
        }
         int getelement(int idx) {
        	Node temp=head;
        	for (int i=1;i<=idx;i++) {
        		temp=temp.next;
        	  
        		
        	}
        	return temp.data;
        	
        	
        }
        

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        LinkedList ll = new LinkedList();
        ll.insertAtend(4);
        ll.insertAtend(5);
        ll.display();
        System.out.println();
       
        ll.insertAtHead(13);
        System.out.print("Displaying final liked list");
        ll.display();
        System.out.println();
       // ll.size();
        System.out.println( "size is"+" "+ll.size());
        System.out.println("enter the index and value");
        int idex=sc.nextInt();
        int valu=sc.nextInt();
        ll.insertAtanIndex(idex,valu );
        ll.display();
        System.out.println();
        System.out.print("enter the  index to get element");
        int index=sc.nextInt();
         ll.getelement(index);
         System.out.print( ll.getelement(index));
         System.out.println();
       //  System.out.println("Delete at index");
       //  ll.deleteAt(2);
         
        
    }
}
