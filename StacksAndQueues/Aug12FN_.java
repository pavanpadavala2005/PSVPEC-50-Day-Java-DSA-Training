class Node {
    Node prev;
    int data;
    Node next;

    public Node(int data) {
        this.prev = null;
        this.data = data;
        this.next = null;
    }

}

class MyDequeue {
    Node front;
    Node back;
    int count;

    public MyDequeue() {
        this.front = this.back = null;
        this.count = 0;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public void enqueueBack(int data) {
        Node newNode = new Node(data);
        if (this.isEmpty()) {
            this.front = this.back = newNode;
            this.count++;
            return;
        }
        newNode.prev = this.back;
        this.back.next = newNode;
        this.back = newNode;
        this.count++;
    }

    public void enqueueFront(int data) {
        Node newNode = new Node(data);
        if (this.isEmpty()) {
            this.front = this.back = newNode;
            this.count++;
            return;
        }
        newNode.next = this.front;
        this.front.prev = newNode;
        this.front = newNode;
        this.count++;
    }

    public int dequeueFront() {
        if (this.isEmpty()) {
            System.out.println("Dequeue is Empty Can't DqueueFront");
            return -1;
        }
        int elem = this.front.data;
        if (this.front == this.back) {
            this.front = this.back = null;
            this.count--;
            return elem;
        }
        this.front = this.front.next;
        this.front.prev = null;
        this.count--;
        return elem;
    }

    public int dequeueBack() {
        if (this.isEmpty()) {
            System.out.println("Dequeue is Empty Can't DqueueBack");
            return -1;
        }
        int elem = this.back.data;
        if (this.front == this.back) {
            this.front = this.back = null;
            this.count--;
            return elem;
        }
        this.back = this.back.prev;
        this.back.next = null;
        this.count--;
        return elem;
    }

    public void printDeQueue() {
        if (this.isEmpty()) {
            System.out.println("Dequeue is Empty Can't Print !!");
            return;
        }
        Node temp = this.front;
        System.out.print("F-> ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("<-B");
        System.out.println();
    }

    public int peekFront() {

    }

    public int peekBack() {

    }

    public int size() {

    }
}

public class Aug12FN_ {
    public static void main(String[] args) {
        MyDequeue mdq = new MyDequeue();
        mdq.enqueueBack(10);
        mdq.enqueueBack(20);
        mdq.enqueueBack(30);
        mdq.enqueueFront(100);
        mdq.enqueueFront(200);
        mdq.dequeueBack();
        mdq.dequeueFront();
        mdq.printDeQueue();
    }
}