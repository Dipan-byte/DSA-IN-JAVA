import java.util.Scanner;
public class circle_area{
    public static void arae(int Radius){
        System.out.println("THE AREA OF THE CIRCLE IS : " + (3.14*(Radius*Radius)));
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE RADIUS : ");
        int Radius = input.nextInt();
        arae(Radius);
        input.close();
    }
}