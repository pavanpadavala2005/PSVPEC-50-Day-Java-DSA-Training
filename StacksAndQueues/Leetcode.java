import java.util.*;

class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        this.q1 = new ArrayDeque<>();
        this.q2 = new ArrayDeque<>();
    }

    public void push(int x) {
        this.q1.offer(x);
    }

    public int pop() {
        if (this.empty())
            return -1;
        while (!this.q1.isEmpty() && this.q1.size() > 1)
            this.q2.offer(this.q1.poll());
        int elem = this.q1.poll();
        Queue<Integer> temp = this.q1;
        this.q1 = this.q2;
        this.q2 = temp;
        return elem;
    }

    public int top() {
        while (!this.q1.isEmpty() && this.q1.size() > 1) {
            int elem = this.q1.poll();
            this.q2.offer(elem);
        }
        int elem = this.q1.poll();
        this.q2.offer(elem);
        Queue<Integer> temp = this.q1;
        this.q1 = this.q2;
        this.q2 = temp;
        return elem;
    }

    public boolean empty() {
        return this.q1.isEmpty();
    }
}

public class Leetcode {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(10);
        ms.push(20);
        ms.push(30);
        ms.push(40);
        System.out.println(ms.empty());
        System.out.println(ms.q1);
    }
}
