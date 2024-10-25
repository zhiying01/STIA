
import java.util.Scanner;

public class ArrayProcessing {
    
    public static void highestStudentData(int[] marks,String[] n, String[] h){
        int maxIndex = 0;
        for (int i=1; i<marks.length; i++) {
            if (marks[i] > marks[maxIndex]) {
                maxIndex = i;
            }
        }
        
        System.out.println("Student with the highest mark:");
        System.out.println("Name = "+ n[maxIndex]);
        System.out.println("Hometown = "+ h[maxIndex]);
        System.out.println("Mark = "+ marks[maxIndex]);
    }
    
    public static int search(int[] lists, int matric) {
        for (int i=0; i< lists.length; i++) {
            if (lists[i] == matric) {
               return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[3];
        String[] names = {"Ali", "Abu", "Lim"};
        int[] matrics = {12345, 121212, 313131};
        String[] homes = {"Alor Setar", "Kangar", "Georgetown"};
        display(names);
        display(homes);
        
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter no "+(i+1)+": ");
            num[i] = scan.nextInt();
        }
        System.out.println("=============================");
        display(num);
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        double avg = ((double)sum)/num.length;
        System.out.println("Average mark = "+avg);
        highestStudentData(num, names, homes);
        System.out.println("Enter a matric");
        int matric = scan.nextInt();
        int i = search(matrics, matric);
        if (i >= 0) {
            System.out.println("Name = "+names[i]);
            System.out.println("Matric = "+matrics[i]);
            System.out.println("Hometown = "+homes[i]);
        } else {
            System.out.println("The student is not found!");
        }
        
       
    }
    
    public static void display(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void display(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
