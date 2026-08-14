import java.util.ArrayList;
import java.util.Stack;

class Node {
    int data; // ! Data Part
    Node next; // ! Link Part to the next Node

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

public class July22FN {
    public static void main(String[] args) {
        Node head = getHead(new int[] { 1, 2, 3, 4, 5, 6 });
        Node res = reverseList(head);
        System.out.println(getList(res));
    }

    public static boolean isPlaindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
    }

    public static Node reverseList(Node head) {
        Stack<Integer> vals = new Stack<>();
        Node temp = head;
        while (temp != null) {
            vals.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            temp.data = vals.pop();
            temp = temp.next;
        }
        return head;
    }

    public static Node findMiddle(Node head) {
        Node temp = head;
        int n = 0;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        int m = n / 2;
        temp = head;
        int ctr = 0;
        while (temp != null) {
            if (ctr == m)
                break;
            ctr++;
            temp = temp.next;
        }
        return temp;
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