import java.util.*;

public class MajorityElement {
    static int majorityElement(int[] A) {
        int m = -1;
        int counter = 0;
        for (int j = 0; j < A.length; j++) {
            if (counter == 0) {
                m = A[j];
                counter = 1;
            } else if (m == A[j]) {
                counter++;
            } else {
                counter--;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(majorityElement(A));
    }
}