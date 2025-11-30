import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};

        Integer largest = null, secondLargest = null;

        for (int num : arr) {
            if (largest == null || num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num != largest && (secondLargest == null || num > secondLargest)) {
                secondLargest = num;
            }
        }

        if (secondLargest == null)
            System.out.println("Not Applicable");
        else
            System.out.println("Second Largest: " + secondLargest);
    }
}
