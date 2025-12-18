import java.util.*;

public class MinSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int S = sc.nextInt();

        int left = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (sum >= S) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= arr[left++];
            }
        }

        if (minLen == Integer.MAX_VALUE)
            System.out.println("0");
        else
            System.out.println("Minimum Length: " + minLen);
    }
}
