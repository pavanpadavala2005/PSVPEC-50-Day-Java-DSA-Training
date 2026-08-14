class Node {
    Node prev;
    int data;
    Node next;

    Node(int data) {
        this.prev = null;
        this.data = data;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (this.head == null && this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        newNode.next = this.head;
        this.head.prev = newNode;
        this.head = newNode;
        class Node {
            Node prev;
            int data;
            Node next;

            Node(int data) {
                this.prev = null;
                this.data = data;
                this.next = null;
            }
        }
    }

    public void printLL() {
        if (this.head == null) {
            System.out.println("Linked List is Empty !!");
            return;
        }
        Node temp = this.head;
        System.out.println();
        System.out.print("NULL<-");
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
        System.out.println();
    }

}

public class July18AN {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtFront(100);
        dll.insertAtFront(200);
        dll.printLL();
    }
}
