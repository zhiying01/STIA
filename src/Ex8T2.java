
import java.util.Scanner;

public class Ex8T2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the RM = ");
        double rm = scan.nextDouble();
        System.out.print("Enter the Rate =");
        double rate = scan.nextDouble();
        System.out.println("RM "+rm+ "is equal to USD" +MyMath.convert(rm, rate));
        double weight = scan.nextDouble();
        System.out.print("Enter your weight: ");
        double height = scan.nextDouble();
        System.out.print("Enter your height in meters: ");
        System.out.println("Your BMI is :"+MyMath.BMI(weight, height));
        
    }
    
}
