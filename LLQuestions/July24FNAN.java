import java.util.*;

class Node {
    int data; // ! Data Part
    Node next; // ! Link Part to the next Node

    public Node() {
        this.data = -1;
        this.next = null;
    }

    public Node(int data) {

        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // ! ============== HELPER FUNCTIONS FOR LINKED LIST =============
    private boolean isEmpty() {
        return this.head == null;
    }

    // ! ============== OPERATIONS FOR LINKED LIST =============

    // **************** INSERTION ****************

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (this.isEmpty()) {
            this.head = newNode;
            return;
        }
        Node temp = this.head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    public void printList() {
        if (this.isEmpty()) {
            System.out.println("LinkedList is Empty !!");
            return;
        }
        System.out.print("HEAD-->");
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("NULL" + "\n");
    }
}

public class July24FNAN {
    public static void main(String[] args) {
        // ! Testing Area
        Node h1 = getHead(new int[] { 2, 4, 9 });
        Node h2 = getHead(new int[] { 5, 6, 4, 9 });
        Node res = addTwoNumbersOptimal(h1, h2);
        System.out.println(getList(res));
    }

    // * Leet Code
    public static Node addTwoNumbersOptimal(Node l1, Node l2) {
        Node dummy = new Node();
        Node temp = dummy;
        int sum = 0;
        int carry = 0;
        Node temp1 = l1;
        Node temp2 = l2;
        while (temp1 != null || temp2 != null || carry > 0) {
            if (temp1 != null) {
                sum += temp1.data;
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                sum += temp2.data;
                temp2 = temp2.next;
            }
            sum += carry;
            Node newNode = new Node(sum % 10);
            temp.next = newNode;
            temp = temp.next;
            carry = sum / 10;
            sum = 0;
        }
        return dummy.next;
    }

    public static Node addTwoNumbers(Node l1, Node l2) {
        long n1 = 0;
        Node temp1 = l1;
        while (temp1 != null) {
            n1 = n1 * 10 + temp1.data;
            temp1 = temp1.next;
        }
        long n2 = 0;
        Node temp2 = l2;
        while (temp2 != null) {
            n2 = n2 * 10 + temp2.data;
            temp2 = temp2.next;
        }
        long res = n1 + n2;
        Node dummy = new Node();
        Node temp = dummy;
        while (res > 0) {
            long last = (long) res % 10;
            Node newNode = new Node((int) last);
            temp.next = newNode;
            temp = temp.next;
            res = res / 10;
        }
        return dummy.next;
    }

    // ! ================ UTILITY METHODS =================
    public static Node getHead(int[] nums) {
        SinglyLinkedList sll = new SinglyLinkedList();
        for (int i : nums)
            sll.insertAtTail(i);
        return sll.head;
    }

    public static Node getNode(Node head, int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target)
                break;
            temp = temp.next;
        }
        return temp;
    }

    public static ArrayList getList(Node head) {
        ArrayList<Integer> res = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            res.add(temp.data);
            temp = temp.next;
        }
        return res;
    }

}
