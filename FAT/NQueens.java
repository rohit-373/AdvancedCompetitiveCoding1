import java.util.*;

public class NQueens {
    static boolean isSafe(char board[][], int row, int col) {
        int i, j;

        // vertical up
        i = row;
        while (i >= 0) {
            if (board[i][col] == 'Q')
                return false;
            i--;
        }

        // diagonal left up
        i = row;
        j = col;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q')
                return false;
            i--;
            j--;
        }
        
        // diagonal right up
        i = row;
        j = col;
        while (i >= 0 && j < board.length) {
            if (board[i][j] == 'Q')
                return false;
            i--;
            j++;
        }

        return true;
    }

    static void solveNQueens(char board[][], int row) {
        int N = board.length;
        if (row == N) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q'; // place queen
                solveNQueens(board, row + 1);
                board[row][col] = '-'; // backtrack
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '-';
            }
        }
        solveNQueens(board, 0);
    }
}