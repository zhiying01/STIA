
import java.util.Scanner;

public class Ex7T2 {
    public static void main(String[] args) {
        int min = 100, max =0;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        while (number != -1){
            if (number>max){
                max = number;
            }
            if (number<min);{
                min = number;
        }
            number = scan.nextInt();
            System.out.println("Min:"+min+ "Max:"+max);
        }
    }
}
