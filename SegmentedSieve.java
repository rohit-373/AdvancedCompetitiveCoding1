import java.util.*;

public class SegmentedSieve {
    // Simple sieve to find all primes up to sqrt(n)
    private static List<Integer> simpleSieve(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) primes.add(i);
        }
        return primes;
    }

    // Segmented sieve for range [low, high]
    public static List<Integer> segmentedSieve(int low, int high) {
        int limit = (int)Math.sqrt(high) + 1;
        List<Integer> primes = simpleSieve(limit);

        boolean[] isPrime = new boolean[high - low + 1];
        Arrays.fill(isPrime, true);

        for (int prime : primes) {
            int start = Math.max(prime * prime, ((low + prime - 1) / prime) * prime);
            for (int j = start; j <= high; j += prime) {
                isPrime[j - low] = false;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = low; i <= high; i++) {
            if (i > 1 && isPrime[i - low]) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter low and high: ");
        int low = sc.nextInt();
        int high = sc.nextInt();
        List<Integer> primes = segmentedSieve(low, high);
        System.out.println("Primes in range:");
        for (int p : primes) {
            System.out.print(p + " ");
        }
    }
}