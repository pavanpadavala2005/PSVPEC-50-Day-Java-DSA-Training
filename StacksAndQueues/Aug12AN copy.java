import java.util.*;

public class Aug12AN {
    public static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int elem = -1;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[i]) {
                    elem = nums[j];
                    break;
                }
            }
            res[i] = elem;
        }
        return res;
    }

    public static int[] nextGreaterElementOprimal(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        res[n - 1] = -1;
        st.push(nums[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() < nums[i])
                st.pop();
            res[i] = st.peek();
            st.push(nums[i]);
        }
        return res;
    }

    public static ArrayList<Integer> nge(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        res.addFirst(-1);
        st.push(nums[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() < nums[i])
                st.pop();
            if (st.isEmpty())
                res.addFirst(-1);
            else
                res.addFirst(st.peek());
            st.push(nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 4;
        int start = 3;
        for (int i = 0; i < n; i++)
            System.out.println(start + (2 * i));
    }
}
