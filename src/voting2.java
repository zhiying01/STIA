
import java.util.Scanner;

public class voting2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Age>");
        int age = scan.nextInt();
        if((age>=18)){
        System.out.print("Enter your Nationality>");
        String nation = scan.next() + scan.nextLine();
        
        //if want to compare string, need to use string method(equals),equalsIgnoreCase(didnt look at capitalization)
        if ((nation.equalsIgnoreCase("Malaysia"))){ 
            System.out.println("You can vote!!");
        }else{
            System.out.println("You cannot vote!");
        }
        }else{
            System.out.println("You cannot vote!!");
                }        }
}
