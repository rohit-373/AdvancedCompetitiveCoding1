import java.util.*;

public class WarnsDorffsAlgorithm {

    static int[] moveX = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] moveY = {1, 2,  2,  1, -1, -2, -2, -1};

    static boolean isSafe(int x, int y, int[][] board, int N) {
        return (x >= 0 && x < N && y >= 0 && y < N && board[x][y] == -1);
    }

    static boolean solveKnightTourUtil(int x, int y, int moveCount, int[][] board, int N) {
        if (moveCount == N * N)
            return true;

        for (int i = 0; i < 8; i++) {
            int nextX = x + moveX[i];
            int nextY = y + moveY[i];

            if (isSafe(nextX, nextY, board, N)) {
                board[nextX][nextY] = moveCount;

                if (solveKnightTourUtil(nextX, nextY, moveCount + 1, board, N))
                    return true;

                board[nextX][nextY] = -1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] board = new int[N][N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                board[i][j] = -1;

        board[0][0] = 0;

        if (solveKnightTourUtil(0, 0, 1, board, N)) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)
                    System.out.printf("%3d ", board[i][j]);
                System.out.println();
            }
        }
    }

}
