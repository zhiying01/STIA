
import java.util.Scanner;

/**
 * Name: Ong Zhi Ying
 * Matrix: 285836
 * Asg1.Q1
 */
public class Asg11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        //make space foe entering old and new meter reading
        System.out.println("****** Syarikat Air Darulaman Payment System ******");
        System.out.print("Enter the old meter reading: ");
        double newmeter = scan.nextInt();
        System.out.print("Enter the new meter reading: ");
        double oldmeter = scan.nextInt();
        //calculate the unit consumed 
        double unitconsumed = (newmeter-oldmeter);
        System.out.printf("Unit consumed: %.2f\n",unitconsumed);
        System.out.println("-----------------------------------------------------");
        double charge=0; //the appropriate amount to charge
        if ((unitconsumed > 1000)&&(unitconsumed<2000)){
            charge = (1000)*0.05 + (unitconsumed-1000)*0.07 ;
            System.out.printf("Total charge: RM%.2f\n",charge);
        }else if (unitconsumed<=1000){
            charge = unitconsumed*0.05;
            System.out.printf("Total charge: RM%.2f\n",charge);
        }else{
            charge = (1000)*0.05 + (1000)*0.07+ (unitconsumed-2000)*0.10;
            System.out.printf("Total charge: RM%.2f\n",charge);
        }{
        //amount given by customer as payment
        System.out.print("Enter amount tendered: RM");
        double amounttender = scan.nextInt();
        System.out.printf("Amount tender:RM%.2f\n",amounttender);
        System.out.printf("Charge:RM%.2f\n",charge);
        double change = (amounttender-charge);
        //enough or not enough money given
        if (amounttender>=charge){
            System.out.println("-----------------------------------------------------");
            System.out.printf("Change amount: RM%.2f\n",change);
            System.out.println("****** Thank You ******");
        }else{
            System.out.printf("Amount tender: RM%.2f\n",amounttender);
            System.out.println("Sorry, amount tendered must be more or equal the total charge!");
        }
        }
    }
}
