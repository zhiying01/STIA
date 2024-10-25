
import java.util.Scanner;

public class Ex7T4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0,sum = 0, average = 0;
        boolean valid;
        valid = false;
        for (int i = 1; i <= 3; i++) {
                System.out.print("Enter the mark (0-100) for student " + i + ":");
                number = scan.nextInt();
                while (!(number >= 0) && (number <= 100)) {
                    System.out.println("Invalid! Please re-enter number");
                    System.out.println("Enter the mark (0=100) for student:");
                    number = scan.nextInt();
            }
                sum=sum+number;

        }
        average = sum/3;
    }
}
