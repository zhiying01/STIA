
import java.util.Scanner;


public class Asg12 
{
    /**
     * Ong Zhi Ying
     * 285836
     * Asg1.Q2
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter year: ");
        int year = scan.nextInt();
        if ((year<=9999)&&(year>=100)){
            System.out.println("Year: "+year);
            System.out.print("Enter month: ");
            int month = scan.nextInt();
            System.out.print("Enter day: ");
            int day = scan.nextInt();
            switch(month){
            case 1 : System.out.println("Month: January");
            if ((day >= 31)&&(day>0)){System.out.println("Day: "+day);
            }else{
            System.out.println("Invalid day");};break;
            case 2 : System.out.println("Month: February");
            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
                if((day >= 29)&&(day>0)); System.out.println("Day" +day);
            }else{
                if((day >= 28)&&(day>0));} System.out.println("Day" +day);
            break;
            case 3 : System.out.println("Month: March");
            if ((day >= 31)&&(day>0)){System.out.println("Day: "+day);
            }else{
            System.out.println("Invalid day");}; break;
            case 4 : System.out.println("Month: April");
            if ((day >= 30)&&(day>0)){System.out.println("Day: "+day);
            }else{
            System.out.println("Invalid day");}; break;
            case 5 : System.out.println("May");
            if ((day >= 31)&&(day>0)){System.out.println("Day: "+day);
            }else{
            System.out.println("Invalid day");} ;break;
            case 6 : System.out.println("June");
            if ((day >= 30)&&(day>0)){System.out.println("Day: "+day);
            }else{
            System.out.println("Invalid day");}; break;
            case 7 : System.out.println("July");
            if ((day >= 31)&&(day>0)){System.out.println("Day: "+day);
            }else{
            System.out.println("Invalid day");}; break;
            case 8 : System.out.println("August");
            if ((day >= 31)&&(day>0)){System.out.println("Day: "+day);
            }else{
            System.out.println("Invalid day");}; break;
            case 9 : System.out.println("September");
            if ((day >= 30)&&(day>0)){System.out.println("Day: "+day);
            }else{
            System.out.println("Invalid day");}; break;
            case 10 : System.out.println("October");
            if ((day >= 31)&&(day>0)){System.out.println("Day: "+day);
            }else{
            System.out.println("Invalid day");}; break;
            case 11 : System.out.println("November");
            if ((day >= 30)&&(day>0)){System.out.println("Day: "+day);
            }else{
            System.out.println("Invalid day");}; break;
            case 12 : System.out.println("December");
            if ((day >= 31)&&(day>0)){System.out.println("Day: "+day);
            }else{
            System.out.println("Invalid day");} ;break;
            default : System.out.println("Invalid Month!");
        }
        }else{
            System.out.println("Invalid Year");}
    }   
        
    }
