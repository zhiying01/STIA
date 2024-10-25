import java.util.Scanner;
public class Price 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter quantity of item bought: ");
        int numitem = scan.nextInt();
        
        double price = numitem * 25.50;
        System.out.printf("Price before discount: RM%.2f\n", price);
        double discount= price * 0.1;
        System.out.printf("Discount amount:RM%.2f\n",discount);
        price = price - discount;
        System.out.printf("Price after discount:RM%.2f\n",price);
        double tax = price*0.04;
        System.out.printf("The tax amount:RM%.2f\n",tax);
        price = price + tax;
        System.out.printf("Total Price = RM %.2f\n",price);
    }
}