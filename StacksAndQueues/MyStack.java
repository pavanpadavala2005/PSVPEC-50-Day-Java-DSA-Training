public class MyStack {
    int size;
    int[] arr;
    int ptr;

    public MyStack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.ptr = -1;
    }

    // * =========== UTILITY FUNCTIONS ===========
    public boolean isEmpty() {
        if (this.ptr == -1)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (this.ptr >= this.size - 1)
            return true;
        else
            return false;
    }

    // * =========== OPERATIONS ===========
    public void push(int data) {
        if (this.isFull()) {
            System.out.println("Stack is Full Can't Push !!");
            return;
        }
        this.ptr++;
        this.arr[this.ptr] = data;
    }

    public int pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is Empty Can't Pop !!");
            return -1;
        }
        int elem = this.arr[this.ptr];
        this.ptr--;
        return elem;
    }

    public int peek() {
        if (this.isEmpty()) {
            System.out.println("Stack is Empty Can't Peek !!");
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
        for (int i = this.ptr; i >= 0; i--) {
            System.out.println("|" + this.arr[i] + "|");
        }
    }
}
