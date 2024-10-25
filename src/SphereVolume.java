
import java.util.Scanner;


public class SphereVolume 
{
    public static void main(String[] args) 
    {  //input radius
        final double Pi = 3.142;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the sphere radius>");
        double radius = scan.nextDouble();
        
        //calculate the volume = (4/3)*pie*(r*r*r)
        double volume = Pi*4/3*Math.pow(radius,3);
        
        //output volume
        System.out.printf("Volume of sphere with radius %.3f is %.3f\n",radius,volume);
        
        
    }
}
