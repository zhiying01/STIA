
import java.util.Scanner;

public class voting 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Age>");
        int age = scan.nextInt();
        System.out.print("Enter your Nationality>");
        String nation = scan.next() + scan.nextLine();
        
        //if want to compare string, need to use string method(equals)
        if ((age>=18) && (nation.equals("Malaysia") )){
            System.out.println("You can vote!!");
        }else{
            System.out.println("You cannot vote.");
        }
    }
}
