import java.util.*;

class RemainderThm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] m = new int[n];
        int p = 1;
        int x = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
            p *= m[i];
        }

        for (int i = 0; i < n; i++) {
            int M = p/m[i];
            int inv = 1;
            for (int j = 1; j < m[i]; j++) {
                if ((M*j)%m[i] == 1) {
                    inv = j;
                    break;
                }
            }
            x += a[i] * inv * M;
        }
        x = x % p;
        
        System.out.println(x);
    }
}