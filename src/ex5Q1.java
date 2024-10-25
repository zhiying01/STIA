import java.util.Scanner;

public class ex5Q1 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number>");
        int num = scan.nextInt();
        if (num>=1){
            System.out.println ("The number you enter is :" + num);
            System.out.println ("You enter the positive number");}
        else if (num<0){
            System.out.println ("The number you enter is :" + num);
            System.out.println ("You enter the negative number");}
        else {
            System.out.println ("The number you enter is :" + num);
            System.out.println ("You enter the zero number");}
        
    }
}
