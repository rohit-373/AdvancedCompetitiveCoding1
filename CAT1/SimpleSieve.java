import java.util.*;

public class SimpleSieve {
    static ArrayList<Integer> simpleSieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> primes = simpleSieve(n);
        for (int i = 0; i < primes.size(); i++) {
            System.out.print(primes.get(i) + " ");
        }
    }
}