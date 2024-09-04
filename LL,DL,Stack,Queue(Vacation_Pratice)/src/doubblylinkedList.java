public class doubblylinkedList {  
  
    
	 Node head, tail =null;//head and tail are declare as null globally so it can work properly  
                    // according to (26) line condition and it get's update too when the condition 
    class Node{ // is not true and it works according to line (34)
    	 
        int data;  // another reason there is one head and one tail(in a doublylinkedlist) that's why they are in 
        Node previous; //doubblylinkedList class although they are object of Node,but data,previous 
        Node next;//next are deal with with every node so they are Node class 
        
  
        public Node(int data) { 
            this.data = data;  
        }  
    }                 //.next,.previous those thing should present inside Node class
  
     
  
    //addNode() will add a node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //If list is empty  
        if(head == null) {  
            //Both head and tail will point to newNode  
            head = tail = newNode;  
            //head's previous will point to null  
            head.previous =null;  
            //tail's next will point to null, as it is the last node of the list  
            tail.next = null;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode's previous will point to tail  
            newNode.previous = tail;  
            //newNode will become new tail  
            tail = newNode;  
            //As it is last node, tail's next will point to null  
            tail.next = null;  
        }  
    }  
  
    //display() will print out the nodes of the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Prints each node by incrementing the pointer.  
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
  
    public static void main(String[] args) {  
  
    	doubblylinkedList dList = new doubblylinkedList();  
        //Add nodes to the list  
        dList.addNode(1);  
        dList.addNode(2);  
        dList.addNode(3);  
        dList.addNode(4);  
        dList.addNode(5);  
  
        //Displays the nodes present in the list  
        dList.display();  
    }  
}  
  //The head and tail are global to the list, while previous and next are local to each node.
//Node head and Node tail in the doubblylinkedList Class: These are references to Node
//objects that represent the start and end of the list. They are not fields within the Node class
//itself but are fields within the doubblylinkedList class.
//previous and next are local to each Node because they only manage the connections between that
//node and its neighbors.