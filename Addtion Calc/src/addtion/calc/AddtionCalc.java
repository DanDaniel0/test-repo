
package addtion.calc;
import java.util.Scanner;
public class AddtionCalc {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
      
        System.out.println("First num to add");
        double val1 = scan.nextDouble();
        System.out.println("Second num to add");
        double val2 = scan.nextDouble();
        System.out.println("="+Add(val1,val2));
    }
    public static double Add(double num1, double num2)
    {
        return(num1+num2);
    }
    
} 
