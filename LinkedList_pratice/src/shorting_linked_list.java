public class shorting_linked_list {
    static class Node {
        int mark;
        Node next;

        Node(int mark) {
            this.mark = mark;
            this.next = null;
        }
    }

    static Node sortLinkedList(Node start) {//{here returing type is node so we write static Node
        Node p1, p2;                   //example-int sortLinkedList(int start)
        int temp;

        for (p1 = start; p1 != null; p1 = p1.next) {
            for (p2 = p1.next; p2 != null; p2 = p2.next) {
                if (p1.mark > p2.mark) {
                    temp = p1.mark;
                    p1.mark = p2.mark;
                    p2.mark = temp;
                }
            }
        }  //after swapping we 1-3-5-8 (the adress will remain same after swaping start will
        return start;//indicate 1 return start it will return adress of 1
    }

    public static void main(String[] args) {
        // Creating a sample linked list
        Node start = new Node(5);
        start.next = new Node(3);
        start.next.next = new Node(8);
        start.next.next.next = new Node(1);

        // Printing original linked list
        System.out.println("Original linked list:");  
        printLinkedList(start);

        // Sorting the linked list
        start = sortLinkedList(start);

        // Printing sorted linked list
        System.out.println("\nLinked list after sorting:");
        printLinkedList(start);
    }

    static void printLinkedList(Node start) {
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.mark + " ");//it will print 1 then 3print ,then 5print
            temp = temp.next;//temp==start so temp.next=3,thentemp.next is 5
        }
        System.out.println();
    }
}
