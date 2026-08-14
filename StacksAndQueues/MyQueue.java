
public class MyQueue {
    int capacity;
    int[] arr;
    int st;
    int ed;
    int count;

    public MyQueue(int size) {
        this.capacity = size;
        this.arr = new int[size];
        this.st = -1;
        this.ed = -1;
        this.count = 0;
    }

    // * ========== UTILITY METHODS ===========
    public boolean isEmpty() {
        if (this.st == -1 && this.ed == -1)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (this.count >= this.capacity)
            return true;
        else
            return false;
    }

    // ! ============== METHODS ==========
    public void enqueue(int data) {
        if (this.isFull()) {
            System.out.println("Queue is Full Can't Enqueue !!");
            return;
        }
        if (this.isEmpty()) {
            this.st = this.ed = 0;
            this.arr[this.ed] = data;
            this.count++;
            return;
        }
        this.ed++;
        this.count++;
        this.arr[this.ed % this.capacity] = data;
    }

    public int dequeue() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty Can't Dequeue !!");
            return -1;
        }
        if (this.st == this.ed) {
            int elem = this.arr[this.st];
            this.ed = this.st = -1;
            this.count--;
            return elem;
        }
        int elem = this.arr[this.st];
        this.st++;
        this.count--;
        return elem;
    }

    public void printQueue() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty Can't Print !!");
            return;
        }
        for (int i = this.st; i < this.count + this.st; i++) {
            System.out.print("|" + this.arr[i % this.capacity] + "|");
        }
    }

}
