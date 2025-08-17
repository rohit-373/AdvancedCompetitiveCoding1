import java.util.*;

class RemainderThm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] m = new int[n];
        int M = 1;
        int x = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
            M *= m[i];
        }

        for (int i = 0; i < n; i++) {
            int Mi = M/m[i];
            int Minv;
            for (int j = 1; j < m[i]; j++) {
                if ((Mi*j)%m[i] == 1) {
                    Minv = j;
                    break;
                }
            }
            x += a[i] * Minv * Mi;
        }
        x = x % M;

        System.out.println(x);
    }
}