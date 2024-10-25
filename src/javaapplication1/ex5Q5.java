package javaapplication1;

import java.util.Scanner;

public class ex5Q5 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number >");
        int n1 = scan.nextInt();
        System.out.print("Enter second number >");
        int n2 = scan.nextInt();
        System.out.print("Enter the operation >");
        char op = scan.next().charAt(0);
        switch(op){
            case'+': System.out.println(n1+"+"+n2+" = "+(n1+n2));break;
            case'-': System.out.println(n1+"-"+n2+" = "+(n1-n2));break;
            case'*': System.out.println(n1+"*"+n2+" = "+(n1*n2));break;
            case'/': System.out.println(n1+"/"+n2+" = "+(n1/n2));break;
            default : System.out.println("Invalid operation!");

        }
    }
    
}
