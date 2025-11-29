import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n < 2) {
            System.out.println("No second largest");
            return;
        }

        Integer max1 = null; // largest
        Integer max2 = null; // second largest

        for (int x : arr) {
            if (max1 == null || x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x != max1 && (max2 == null || x > max2)) {
                max2 = x;
            }
        }

        if (max2 == null) {
            System.out.println("No second largest");
        } else {
            System.out.println(max2);
        }
    }
}
