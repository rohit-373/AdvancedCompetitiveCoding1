import java.util.*;

class BinaryPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(s);
        if (s.equals(sb.reverse().toString())) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}