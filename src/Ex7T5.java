
import java.util.Scanner;

public class Ex7T5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sn = 63, count = 0;
        int number;

            System.out.println("Key in your guess;");
            number = scan.nextInt();
            if (number < sn) {
                System.out.println("Try Higher.");
            } else if (number > sn) {
                System.out.println("Try Lower.");
            } else {
                System.out.println("Correct! You got it in" + count + " trails");
            }
            count++;
        
    }
    

}
