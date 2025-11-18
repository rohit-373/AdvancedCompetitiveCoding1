import java.util.*;

public class MazeSolving {
    static boolean isSafe(int[][] maze, int x, int y) {
        int n = maze.length;
        int m = maze[0].length;
        return (x < n && y < m && maze[x][y] == 1);
    }
    /**
     * maze = [[1 0 1 0 0],
     *         [1 1 1 1 0],
     *         [0 0 0 1 1]] n = 3, m = 5, x = 1, y = 4
     */
    static boolean solveMaze(int[][] maze, int x, int y, int[][] sol) {
        int n = maze.length;
        int m = maze[0].length;

        if (x == n - 1 && y == m - 1) {
            sol[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y)) {
            sol[x][y] = 1;

            if (solveMaze(maze, x + 1, y, sol) == true)
                return true;

            if (solveMaze(maze, x, y + 1, sol) == true)
                return true;

            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] maze = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        int[][] sol = new int[n][m];
        if (solveMaze(maze, 0, 0, sol)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(sol[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution");
        }
    }
}