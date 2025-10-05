import java.util.*;

public class SwapNibbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstHalf = n & 0xF0;
        int secondHalf = n & 0x0F;
        System.out.println((firstHalf >> 4) | (secondHalf << 4));
    }
}