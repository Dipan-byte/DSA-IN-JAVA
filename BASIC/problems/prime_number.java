import java.util.Scanner ;
public class prime_number{
    static void test( int num){

         if(num==1){
           System.out.println("NOT A PRIME NUMBER");
           
         }
         else if(num%2==0 && num!=2){
            System.out.println("NOT A PRIME NUMBER");
         }
         else{
            System.out.println("PRIME NUMBER");
         }
    }
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int num = scanner.nextInt();
         test(num);
        scanner.close(); 
    }
}