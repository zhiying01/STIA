
import java.util.Scanner;

public class Hello2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Hello.sayGreeting("John", 1);
        System.out.print("Enter your weight = ");
        double weight = scan.nextDouble();
        System.out.print("Enter your height = ");
        double height = scan.nextDouble();
        double bmi = MyMath.BMI(weight, height);
        System.out.println("Your BMI = "+bmi);
        System.out.println("Your status = "+MyMath.getStatus(bmi));
        System.out.print("Enter the RM = ");
        double rm = scan.nextDouble();
        System.out.print("Enter the rate = ");
        double rate = scan.nextDouble();
        System.out.println("RM"+rm+ " is equal to USD"+MyMath.convert(rm, rate));
        System.out.println("Enter the first number> ");
        int a = scan.nextInt();
        System.out.println("Enter the second number> ");
        int b = scan.nextInt();
        //int result = MyMath.add(a, b);
        System.out.println(a+ " + "+b+" = "+MyMath.add(a, b));
        if (MyMath.isEven(a)) {
            System.out.println(a+ " is an even number.");
        } else {
            System.out.println(a+ " is an odd number.");
        }
        
    }
    
}
