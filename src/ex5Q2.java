
import java.util.Scanner;

public class ex5Q2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the duration>");
        int duration = scan.nextInt();
        double charge=0;
        if (duration > 3){
            charge = 1.99 + 2.00 + (duration-3)*0.45 ;
        }else{
            charge = 1.99 + 2.00;
            
        }
        System.out.printf("You have to pay $%.2f\n",charge);
    }
}
