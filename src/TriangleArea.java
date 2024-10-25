
import java.util.Scanner;



public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("<<<<<<TRIANGLE AREA CALCULATION>>>>>>");

        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area);

        System.out.println("<<<<<<TRIANGLE SIDE CALCULATION>>>>>>");
        System.out.print("Enter side 1: ");
        double sideOne = scanner.nextDouble();

        System.out.print("Enter side 2: ");
        double sideTwo = scanner.nextDouble();

        double unknownSide = Math.sqrt(Math.pow(sideOne, 2) + Math.pow(sideTwo, 2));
        System.out.println("The length of the unknown side is: " + unknownSide);

        scanner.close();
    }
}
