import java.util.*;

/**
 * 13 * 12
 * (10 + 3)(10 + 2)
 * (a*10+b)(c*10+d) = ac*100 + (ad + bc)*10 + bd
 * (a*10+b)(c*10+d) = ac*100 + ((a+b)(c+d) - ac - bd)*10 + bd
 * (1 + 3)(1 + 2)
 * (a+b)(c+d) = ac + ad + bc + bd
 */

public class KaratsubaAlgorithm {
    static int karatsuba(int x, int y) {
        // Base case for recursion
        if (x < 10 || y < 10) {
            return x * y;
        }

        // Calculate the size of the numbers
        // x = 1312 5356 
        // y = 53 2536
        int maxLen = Math.max(String.valueOf(x).length(), String.valueOf(y).length());
        // maxlen = 8
        int halfLen = maxLen / 2;
// halflen = 4

        // Split the digit sequences in the middle
        int a = x / (int) Math.pow(10, halfLen);
        int b = x % (int) Math.pow(10, halfLen);
        int c = y / (int) Math.pow(10, halfLen);
        int d = y % (int) Math.pow(10, halfLen);

        // 3 recursive calls to numbers approximately half the size
        int ac = karatsuba(a, c);
        int bd = karatsuba(b, d);
        int ab_cd = karatsuba(a + b, c + d);

        // Combine the three products to get the final result
        return ac * (int) Math.pow(10, 2 * halfLen) + (ab_cd - ac - bd) * (int) Math.pow(10, halfLen) + bd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(karatsuba(m, n));
    }
}