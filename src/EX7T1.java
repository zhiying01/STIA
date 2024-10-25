
import java.util.Scanner;

public class EX7T1 {

    public static void main(String[] args) {
        int total =0;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        total += number;
        System.out.print("Do you want to continue (Y/N)");
        String respond = scan.next();
        
        while (!respond.equals("N")){
            System.out.print("Enter an integer value: ");
            number = scan.nextInt();
            total += number;
            System.out.print("Do you want to continue (Y/N)");
            respond = scan.next();
        }
            System.out.println("Total:"+total);
    }
    
}
