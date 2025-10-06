import java.util.*;
// aabccddd
// {2, 1, 2, 3, 0, ..}
public class FirstPalindromicString {
    static String makePalindrome(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        String firstHalf = "";
        String middleChar = "";
        String lastHalf = "";
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                if (middleChar.equals("")) {
                    middleChar = "" + (char) (i + 'a');
                } else {
                    return "-1";
                }
            }
            for (int j = 0; j < freq[i] / 2; j++) {
                firstHalf = firstHalf + (char) (i + 'a');
                lastHalf = (char) (i + 'a') + lastHalf;
        // firstHalf = "ac"
        // middleChar = "b"
        // lastHalf = "ca"
            }
        }
        // "ac" + "b" + "ca" "acbca"
        return firstHalf + middleChar + lastHalf;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        System.out.println(makePalindrome(s));
    }
}