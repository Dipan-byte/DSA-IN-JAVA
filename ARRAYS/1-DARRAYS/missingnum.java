import java.util.*;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        boolean[] present = new boolean[n+1];

        for(int x : arr)
            if(x <= n) present[x] = true;

        for(int i = 1; i <= n; i++)
            if(!present[i]) System.out.print(i + " ");
    }
}
