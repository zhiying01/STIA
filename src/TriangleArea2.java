import java.util.Scanner;

public class TriangleArea2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height, side1, side2, area, unknownSide;
        String choice;

        do {
            System.out.println("<<<<<<TRIANGLE AREA CALCULATION>>>>>>");
            System.out.print("Enter base of triangle: ");
            base = input.nextDouble();

            System.out.print("Enter height of triangle: ");
            height = input.nextDouble();
            
            System.out.println("<<<<<<TRIANGLE SIDE CALCULATION>>>>>>");

            System.out.print("Enter side 1: ");
            side1 = input.nextDouble();

            System.out.print("Enter side 2: ");
            side2 = input.nextDouble();

            area = 0.5 * base * height;
            System.out.println("The area of the triangle is: " + area);

            unknownSide = Math.sqrt(side1*side1 + side2*side2);
            System.out.println("The length of the unknown side is: " + unknownSide);

            System.out.print("Do you want to continue? (Y/N): ");
            choice = input.next();
        } while (choice.equalsIgnoreCase("Y"));

        System.out.println("You choose to stop. Thank you.");
    }
}
