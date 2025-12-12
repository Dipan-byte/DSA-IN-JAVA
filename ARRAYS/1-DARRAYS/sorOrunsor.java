import java.util.*;

public class SortedRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1])
                count++;
        }

        if (arr[n - 1] > arr[0])
            count++;

        if (count == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
