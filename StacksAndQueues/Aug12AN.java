
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

class MyQueue {
    int capacity;
    int count;
    int front;
    int back;
    int[] arr;

    public MyQueue(int size) {
        this.capacity = size;
        this.count = 0;
        this.front = -1;
        this.back = -1;
        this.arr = new int[size];
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public boolean isFull() {
        return this.count == this.capacity;
    }

    public void enqueue(int data) {
        if (this.isFull()) {
            System.out.println("Queue is Full Can't Enqueue !!");
            return;
        }
        if (this.isEmpty()) {
            this.front = this.back = 0;
            this.arr[this.back] = data;
            this.count++;
            return;
        }
        this.back = (this.back + 1) % this.capacity;
        this.count++;
        this.arr[this.back] = data;
    }

    public int dequeue() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty Can't Dequeue");
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
            System.out.println("Queue is Empty Can't Peek !!");
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
        System.out.print("F->");
        for (int i = this.front; i < this.front + this.count; i++) {
            System.out.print(this.arr[i % this.capacity] + " ");
        }
        System.out.print("<-B");
        System.out.println();
    }
}

public class Aug12AN {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.pop();
        st.peek();
        st.size();
        st.isEmpty();
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(10); // ! Enqueue(10)
        q.poll(); // ! Dequeue()
        q.peek();
        q.size();
        q.isEmpty();
    }
}