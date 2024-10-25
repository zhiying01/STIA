
import java.util.Scanner;

public class ReverseOrder {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the data size: ");
        int size = read.nextInt();
        //int item0, item1, item2, item3, item4;
        int[] item = new int[size];
        String[] names = {"Ali", "Abu", "Ahmad"};
        int sum = 0;

        System.out.println(names[0]+"Enter five integers one number per line");

//        item[0] = read.nextInt();
//        item[1] = read.nextInt();
//        item[2] = read.nextInt();
//        item[3] = read.nextInt();
//        item[4] = read.nextInt();
        for (int i = 0; i < item.length; i++) {
            item[i] = read.nextInt();
        }
        for (int i = 0; i < item.length; i++) {
            sum = sum + item[i];
        }

//        sum = sum + item[0];
//        sum = sum + item[1];
//        sum = sum + item[2];
//        sum = sum + item[3];
//        sum = sum + item[4];
        System.out.println("The sum of the numbers = " + sum);
        System.out.println("The numbers in reverse order are: ");
//        System.out.println(item[4] + " " + item[3] + " " + item[2] + " " + item[1] + " " + item[0]);
        for (int i = item.length - 1; i >= 0; i--) {
            System.out.print(item[i] + "");
        }
        System.out.println("");
    }
}
