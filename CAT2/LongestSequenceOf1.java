import java.util.*;

public class LongestSequenceOf1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxCount = -1000;
        int replacement = 0;
        int start = 0;
        for (int end = 0; end < n; end++) {
            if (arr[end] == 0) {
                replacement++;
            }
            while (replacement > k) {
                if (arr[start] == 0) {
                    replacement--;
                }
                start++;
            }
            maxCount = Math.max(maxCount, end - start + 1);
        }
        System.out.println(maxCount);
    }
} // 1 1 0 1 1 1 0 1 1 1 1
//         s
//                       e