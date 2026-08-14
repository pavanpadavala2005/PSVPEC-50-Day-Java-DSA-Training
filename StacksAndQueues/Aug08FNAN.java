public class Aug08FNAN {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue(5);
        mq.enqueue(10);
        mq.enqueue(20);
        mq.enqueue(30);
        mq.enqueue(40);
        mq.enqueue(50);
        mq.enqueue(60);
        mq.printQueue();
    }
}