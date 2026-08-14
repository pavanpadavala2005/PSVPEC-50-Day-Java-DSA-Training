import java.util.Random;

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

class DoublyLinedList {
    Node head;
    Node tail;

    public DoublyLinedList() {
        this.head = null;
        this.tail = null;
    }

    // ! ================ INSERTION ===========
    public void insertAtFront(int data) {
        if (this.head == null && this.tail == null) {
            Node newNode = new Node(data);
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head.prev = newNode;
        this.head = newNode;
    }

    public void insertAtBack(int data) {
        if (this.head == null && this.tail == null) {
            Node newNode = new Node(data);
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        Node newNode = new Node(data);
        newNode.prev = this.tail;
        tail.next = newNode;
        this.tail = newNode;
    }

    public void insertAfter(int target, int data) {
        if (this.head == null && this.tail == null) {
            System.out.println("Linked List is Empty !!");
            return;
        }
        if (this.head.next == null && this.head.data == target) {
            Node newNode = new Node(data);
            newNode.prev = this.head;
            this.head.next = newNode;
            this.tail = newNode;
        }
        Node temp = this.head;
        while (temp != null) {
            if (temp.data == target)
                break;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Target Not found !!");
            return;
        }
        if (temp.next == null) {
            Node newNode = new Node(data);
            newNode.prev = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next.prev = newNode;
        newNode.prev = temp;
        temp.next = newNode;
    }

    public void printLL() {
        if (this.head == null) {
            System.out.println("Linked List is Empty !!");
            return;
        }
        Node temp = this.head;
        System.out.println();
        System.out.print("NULL<->");
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
        System.out.println();
    }
}

public class July20FN {
    public static int[] getRandomIdx() {
        Random rn = new Random();
        return new int[] {};
    }

    public static void main(String[] args) {
        DoublyLinedList dll = new DoublyLinedList();
        dll.insertAtBack(100);
        dll.insertAtBack(200);
        dll.insertAtBack(300);
        dll.insertAfter(200, 1000);
        dll.printLL();
    }
}