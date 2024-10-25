
import java.util.Scanner;


/**
 * Ong Zhi Ying
 * 285836
 * Asg1.Q3
 */
public class Asg13 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter income: ");
        int income = scan.nextInt();
        System.out.print("Enter duration (in years): ");
        int years = scan.nextInt();
        if (years >10) {
            System.out.println("Max duration is 10 years !");
        }
        System.out.print("Enter loan amount: ");
        int loan = scan.nextInt();
        if (loan>50000){
            System.out.println("Max amount of loan is RM50000");
        }
        int amount =loan/years;
        System.out.print("Enter status (0-regular, 1-prefered): ");
        int customer = scan.nextInt();
        if (customer == 0){   
            if (income/12 < amount);{
            System.out.println("The loan is APPROVED");}
            }else{
            System.out.println("The loan is REJECTED");}
        if (customer == 1){  
            if (income/10 < amount);{
            System.out.println("The loan is APPROVED");}
            }else{
            System.out.println("The loan is REJECTED");}
    }
}