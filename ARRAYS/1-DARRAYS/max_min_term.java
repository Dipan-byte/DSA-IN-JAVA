import java.util.Scanner ;
import java.util.Arrays ;
public class max_min_term{
    public static int[] arrayinput(int size , Scanner input){
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
    public static void sortarray(int[] array , int size){
        Arrays.sort(array);
        System.out.println("THE SORTED ARRAY IS :");
         for(int i=0 ; i<size ; i++){
            System.out.print(array[i] + " ");
        } 
        System.out.println("\n");
        System.out.println("THE MAX TERM IS : " + array[size-1]);
        System.out.println("THE Min TERM IS : " + array[0]);

    }   
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE ARRAY SIZE : ");
        int size = input.nextInt();

        if(size < 1) 
            System.out.println("Bhag");
        else {
            int array[] = arrayinput(size , input);
            printarray(array , size);
            sortarray(array , size);
        }

       
        input.close();
    }
    }
