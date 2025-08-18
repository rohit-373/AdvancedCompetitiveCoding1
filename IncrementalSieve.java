import java.util.*;

public class IncrementalSieve {
    private Map<Integer, List<Integer>> composites = new HashMap<>();
    private int current = 2;

    public int nextPrime() {
        while (true) {
            if (!composites.containsKey(current)) {
                // current is prime
                composites.put(current * current, new ArrayList<>(Arrays.asList(current)));
                return current++;
            } else {
                for (int p : composites.get(current)) {
                    composites.computeIfAbsent(p + current, key -> new ArrayList<>()).add(p);
                }
                composites.remove(current);
            }
            current++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        IncrementalSieve sieve = new IncrementalSieve();
        for (int i = 0; i < n; i++) {
            System.out.print(sieve.nextPrime() + " ");
        }
    }
}
