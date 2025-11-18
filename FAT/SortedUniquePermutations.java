import java.util.*;

public class SortedUniquePermutations {

    static void permute(String s, String curr, Set<String> result) {
        if (s.length() == 0) {
            result.add(curr);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i + 1);
            permute(left + right, curr + ch, result);
        }
    }
    // abc
    // abc, acb, bac, bca, cab, cba
    // rohit - , ch = h
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Set<String> result = new TreeSet<>();
        permute(input, "", result);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.toArray()[i]);
        }
    }
}
