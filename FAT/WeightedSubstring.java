import java.util.*;

public class WeightedSubstring {
    static int maxSum(String P, String Q, int K, int N) {
        HashSet<String> ans = new HashSet<>();

        for (int i = 0; i < N; i++) {
            int sum = 0;
            String s = "";
        
            for (int j = i; j < N; j++) {
                int pos = P.charAt(j) - 'a'; // pos = 1 for b
                sum += Q.charAt(pos) - '0'; // Q[1]

                // int weight = P.charAt(j) - 'a' + 1; 
                // sum += weight;
                
                s += P.charAt(j); // s = "a", "ab", 

                if (sum <= K) {
                    ans.add(s);
                } else {
                    break;
                }
            }
        }
        return ans.size();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P = sc.next();
        String Q = sc.next();
        int K = sc.nextInt();
        int ans = maxSum(P, Q, K, P.length());
        System.out.println(ans);
    }
}