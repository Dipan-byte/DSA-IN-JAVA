import java.util.*;

public class LongestConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        for (int x : arr)
            set.add(x);

        int longest = 0;

        for (int x : set) {
            if (!set.contains(x - 1)) { // start of sequence
                int current = x;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        System.out.println("Longest Consecutive Length: " + longest);
    }
}
