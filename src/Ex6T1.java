
import java.util.Scanner;


public class Ex6T1 
{
    public static void main(String[] args) {
        int sum = 0;
    
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N :");
        int N = scan.nextInt();
        int i = 1;
        while (i<=N){
            System.out.print("Enter a number: ");
            int number = scan.nextInt();
            sum = sum + number;
            i++;}
            System.out.println("Sum= "+sum);
}
}
