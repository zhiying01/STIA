
import java.util.Scanner;


public class Ex7T3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number=0;
        boolean
        valid = false;
        while(!valid){
        System.out.print("Enter the number: ");
        number = scan.nextInt();
        if ((number>=0)&&(number<=100))
        valid = true;
        else
                System.out.println("Invalid input");
    }
        System.out.println("number:"+number);
    }
}
