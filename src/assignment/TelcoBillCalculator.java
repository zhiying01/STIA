package assignment;

import java.util.Random;
import java.util.Scanner;

public class TelcoBillCalculator {
    private TelcoBill[] arrTelcoBill;
    private int i;
    private Scanner scanner;
    private Random random;

    public TelcoBillCalculator() {
        arrTelcoBill = new TelcoBill[100];
        i = 0;
        scanner = new Scanner(System.in);
        random = new Random();
    }

    public String generateBillNo(String custIC, String custName) {
        String billNo = "";

        int birthMonth = Integer.parseInt(custIC.substring(2, 4));
        int birthYear = Integer.parseInt(custIC.substring(0, 2));

        String nameAbbreviation = custName.substring(0, Math.min(custName.length(), 3));

        int randomNumber = random.nextInt(100);

        billNo = nameAbbreviation + String.format("%02d%02d%02d", birthMonth, birthYear, randomNumber);

        return billNo;
    }

    public void addBill(TelcoBill bill) {
        arrTelcoBill[i] = bill;
        i++;
        System.out.println("Bill added successfully.");
    }

    public void printArray() {
        System.out.println("===================================================");
        System.out.printf("%-9s %-8s %-11s %-12s %-8s %-5s %-11s %-11s %-13s%n",
                "Bill No", "Cust IC", "Cust Name", "Cust Phone", "Package", "Plan",
                "Data Usage", "Call Usage", "Total Payment");
        System.out.println("===================================================");

        for (int j = 0; j < i; j++) {
            System.out.println(arrTelcoBill[j].toString());
        }

        System.out.println("===================================================");
    }

    public static void main(String[] args) {
        TelcoBillCalculator calculator = new TelcoBillCalculator();
        calculator.run();
    }

    public void run() {
        int choice;
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Generate Bill");
            System.out.println("2. Display Bill ");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter customer's IC: ");
                    String custIC = scanner.nextLine();
                    System.out.print("Enter customer's name: ");
                    String custName = scanner.nextLine();
                    System.out.print("Enter customer's phone number: ");
                    String custPhone = scanner.nextLine();
                    System.out.print("Enter Telco package (A/B): ");
                    char telcoPackage = scanner.next().charAt(0);
                    System.out.print("Enter plan (1/2): ");
                    int plan = scanner.nextInt();
                    System.out.print("Enter data usage (in GB): ");
                    int dataUsage = scanner.nextInt();
                    System.out.print("Enter call usage (in minutes): ");
                    int callUsage = scanner.nextInt();

                    String billNo = generateBillNo(custIC, custName);
                    TelcoBill telcoBill = new TelcoBill(billNo, custIC, custName, custPhone, telcoPackage,
                            plan, dataUsage, callUsage);

                    if (telcoPackage == 'A') {
                        telcoBill.calculateHomeWifi();
                    } else if (telcoPackage == 'B') {
                        telcoBill.calculatePostpaidMobile();
                    }

                    addBill(telcoBill);
                    break;

                case 2:
                    printArray();
                    break;

                case 0:
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
