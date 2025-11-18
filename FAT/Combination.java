import java.util.*;

public class Combination {

    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> curr = new ArrayList<>();

    static void combine(int[] arr, int start, int r) {
        if (curr.size() == r) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            curr.add(arr[i]);
            combine(arr, i + 1, r);
            curr.remove(curr.size() - 1);
        }
    }
    /*
    [1, 2, 3, 4], r = 2
    [[1, 2],
    [1, 3],
    [1, 4],
    [2, 3],
    [2, 4],
    [3, 4]]

    curr = [1,]
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int r = sc.nextInt();

        combine(arr, 0, r);

        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
