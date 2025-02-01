import java.util.Scanner;
public class printing_table_of_number{
    public static void Table(int limit , int number ){
        for(int i=0 ; i<=limit ; i++){
            int answer = number*i ;
            System.out.println(number + "*" + i + "=" + answer);
        }
    }
    public static void main( String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int number= input.nextInt() ;
        System.out.print("ENTER THE LIMIT : ");
        int limit= input.nextInt() ;
        Table(limit , number );
    }
}