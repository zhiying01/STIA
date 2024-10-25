
import java.util.Scanner;

public class Asg21 {
//Name: Ong Zhi Ying
//Matrix: 285836
//Asg21

    public static void main(String[] args) {
        int age;
        double employee_rate, employer_rate, salary, ceiling;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Employee's Salary : RM ");
            salary = scan.nextDouble();
            if (salary == -1) {
                System.out.println("Thank you");
                break;
            }
            if (salary > 10000) {
                ceiling = 10000;
            } else {
                ceiling = salary;
            }
            System.out.print("Enter Employee's Age    : ");
            age = scan.nextInt();
            if (age < 55) {
                employee_rate = ceiling * 20 / 100;
                employer_rate = ceiling * 17 / 100;
            } else if (age > 55 && age <= 60) {
                employee_rate = ceiling * 13 / 100;
                employer_rate = ceiling * 13 / 100;
            } else if (age > 60 && age <= 65) {
                employee_rate = ceiling * 7.5 / 100;
                employer_rate = ceiling * 9 / 100;
            } else {
                employee_rate = ceiling * 5 / 100;
                employer_rate = ceiling * 7.5 / 100;
            }
            double total = employee_rate+employer_rate;
            System.out.printf("Employee Contribution is : RM %.2f\n", employee_rate);
            System.out.printf("Employer Contribution is : RM %.2f\n", employer_rate);
            System.out.printf("The total contribution is : RM %.2f\n", total);
            System.out.println("");

        }

    }
}
