import java.util.Scanner;
public class adding_array_elements{
    public static int[] i_array(int limit , Scanner input){
        int[] array = new  int[limit];
        for(int i=0 ; i<limit ; i++){
            array[i]=input.nextInt();
            // System.out.println(array[i]);
        }
        System.out.print("THE ARRAY IS : ");
        for(int i=0 ; i<limit ; i++){
            
            System.out.print(array[i] + " ");
        } 
        
        return array;
    }
    public static void addition(int[] array , int limit){
        int sum=0;
        for(int i=0 ; i<limit ; i++){
            sum = sum + array[i];
            
        }
        System.out.println("\nTHE ANSWER IS : " + sum);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE ARRAY LIMIT : ");
        int limit = input.nextInt();
        // int[] array = new array[limit];
        int[] array = i_array(limit , input);
        addition(array , limit);
        input.close();

    }
}