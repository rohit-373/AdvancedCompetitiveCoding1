import java.util.*;

public class MaximumSumOfHourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int maxSum = -1000;

        for (int i = 0; i < r-2; i++) {
            for (int j = 0; j < c-2; j++) {
                int currentSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                               + arr[i + 1][j + 1]
                               + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        System.out.println(maxSum);
    }
}