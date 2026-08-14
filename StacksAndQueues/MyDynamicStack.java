class Node {
    int data; // ! Data Part
    Node next; // ! Link Part to the next Node

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyDynamicStack {
    Node ptr;
    int count;

    public MyDynamicStack() {
        this.ptr = null;
        this.count = 0;
    }

    // * ============= UTILITY FUNCTIONS =============
    public boolean isEmpty() {
        return this.ptr == null;
    }

    // ! ============ OPERATIONS ==============
    public void push(int data) {
        Node newNode = new Node(data);
        this.count++;
        if (this.isEmpty()) {
            this.ptr = newNode;
            return;
        }
        newNode.next = this.ptr;
        this.ptr = newNode;
    }

    public int pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is Empty Can't Pop !!");
            return -1;
        }
        int elem = this.ptr.data;
        this.ptr = this.ptr.next;
        this.count--;
        return elem;
    }

    public int peek() {
        if (this.isEmpty()) {
            System.out.println("Stack is Empty Can't Peek !!");
            return -1;
        }
        return this.ptr.data;
    }
}
