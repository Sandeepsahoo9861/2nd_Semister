public class Queue_Array_NonStatic {  // Outer class
    public class Queue {  // Non-static inner class
       static int arr[];
     static  int size;
        int rear;
        int front;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public boolean isFull() {
            return rear == arr.length - 1;
        }

        public String add(int data) {
            if (isFull()) {
                return "Index is full, you can't add";
            }
            rear++;
            arr[rear] = data;
            if (front == -1) {
                front = 0;
            }
            return "Added successfully";
        }

        public String remove() {
            if (isEmpty()) {
                return "Queue is empty";
            }
            front++;
            if (front > rear) {
                front = rear = -1;
            }
            return "Removed successfully";
        }

        public void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        // This will NOT work:
        // Queue ob = new Queue(4); // Compilation error: "Queue_Array.this cannot be referenced from a static context"

        // Correct way to instantiate a non-static inner class:
        Queue_Array_NonStatic outer = new Queue_Array_NonStatic();  // Create an instance of the outer class
        Queue_Array_NonStatic.Queue ob = outer.new Queue(4);  // Create an instance of the non-static inner class

        // Accessing methods of the Queue class
        System.out.println(ob.add(5));
        System.out.println(ob.add(7));
        System.out.println(ob.add(25));
        System.out.println(ob.remove());

        // Print the final state of the queue
        ob.printQueue();
    }
}
