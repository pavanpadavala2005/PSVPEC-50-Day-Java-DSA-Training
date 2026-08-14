// ! ============== NODE FOR SINGLY LINKED LIST CLASS =====================
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// ! ============== LINKED LIST CLASS =====================
class MyLinkedList {
    Node head;

    public MyLinkedList() {
        this.head = null;
    }

    // ! ======================== INSERT OPERATIONS ========================
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertAfterNode(int node, int data) {
        if (this.head == null) {
            System.out.println("Linked List is Empty !!");
            return;
        }
        if (this.head.data == node) {
            Node newNode = new Node(data);
            this.head.next = newNode;
            return;
        }
        Node temp = this.head;
        while (temp != null) {
            if (temp.data == node)
                break;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Node Not found !!");
            return;
        }
        if (temp.next == null) {
            Node newNode = new Node(data);
            temp.next = newNode;
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // ! ======================== DELETE OPERATIONS ========================
    public void deleteAtFront() {
        if (this.head == null) {
            System.out.println("Linked List is Empty !! Can't Delete Front");
            return;
        }
        if (this.head.next == null) {
            this.head = null;
            return;
        }
        this.head = this.head.next;
    }

    public void deleteAtEnd() {
        if (this.head == null) {
            System.out.println("Linked List is Empty !! Can't Delete Front");
            return;
        }
        if (this.head.next == null) {
            this.head = null;
            return;
        }
        Node temp = this.head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteByValue(int target) {
        if (this.head == null) {
            System.out.println("Linked List is Empty !! Can't Delete By Value");
            return;
        }
        if (this.head.data == target && this.head.next == null) {
            this.head = null;
            return;
        }
        if (this.head.data == target) {
            this.head = this.head.next;
            return;
        }
        Node temp = this.head;
        while (temp != null) {
            if (temp.next != null && temp.next.data == target)
                break;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Target Not found !!");
            return;
        }
        temp.next = temp.next.next;
    }

    public int lenghtOfLinkedList() {
        if (this.head == null)
            return 0;
        Node temp = this.head;
        int ctr = 0;
        while (temp != null) {
            temp = temp.next;
            ctr++;
        }
        return ctr;
    }

    public void printLL() {
        if (this.head == null) {
            System.out.println("Linked List is Empty !!");
            return;
        }
        Node temp = this.head;
        System.out.println();
        System.out.print("HEAD-->");
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
        System.out.println();
    }
}

// ! ============== MAIN CLASS =====================

public class July18FNAN {
    public static void main(String[] args) {
    }
}
