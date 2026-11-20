
public class doubly {
    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Linking nodes
        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        // Forward display
        Node temp = head;

        System.out.println("Forward:");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        // Backward display
        System.out.println("\nBackward:");

        temp = third;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}
