
import java.util.Scanner;

public class Average 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first person age = ");
        int a1 = scan.nextInt();
        System.out.print("Enter second person age = ");
        int a2 = scan.nextInt();
        System.out.print("Enter third person age = ");
        int a3 = scan.nextInt();
        
        double average = (double)(a1+a2+a3)/3;
        System.out.printf("Average age = %.2f%n",average);
    }
}
