
import java.util.Scanner; //import java.util.Scanner; its util and not until
public class Ex2Q5 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Scanner baca = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String name = baca.nextLine();//"Ali";
        System.out.println("Enter the value of temperature in celcius:");
        double C = scan.nextDouble(); //24.5;
        double F;
        F = (double)9/5 *C +32;
        System.out.println("Hello " +name+ " Nice to meet you");
        System.out.println(C+" Celcius is equal to " +F+ " Fahrenheit");
    }
}
