import java.util.*;

public class ExtendedEuclidAlgorithm {
    static int gcdExtended(int a, int b, int[] x, int[] y) {
        if (a == 0) {
            x[0] = 0;
            y[0] = 1;
            return b;
        }

        int[] x1 = {0}, y1 = {0};
        int gcd = gcdExtended(b%a, a, x1, y1);

        x[0] = y1[0] - (b/a) * x1[0];
        y[0] = x1[0];
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] x = {1}, y = {1};
        int ans = gcdExtended(a, b, x, y);
        System.out.println(ans+" "+x[0]+" "+y[0]);
    }
}