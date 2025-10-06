
public class MaxEquilibriumSum {
    static int maxEquilibriumSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];
        prefixSum[0] = arr[0];
        suffixSum[n - 1] = arr[n - 1];
        int maxSum = 0;
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];
        }
        for (int i = 0; i < n; i++) {
            if (suffixSum[i] == prefixSum[i])
                maxSum = Math.max(maxSum, prefixSum[i]);   
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 5, 3, 1, 2, 6, -4, 2};
        System.out.println("Maximum equilibrium sum: " + maxEquilibriumSum(nums)); // Output: 10
    }
}


/**
 * a   = -3 5 
 * cf  = -2 3   6 9 11 17 13 15
 * rcf = 15 17 12 9 6  4  -2 2
 */