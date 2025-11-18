import java.util.*;

public class MoveHyphen {
    static String moveFront(String s) {
        String ans = "";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                count++;
            } else {
                ans += s.charAt(i) + "";
            }
        }
        
        for (int i = 0; i < count; i++) {
            ans = "-" + ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = moveFront(s);
        System.out.println(s);
    }
}