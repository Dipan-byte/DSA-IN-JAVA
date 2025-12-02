import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Map<Integer, Integer> freq = new TreeMap<>(); // auto sorted

        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        for (int key : freq.keySet()) {
            System.out.println(key + " -> " + freq.get(key) + " times");
        }
    }
}
