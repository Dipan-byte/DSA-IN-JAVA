import java.util.Scanner;
import java.util.Arrays ;
public class checkingaccendingorder{
     public static int[] inputarray(int size , Scanner input){
        int inputarray[] = new int[size] ;
        for(int i=0 ; i<size ; i++){
            System.out.println("ENTER THE ELEMENT AT THE INDEX : " + i);
            inputarray[i]= input.nextInt();
        }
        return inputarray ;
    }
    public static void printarray(int[] array , int size){
        System.out.println("THE ARRAY IS : " );
        for(int i=0 ; i<size ; i++){
            System.out.print(array[i] + " ");
            
        
        } 
        System.out.print("\n");
        
    }
    public static void check(int[] array , int size){
        int oldarray[]= array ;
        Arrays.sort(array);
        System.out.println("THE SORTED ARRAY IS :");
         for(int i=0 ; i<size ; i++){
            System.out.print(array[i] + " ");
        } 
        System.out.println("");
        if( oldarray==array){
            System.out.println("THE ARRAY IS IN ACCENDING ORDER");
        }
        else{
            System.out.println("THE ARRAY IS NOT IN ACCENDING ORDER");
        }
    }
   public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER THE ARRAY SIZE : ");
    int size = input.nextInt();
    int array[]=inputarray(size , input);
    printarray( array , size);
    check(array , size );

   } 
}