public class Testing {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };
        for (int x : arr) {
            x = x + 5;
        }
        System.out.println(arr[1]);
    }
}