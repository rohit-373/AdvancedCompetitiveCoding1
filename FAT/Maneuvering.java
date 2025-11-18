import java.util.*;

public class Maneuvering {
    static int numOfPaths(int n, int m) {
        if (n == 1 || m == 1)
            return 1;
        return numOfPaths(n - 1, m) + numOfPaths(n, m - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = numOfPaths(n, m);
        System.out.println(ans);
    }
}