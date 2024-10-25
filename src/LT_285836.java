
import java.util.Scanner;

public class LT_285836 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double amount = 0.00;
        double charge = 0.00;
        double mwy = 3.50;//member weekday
        double mwe = 4.50;//member weekend
        double nmwy = 5.00;//non member weekday
        double nmwe = 6.00;//non member weekend
        int hours, day, member;
        boolean valid;
        valid = false;
        while (!valid) {
            System.out.print("Enter the number of hours: ");
            hours = scan.nextInt();
            if ((hours >= 1) && (hours <= 12)) {
                valid = true;

            } else if (hours > 1) {
                System.out.println("Invalid hours. Enter 0 to 12 only");
            } else {
                System.out.println("Thank you and have a nice day");
            }
            
            System.out.print("Enter Day Category: (1.Weekday 2.Weekend): ");
            day = scan.nextInt();
            System.out.print("Enter Membership: (1.Yes 2.No):");
            member = scan.nextInt();
            if ((day >= 1) && (member >= 1)) {
                amount = amount + mwy;
            } else if ((day <= 2) && (member >= 1)) {
                amount = amount + mwe;
            } else if ((day >= 1) && (member <= 2)) {
                amount = amount + nmwy;
            } else if ((day <= 2) && (member <= 2)) {
                amount = amount + nmwe;
            } else {
                System.out.println("Invalid day category. Enter 1 or 2 only");
            }
            charge = amount * hours;

        }
        System.out.printf("The amount you have to pay is =RM%.2f\n ", charge);
    }
}
