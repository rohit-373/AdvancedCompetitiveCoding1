import java.util.*;

public class AliceAppleTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int K = sc.nextInt();
        int N = sc.nextInt();
        int S = sc.nextInt();
        int W = sc.nextInt();
        int E = sc.nextInt();

        int minAns = 0;
        if (M <= S*K) {
            minAns = M;
        } else if (M <= S*K+W+E) {
            minAns = S*K-(M-S*K)*K;
        } else {
            minAns = -1;
        }

        System.out.println(minAns);
    }
}