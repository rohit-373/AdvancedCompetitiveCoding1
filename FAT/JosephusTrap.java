import java.util.*;

public class JosephusTrap {
    static int josephus(int n, int k) {
        if (n == 1) return 0;
        return (josephus(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = josephus(n, k) + 1; // +1 for 1-based indexing
        System.out.println(ans);
    }
}