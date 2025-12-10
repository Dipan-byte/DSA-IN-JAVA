import java.util.*;

public class FirstRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Map<Integer, Integer> freq = new HashMap<>();

        for (int x : arr)
            freq.put(x, freq.getOrDefault(x, 0) + 1);

        boolean found = false;

        for (int x : arr) {
            if (freq.get(x) > 1) {
                System.out.println("First Repeating Element: " + x);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("No repeating element");
    }
}
