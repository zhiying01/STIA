
import java.util.Scanner;

public class EX6T2 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        double sum = 0;
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter number of students: ");
        double N = scan.nextDouble();
        int i =1; 
        while (i<=N){
            System.out.print("Enter student " +i+ "number: ");
            double mark = scan.nextInt();
            sum = sum + mark;
            i++;}
        double avg = sum/N;
            System.out.println("Avgerage marks = "+avg);
        
        
    }
}
