public class Hello {
    public static void main(String[] args) {
        System.out.println(maxProductSubArray(new int[] { 1, 2, -3, 0, -4, -5 }));
    }

    public static int maxProductSubArray(int[] nums) {
        int maxProduct = 1;
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            maxProduct = Math.max(maxProduct, product);
            product = Math.max(product, 1);
        }
        maxProduct = Math.max(maxProduct, product);
        return maxProduct;
    }

    public static void  rec(){
        
    }
}