import java.util.ArrayList;
import java.util.Stack;

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

public class July22AN {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 9, 9, 9, 9 };
        int[] nums2 = new int[] { 9, 9, 9, 9, 9, 9, 9 };
        Node head1 = getHead(nums1);
        Node head2 = getHead(nums2);
        System.out.println(getList(addNumbers(head1, head2)));
    }

    public static Node addNumbers(Node l1, Node l2) {
        Node dummy = new Node();
        Node temp = dummy;
        Node i = l1;
        Node j = l2;
        int carry = 0;
        int sum = 0;
        while (i != null || j != null || carry > 0) {
            if (i != null) {
                sum += i.data;
                i = i.next;
            }
            if (j != null) {
                sum += j.data;
                j = j.next;
            }
            sum += carry;
            carry = sum / 10;
            sum = sum % 10;
            temp.next = new Node(sum);
            temp = temp.next;
            sum = 0;
        }
        return dummy.next;
    }
    // * Leetcode Style
    // public static void addNumbers(Node l1, Node l2) {
    // ArrayList<Integer> list1 = new ArrayList<>();
    // ArrayList<Integer> list2 = new ArrayList<>();
    // Node temp1 = l1;
    // while (temp1 != null) {
    // list1.add(temp1.data);
    // temp1 = temp1.next;
    // }
    // Node temp2 = l2;
    // while (temp2 != null) {
    // list2.add(temp2.data);
    // temp2 = temp2.next;
    // }
    // ArrayList<Integer> res = new ArrayList<>();
    // int carry = 0;
    // int sum = 0;
    // int i = list1.size() - 1;
    // int j = list2.size() - 1;
    // while (i >= 0 || j >= 0 || carry > 0) {
    // if (i >= 0) {
    // sum += list1.get(i);
    // System.out.println("1");
    // i--;
    // }
    // if (j >= 0) {
    // sum += list2.get(j);
    // j--;
    // }
    // sum += carry;
    // carry = sum / 10;
    // sum = sum % 10;
    // res.addFirst(sum);
    // }
    // Node curr = new Node();
    // Node temp = curr;
    // for (int val : res) {
    // temp.next = new Node(val);
    // temp = temp.next;
    // }
    // return curr.next;
    // }

    public static boolean isPalindrome(Node head) {
        // ! 1 find The middle
        System.out.println(getList(head));
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // ! Reverse Remaining Part
        System.out.println(getList(slow));
        Node prev = null;
        Node temp = slow;
        Node after = slow;
        while (temp != null) {
            after = temp.next;
            temp.next = prev;
            prev = temp;
            temp = after;
        }
        System.out.println(getList(prev));
        while (prev != null) {
            if (head.data != prev.data)
                return false;
            head = head.next;
            prev = prev.next;
        }
        return true;
    }

    public static Node reverseLinkedList(Node head) {

        Stack<Integer> elems = new Stack<>();
        Node temp = head;
        while (temp != null) {
            elems.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            temp.data = elems.pop();
            temp = temp.next;
        }
        return temp;
    }

    public static Node findMiddle(Node head) {
        int n = 0;
        Node temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        int m = (n / 2) + 1;
        temp = head;
        int ctr = 1;
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