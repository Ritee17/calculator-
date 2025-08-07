import java.util.Scanner;

public class Subtraction {
    
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result = subtract(num1, num2);
        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
        
        scanner.close();
    }
}
