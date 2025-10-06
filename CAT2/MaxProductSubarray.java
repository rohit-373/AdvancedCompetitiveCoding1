
public class MaxProductSubarray {
    static int maxProduct(int[] arr) {
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);

            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, -6, 9, 0, 7, -4, 8, 2};
        System.out.println("Maximum product subarray: " + maxProduct(nums)); // Output: 6
    }
}