
public class circ {
    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Linking nodes
        head.next = second;
        second.next = third;
        third.next = head;

        // Display
        Node temp = head;

        System.out.println("Circular Linked List:");

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
