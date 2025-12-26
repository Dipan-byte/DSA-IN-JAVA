import java.util.*;

public class PairWithDifferenceK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int k = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        for(int x: arr) set.add(x);

        for(int x: arr) {
            if(set.contains(x + k))
                System.out.print("(" + x + "," + (x+k) + ") ");
            if(set.contains(x - k))
                System.out.print("(" + x + "," + (x-k) + ") ");
        }
    }
}
