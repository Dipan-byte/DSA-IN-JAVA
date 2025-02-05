import java.util.Scanner ;
public class inputoutput{
    public static String[] arrayinput(int size , Scanner sc){
        String inputarray[]= new String[size] ;
        for(int i=0 ; i<size ; i++){
            System.out.println("ENTER THE ARRAY NUMBER AT THE INDEX : " + i);
             inputarray[i]=sc.next();
        }
        return inputarray ;
    }
    public static void arraypaste(String array[] , int size){
        String pastearray[]= array ;
        System.out.println("THE ARRAY IS : ");
        for(int i=0 ; i<size ; i++){
            System.out.print(pastearray[i] + " ");
        }
            System.out.print("\n") ;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER THE ARRAY SIZE : ");
        int size= sc.nextInt();
        String array[] = arrayinput(size , sc);
        arraypaste(array , size );
        sc.close();
    }
    
}