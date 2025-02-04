import java.util.Scanner ;
public class inputoutput{
    public static String[] arrayinput(int size){
        String inputarray[]= new String[size] ;
        for(int i=0 ; i<n ; i++){
             inputarray[]=sc.next();
        }
        return inputarray[];
    }
    public static void arraypaste(String array[] int size){
        String pastearray[]= array[] ;
        for(int i=0 ; i<size ; i++){
            System.out.print(pastearray[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(system.in);
        int size= sc.nextInt();
        String array[] = arrayinput(size);
        arraypaste(array[] size );
        
    }
    
}