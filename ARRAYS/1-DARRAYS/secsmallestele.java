import java.util.*;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Integer min1 = null, min2 = null;

        for (int x : arr) {
            if (min1 == null || x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x != min1 && (min2 == null || x < min2)) {
                min2 = x;
            }
        }

        if (min2 == null)
            System.out.println("No second smallest");
        else
            System.out.println("Second Smallest: " + min2);
    }
}
