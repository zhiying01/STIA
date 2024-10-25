
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter month: ");
        String month = scan.next();
        switch(month.toLowerCase()){
            case "january" : System.out.println("Month 1");break;
            case "february" : System.out.println("Month 2");break;
            case "march" : System.out.println("Month 3");break;
            case "april" : System.out.println("Month 4");break;
            case "may" : System.out.println("Month 5");break;
            case "june" : System.out.println("Month 6");break;
            case "july" : System.out.println("Month 7");break;
            case "august" : System.out.println("Month 8");break;
            case "september" : System.out.println("Month 9");break;
            case "october" : System.out.println("Month 10");break;
            case "november" : System.out.println("Month 11");break;
            case "december" : System.out.println("Month 12");break;
            default : System.out.println("Invalid Month!");
        }
    }
    
}
