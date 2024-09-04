public class Queue_Array {  // Outer class
    public static class Queue {  // Static inner class
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;  // Corrected isEmpty method
        }

        public static boolean isFull() {
            return rear == arr.length - 1;
        }

        public static String add(int data) {
            if (isFull()) {
                System.out.println("Index is full");
                return "Index is full, you can't add";
            }
            rear++;
            arr[rear] = data;
            if (front == -1) {
                front = 0;
            }
            return "Added successfully";
        }

        public static String remove() {
            if (isEmpty()) {
                return "Queue is empty";
            }
            front++;
            if (front > rear) {
                front = rear = -1;
            }
            return "Removed successfully";
        }

        // Method to print the queue
        public static void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(); // New line after printing the queue
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the static inner class Queue
        Queue_Array.Queue ob = new Queue_Array.Queue(4);
        // OR
       // Queue ob = new Queue(4);//as main method and static class both are inside the
                                  //we can write in this way too

        // Accessing methods of the Queue class
        System.out.println(ob.add(5));
        System.out.println(ob.add(7));
        System.out.println(ob.add(25));
        System.out.println(ob.remove());

        // Print the final state of the queue
        ob.printQueue();
    }
}
