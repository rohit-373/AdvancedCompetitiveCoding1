import java.util.*;

public class ManachersBruteForce {
    static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }

    static String longestPalindrome(String s) {
        int n = s.length();
        String best = "";

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {  // substring s[i..j]
                if (j - i + 1 > best.length() && isPalindrome(s, i, j)) {
                    best = s.substring(i, j + 1);
                }
            }
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(longestPalindrome(sc.nextLine()));
    }
}
