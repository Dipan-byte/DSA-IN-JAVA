import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> count = new HashMap<>();

        for(int num : arr){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        boolean found = false;
        for(int key : count.keySet()){
            if(count.get(key) > n / 2){
                System.out.println("Majority Element: " + key);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("No majority element");
        }
    }
}
