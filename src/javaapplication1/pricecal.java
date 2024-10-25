package javaapplication1;

import java.util.Scanner;

public class pricecal 
        //unitprice = 1.50
        //get qty
        //cal price = qty * unitprice
        //ca;price = price - (price *10%)
        //output price
    {
    public static void main(String[] args) 
    {
        Scanner scan= new Scanner(System.in);
        double balance = 1000;
        System.out.print("Enter the withdraw amount>");
        int amount = scan.nextInt();
        //calculate rm100 = withdrawAmount/100
        if ((amount % 10 == 0) && (amount<balance) && (amount<=5000))
        {
            int rm100 = amount / 100;
            // calculate rm 10= withdrawAmount % 100 / 10
            int rm10 = amount % 100/10;
            //output rm100.rm10
            System.out.println("RM100 = "+rm100+"RM10 = " +rm10);
        }    else{
            System.out.println("amount is invalid");
        }
    }
    }
