import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++) a[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i < n2; i++) b[i] = sc.nextInt();

        Set<Integer> setA = new HashSet<>();
        for (int x : a) setA.add(x);

        Set<Integer> result = new LinkedHashSet<>();

        for (int x : b) {
            if (setA.contains(x))
                result.add(x);
        }

        for (int x : result)
            System.out.print(x + " ");
    }
}
