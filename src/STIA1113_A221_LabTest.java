
import java.util.Scanner;

public class STIA1113_A221_LabTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayCategory, membership;

        System.out.print("Enter the number of hours: ");
        int hours = scanner.nextInt();

        while (hours < 0 || hours > 12) {
            System.out.println("Invalid hours. Enter 0 to 12 only.");
            System.out.print("Enter the number of hours: ");
            hours = scanner.nextInt();
        }
        while (hours != 0) {
            System.out.print("Enter Day Category: (1.Weekday 2.Weekend): ");
            dayCategory = scanner.nextInt();

            while ((dayCategory != 1) && (dayCategory != 2)) {
                System.out.println("Invalid day Category. Enter 1 or 2 only!");
                System.out.print("Enter Day Category: (1.Weekday 2.Weekend): ");
                dayCategory = scanner.nextInt();
            }

            System.out.print("Enter Membership (1.Yes 2.No): ");
            membership = scanner.nextInt();

            while ((membership != 1) && (membership != 2)) {
                System.out.println("Invalid customer type. Enter 1 or 2 only");
                System.out.print("Enter Membership (1.Yes 2.No): ");
                membership = scanner.nextInt();
            }

            double total_amount = 0;
            if (dayCategory == 1) {
                if (membership == 1) {
                    total_amount = hours * 3.50;
                } else {
                    total_amount = hours * 5.00;
                }
            } else {
                if (membership == 1) {
                    total_amount = hours * 4.50;
                } else {
                    total_amount = hours * 6.00;
                }
            }

            System.out.printf("The amount you have to pay is: RM%.2f\n\n", total_amount);

            System.out.print("Enter the number of hours: ");
            hours = scanner.nextInt();
            while (hours < 0 || hours > 12) {
                System.out.println("Invalid hours. Enter 0 to 12 only.");
                System.out.print("Enter the number of hours: ");
                hours = scanner.nextInt();
            }

        }
        System.out.println("Thank you and have a nice day!");
    }

}
