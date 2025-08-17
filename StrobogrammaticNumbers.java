import java.util.*;

class StrobogrammaticNumbers {
    public static ArrayList<String> findList(int n, int length) {
        if (n == 0) {
            return new ArrayList<>(Arrays.asList(""));
        } 
        if (n == 1) {
            return new ArrayList<>(Arrays.asList("0", "1", "8"));
        }
        ArrayList<String> prev = findList(n - 2, length);
        ArrayList<String> result = new ArrayList<>();
        for (String s : prev) {
            if (n != length) {
                result.add("0" + s + "0");
            }
            result.add("1" + s + "1");
            result.add("6" + s + "9");
            result.add("8" + s + "8");
            result.add("9" + s + "6");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> strobogrammaticNumbers = findList(n, n);
        System.out.println(strobogrammaticNumbers);
    }
}