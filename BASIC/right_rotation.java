import java.util.*;

public class RotateArrayRight {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        if (n == 0) {
            return;
        }

        k = k % n;
        if (k < 0) {
            k += n; // handle negative k if needed
        }

        // Step 1: reverse whole array
        reverse(arr, 0, n - 1);
        // Step 2: reverse first k elements
        reverse(arr, 0, k - 1);
        // Step 3: reverse remaining elements
        reverse(arr, k, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i != n - 1) System.out.print(" ");
        }
    }
}
