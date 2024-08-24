class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Reverse_recursion{
    static void reversePrint(Node p) { 
        if (p == null) {
            return;
        }
        reversePrint(p.next);
        System.out.print(p.data + " ");
    }

    public static void main(String[] args) {
        // Example usage
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.next = third;

        reversePrint(head);
    }
}
