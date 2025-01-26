import java.util.Scanner;
public class square_of_a_number{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.print("ENTER YOUR NUMBER : ");
     int num = scanner.nextInt();
     System.out.println("square is = " + (num*num) );
     scanner.close();
    }
}