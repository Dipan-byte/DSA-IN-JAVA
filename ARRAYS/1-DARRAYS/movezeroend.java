import java.util.*;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;

        // Move non-zero elements
        for (int x : arr) {
            if (x != 0) {
                arr[index++] = x;
            }
        }

        // Fill remaining with zeros
        while (index < n) {
            arr[index++] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
