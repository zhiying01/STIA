
import java.util.Scanner;


public class Asg23 {
//Name: Ong Zhi Ying
//Matrix: 285836
//Asg23
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double Price[] = {56.80, 105.70, 93.50, 155.00, 87.50, 73.00};
        while (true) {
            System.out.print("\nEnter city number ( 1 to 6) : ");
            int cityNo = read.nextInt();
            if (cityNo < 1 || cityNo > 6) {
                System.out.println("City number should be between 1 and 6");
            } else {

                System.out.print("How many tickets do you want to book: ");

                int TicketsNum = read.nextInt();
                System.out.println("Price of each ticket for city " + cityNo + " is: RM " + Price[cityNo - 1]);

                System.out.println("Total Price of " + TicketsNum + " tickets for city " + cityNo + " is: RM " + (Price[cityNo - 1] * TicketsNum));

                break;

            }

        }

    }

}
