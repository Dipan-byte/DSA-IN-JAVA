import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        boolean found = false;

        for (int x : arr) {
            if (set.contains(target - x)) {
                System.out.println("Pair found: " + (target - x) + " " + x);
                found = true;
                break;
            }
            set.add(x);
        }

        if (!found)
            System.out.println("No pair found");
    }
}
