//stack using Linked List
public class StackLL {
     static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head = null;//If Node is non-static: The methods that interact
                                    // with it should also be non-static
                                  //If Node is static: You can freely use it inside static methods
                                  
         public  void push(int data) {//a static member, like Node, can be used in a 
                                       //non-static method.
        	 Node newNode = new Node(data);

            if(head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static boolean isEmpty() {
            return head == null;
        }

        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;
        }

        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            Node top = head;
            return top.data;
        }
    }

    public static void main(String args[]) {
       // Stack stack = new Stack();//it is possible because main method and 
                                 // static inner class(Stack) both are present inside the same
    	                        // class called StackLL
    	StackLL.Stack stack = new StackLL.Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}