
import java.util.Scanner;

public class EX6T4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any positive integer: ");
        int number;
        number = scan.nextInt();
        for (int i = 1; i <= 10; i++) { //i=10; i>1; i--
            System.out.println(number + "X" + i + "= " + (number * i));
        }
    }
}
