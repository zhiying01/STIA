
public class MyMath {
    public static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else  if ((bmi >= 18.5) && (bmi <= 24.9)) {
            return "Normal";
        } else  if ((bmi >= 25.0) && (bmi <= 29.9)) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    public static double BMI(double kg, double m) {
        double bmi = kg / (m * m);
        return bmi;
    }
    
    public static double convert(double rm, double rate) 
    {
        double usd  = rm * rate;
        return usd;
    }
    
    
    public static int add(int n1, int n2) 
    {
        
        return n1 + n2;
    }
    
    public static boolean isEven(int n1)
    {
//        if (n1 % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
        return (n1 % 2 == 0);
    }
            
}
