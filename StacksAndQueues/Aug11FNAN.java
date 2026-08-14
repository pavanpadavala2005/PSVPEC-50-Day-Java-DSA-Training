
import java.util.*;

class MyCircularQueue {
    int capacity;
    int[] arr;
    int front;
    int back;
    int count;

    MyCircularQueue(int size) {
        this.capacity = size;
        this.arr = new int[size];
        this.front = -1;
        this.back = -1;
        this.count = 0;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public boolean isFull() {
        return this.count >= this.capacity;
    }

    public void enqueue(int data) {
        if (this.isEmpty()) {
            this.front = this.back = 0;
            this.arr[this.back] = data;
            this.count++;
            return;
        }
        if (this.isFull()) {
            System.out.println("Queue is Full Can't Enqueue !!");
            return;
        }
        this.back = (this.back + 1) % this.capacity;
        this.arr[this.back] = data;
        this.count++;
    }

    public int dequeue() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty Can't dequeue !!");
            return -1;
        }
        if (this.front == this.back) {
            int elem = this.arr[this.front];
            this.front = this.back = -1;
            this.count--;
            return elem;
        }
        int elem = this.arr[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.count--;
        return elem;
    }

    public int peek() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty can't Peek !!");
            return -1;
        }
        return this.arr[this.front];
    }

    public int size() {
        return this.count;
    }

    public void printQueue() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty Can't Print !!");
            return;
        }
        for (int i = this.front; i < this.front + this.count; i++) {
            System.out.print(this.arr[i % this.capacity] + " ");
        }
        System.out.println();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyDynamicStack {
    int count;
    Node ptr;

    MyDynamicStack() {
        this.count = 0;
        this.ptr = null;
    }

    public boolean isEmpty() {
        return this.ptr == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = this.ptr;
        this.ptr = newNode;
        this.count++;
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
        return ptr.data;
    }

    public int size() {
        return this.count;
    }

    public void printStack() {
        if (this.isEmpty()) {
            System.out.println("Stack is Empty Can't Print !!");
            return;
        }
        Node temp = this.ptr;
        while (temp != null) {
            System.out.println("|" + temp.data + "|");
            temp = temp.next;
        }

    }
}

class MyStack {
    int capacity;
    int[] arr;
    int ptr;

    public MyStack(int size) {
        this.capacity = size;
        this.arr = new int[size];
        this.ptr = -1;
    }

    public boolean isEmpty() {
        return this.ptr == -1;
    }

    public boolean isFull() {
        return this.ptr + 1 == this.capacity;
    }

    public void push(int data) {
        if (this.isFull()) {
            System.out.println("Stack is Full Can't Push Element");
            return;
        }
        this.ptr++;
        this.arr[this.ptr] = data;
    }

    public int pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is Empty Can't Pop");
            return -1;
        }
        int elem = this.arr[this.ptr];
        this.ptr--;
        return elem;
    }

    public int peek() {
        if (this.isEmpty()) {
            System.out.println("Stack is Empty No Peek !!");
            return -1;
        }
        return this.arr[this.ptr];
    }

    public int size() {
        return this.ptr + 1;
    }

    public void printStack() {
        if (this.isEmpty()) {
            System.out.println("Stack is Empty Can't Print !!");
            return;
        }
        System.out.println("|" + this.arr[this.ptr] + "|<-- Top");
        for (int i = this.ptr - 1; i >= 0; i--)
            System.out.println("|" + this.arr[i] + "|");
    }
}

public class Aug11FNAN {
    public static void main(String[] args) {
        MyCircularQueue mcq = new MyCircularQueue(5);
        mcq.enqueue(10);
        mcq.enqueue(20);
        mcq.enqueue(30);
        mcq.enqueue(40);
        mcq.enqueue(50);
        mcq.printQueue();

        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.pop();
        st.peek();
        st.size();
        st.isEmpty();
        st.clear();
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.poll();
        q.peek();
        q.size();
        q.isEmpty();
        q.clear();
    }
}