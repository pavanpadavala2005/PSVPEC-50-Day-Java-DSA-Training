
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyDynamicQueue {
    Node front;
    Node back;
    int count;

    public MyDynamicQueue() {
        this.front = this.back = null;
        this.count = 0;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (this.isEmpty()) {
            this.front = this.back = newNode;
            this.count++;
            return;
        }
        this.back.next = newNode;
        this.back = newNode;
        this.count++;
    }

    public int dequeue() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty Can't Dequeue !!");
            return -1;
        }
        int elem = this.front.data;
        if (this.front == this.back) {
            this.front = this.back = null;
            this.count--;
            return elem;
        }
        front = front.next;
        this.count--;
        return elem;
    }

    public int peek() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty Can't Peek !!");
            return -1;
        }
        return this.front.data;
    }

    public int size() {
        return this.count;
    }

    public void printQueue() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty Can't Print !!");
            return;
        }
        Node temp = this.front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}

public class Aug12FN {
    public static void main(String[] args) {
        MyDynamicQueue mdq = new MyDynamicQueue();
        mdq.enqueue(10);
        mdq.enqueue(20);
        mdq.enqueue(30);
        mdq.enqueue(40);
        mdq.printQueue();
    }
}